package com.pjy.mallsystem.common.validation.validator;


import com.pjy.mallsystem.common.validation.annotation.EnumValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * 自定义校验器
 * 读取注解的values
 * 校验：提交的值是否在注解的values中
 * */
public class EnumConstraintValidator implements ConstraintValidator<EnumValue,Integer> {
    private Set<Integer> enumSet = new HashSet<>();

//    初始化 读取注解的values
    @Override
    public void initialize(EnumValue constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        for (int value:values) {
            enumSet.add(value);
        }
    }
//    校验 提交的值：value
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return enumSet.contains(value);
    }
}
