
public class MyClass {

    private static MyClass myClassObj = null;

    private MyClass()
    {
        System.out.println("Constructor of MyClass");
    }

    public static MyClass getInstance()
    {
        if(myClassObj == null){
            synchronized(MyClass.class){ 
                if(myClassObj == null)
                    myClassObj = new MyClass();
            }
        }

        return myClassObj;
    }
}