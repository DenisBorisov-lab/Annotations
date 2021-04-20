package demo;

import java.lang.reflect.Field;

public class Demo {
    @FieldCustomValue
    public String a;

    @FieldCustomValue("привет")
    public String b;

    public static void main(String[] args) throws IllegalAccessException {
        Demo demo = new Demo();
        Field[] fields = Demo.class.getFields();
        for (Field field : fields) {
            FieldCustomValue annotation = field.getAnnotation(FieldCustomValue.class);
            field.set(demo, annotation.value());
        }

        System.out.println(demo.a);
        System.out.println(demo.b);
    }
}
