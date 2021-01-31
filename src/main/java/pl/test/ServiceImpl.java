package pl.test;

public class ServiceImpl implements Service{
    public void hello() {
        System.out.println("Hello from auth-5");
        System.out.println("Hello from auth-7");
        System.out.println("other stashed item");
        System.out.println("Second hello from auth-7");
        System.out.println("I continue my work on auth-7");
        System.out.println("Waiting for class from auth-8 & auth-9: ");
        System.out.println("Still waiting for class from auth-8 & auth-9: " + Dog.saySth() + Cat.say());
        System.out.println("P");
        System.out.println("R");
        System.out.println("stashed item");
        System.out.println("stashed");
        System.out.println("XYZ");
        System.out.println("stash to diff on auth-14");
    }
}
