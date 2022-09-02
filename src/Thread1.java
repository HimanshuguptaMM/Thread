public class Thread1 {
    // Main method
    public static void main(String arg[])
    {
// creating an object of the Thread class using the constructor Thread(String name)
        Thread t= new Thread("Hello World");

// the start() method moves the thread to the active state
        t.start();
// getting the thread name by invoking the getName() method
        String str = t.getName();
        System.out.println(str);
    }
}
