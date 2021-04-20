package hometask;

public class ToStrings {

    public static String toString(Object obj) {
        Point point = new Point();
        if (obj == null) {
            return "null";
        }
        Class<?> aClass = obj.getClass();
        ToString annotation = aClass.getAnnotation(ToString.class);
        if (annotation == null) {
            return obj.toString();
        }
        StringBuilder result = new StringBuilder();
        if (annotation.includeName()) {
            result.append(aClass.getName());
        }
        result.append(" [x = " + point.x + ", y = " + point.y + "]");
        return result.toString();
    }
}
