package hometask;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class ToStrings {

    public static String converter(Object object) {
        if (object == null) {
            return "null";
        }
        Class<?> aClass = object.getClass();
        ToString annotation = aClass.getAnnotation(ToString.class);
        if (annotation == null) {
            return object.toString();
        }
        StringBuilder result = new StringBuilder();

        if (annotation.includeName()) {
            result.append(object.getClass().getName());
        }
        result.append("[");
        for (Field declaredField : aClass.getDeclaredFields()) {
            annotation = declaredField.getAnnotation(ToString.class);
            if (annotation != null && annotation.includeName()) {

                try {
                    result.append(declaredField.getName()).append(" = ").append(declaredField.get(object)).append(", ");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
        if (!result.substring(result.length() - 1, result.length()).equals("[")){
            result = new StringBuilder(result.substring(0, result.length() - 2));
        }
        result.append("]");

        return result.toString();
    }
}
