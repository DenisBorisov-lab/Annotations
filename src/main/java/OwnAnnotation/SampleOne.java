package OwnAnnotation;

public class SampleOne {
    @Test
    public static void m1(){}
    @Test
    public static void m2(){}

    public static void m3(){
        throw new RuntimeException("Ошибка");
    }
    @Test
    public static void m4(){}

    public void m5(){}
    @Test
    public static void m6(){}

    public static void m7(){
        throw new RuntimeException("Ошибка в m7");
    }
    @Test
    public static void m8(){}

}
