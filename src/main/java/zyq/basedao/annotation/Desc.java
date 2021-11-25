package zyq.basedao.annotation;

import java.lang.annotation.*;

/**
 * @authoradmin
 * @date 2021/11/25 23:19
 * @description Desc
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Desc {
    enum Color {
        White, Grayish, Yellow
    }

    // 默认颜色是白色的
    Color c() default Color.White;
}