package com.pjy.mallsystem.common.validation.annotation;

import com.pjy.mallsystem.common.validation.validator.EnumConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 自定义校验注解
 *
 * 校验：必须为values中指定的值
 *
 */
@Documented
@Constraint(validatedBy = {EnumConstraintValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface EnumValue {

    String message() default "只能提交指定的值";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    int[] values() default { };
}
