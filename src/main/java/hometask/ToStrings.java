package hometask;

public class ToStrings {

    public String converter(Object obj) {
        if (obj == null) {
            return "null";
        }
        Class<?> aClass = obj.getClass();
        ToString annotation = aClass.getAnnotation(ToString.class);
        if (annotation == null) {
            return obj.toString();
        }
        StringBuilder result = new StringBuilder();
        result.append(aClass.getName());
        result.append("[");
        if (annotation.includeName()) {

        }
        return result.toString().substring(9);



    }
}
