package com.pjy.mallsystem.common.exception;

import com.pjy.mallsystem.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@Slf4j
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.warn("数据校验错误");
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> errorMap = new HashMap<String, String>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(400, "数据校验出现问题").put("data", errorMap);
    }

    @ExceptionHandler(value = Exception.class)
    public R handleException(Exception e){
        log.warn("未知异常");
        HashMap<String, String> errorMap = new HashMap<String, String>();
        errorMap.put("message",e.getMessage());
        return R.error(400, "未知异常").put("data", errorMap);
    }


}
