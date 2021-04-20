package hometask;

public class ToStrings {

    public static String toString(Object obj){
        if (obj == null){
            return "null";
        }
        Class<?> aClass = obj.getClass();
        ToString annotation = aClass.getAnnotation(ToString.class);
        if (annotation == null) {
            return obj.toString();
        }
        StringBuilder result = new StringBuilder();
        if(annotation.includeName()){
            result.append(aClass.getName());
        }
        result.append("[");
        //getDeclaredFields
        //f.getAnnotation()
        return null;
    }
}
