
public class MyClass {

    private static MyClass myClassObj = null; // This is lazy initialization bcz we are initializing object only we require it, we can also initizalize here with instance of class also and that will be eager initialization and that will automatically be thread safe.

    int a = 0;
    int b = 0;

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

    public void setAB(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getSum()
    {
        return a + b;
    }
}