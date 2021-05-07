package todo;

import java.lang.reflect.Method;

public class TodoRunner {
    public static void run(Class object) {
        int records = 0;
        int methods = 0;
        for (Method method : object.getDeclaredMethods()) {
            methods++;
            if (method.isAnnotationPresent(Todo.class) || method.isAnnotationPresent(TodoContainer.class)) {
                try {
                    method.invoke(null);
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println(method.getName() + " [record: " + todo.message() + "]");
                } catch (Throwable e) {
                    System.out.println("метод " + method.getName() + " выдаёт ошибку!");
                }
                records++;
            }
        }
    }
}
