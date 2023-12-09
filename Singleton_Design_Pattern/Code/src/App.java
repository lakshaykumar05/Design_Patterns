import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, in Singleton Design Pattern!");

        // MyClass myClass = new MyClass();   Normal Object making but here in singleton we cant do like this bcz then it will not remain singleton.

        // MyClass myClass1 = MyClass.getInstance();
        // System.out.println(myClass1);

        // MyClass myClass2 = MyClass.getInstance();
        // System.out.println(myClass2);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.execute(() -> System.out.println(MyClass.getInstance()));
        executor.execute(() -> System.out.println(MyClass.getInstance()));
        executor.execute(() -> System.out.println(MyClass.getInstance()));
        executor.execute(() -> System.out.println(MyClass.getInstance()));

        System.out.println("Bye, in Singleton Design Pattern!");
    }
}
