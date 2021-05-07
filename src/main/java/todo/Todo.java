package todo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(TodoContainer.class)
@Target(ElementType.METHOD)
public @interface Todo {
    String message() default "нет записей";
}
