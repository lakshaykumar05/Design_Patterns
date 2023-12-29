import Observables.Television;
import Observers.EmailObserver;
import Observers.MobileObserver;
import Observers.Observer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, in Observer Design Pattern!");

        Television television = new Television();

        Observer messageObserver = new MobileObserver("9999999999", television);
        Observer emailObserver = new EmailObserver("hello@gmail.com", television);

        television.add(messageObserver);
        television.add(emailObserver);

        television.setData(100);

        System.out.println("Bye, in Observer Design Pattern!");
    }
}
