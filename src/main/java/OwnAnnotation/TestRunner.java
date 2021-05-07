package OwnAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void run(Class testClass){
        int tests = 0;
        int passed = 0;
        for (Method declaredMethod : testClass.getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(ExceptionTest.class) || declaredMethod.isAnnotationPresent(ExceptionTestContainer.class)){
                tests++;
                try {
                    declaredMethod.invoke(null);
                    //passed++;
                    System.out.println("Test " + declaredMethod + " failed, no exception");
                } catch (Throwable ex) {
                    Throwable cause = ex.getCause();//????
                    int oldPassed = passed;
                    ExceptionTest[] exceptionTests = declaredMethod.getAnnotationsByType(ExceptionTest.class);
                    for (ExceptionTest exceptionTest : exceptionTests) {
                        if (exceptionTest.value().isInstance(cause)){
                            passed ++;
                            break;
                        }
                    }
                    if(passed == oldPassed){
                        System.out.println("All tests are passed!!!");
                    }
                }
            }
        }
        System.out.println("tests " + tests);
        System.out.println("passed " + passed);
        System.out.println("failed " + (tests - passed));

    }
}
