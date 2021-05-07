package OwnAnnotation;

import java.util.ArrayList;
import java.util.List;

public class SampleTwo {
    @ExceptionTest(ArithmeticException.class)
    public static void m1(){
        int i = 0;
        i = i/i;
    }

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void m2(){
        List<String> list = new ArrayList<>();
        list.addAll(5, null);
    }

}
