package BuilderDesignPattern;

public class Demo {
    public static void main(String args[]) {
        Phone phone = new PhoneBuilder().setBattery(5000).setModel("samsung").setOs("android").getPhone();

        System.out.println(phone);
    }
}
