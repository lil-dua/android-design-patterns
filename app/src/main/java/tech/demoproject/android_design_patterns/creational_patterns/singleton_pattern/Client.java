package tech.demoproject.android_design_patterns.creational_patterns.singleton_pattern;

public class Client {
    public static void main(String[] args) {

        //
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        eagerInitialization.setName("Ryan");
        System.out.println(eagerInitialization.getName());

        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization1.getName());
    }
}
