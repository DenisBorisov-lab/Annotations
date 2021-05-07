package todo;

public class Example {
    @Todo(message = "написать немного кода")
    public static void m1(){}
    @Todo
    public static void m2(){}
    @Todo(message = "добавить переменную field; либо другую")
    public static void m3(){}
    public static void m4(){}
    @Todo(message = "сделать реализацию метода из примера")
    @Todo(message = "сделать реализацию метода todoList")
    public static void m5(){}


}
