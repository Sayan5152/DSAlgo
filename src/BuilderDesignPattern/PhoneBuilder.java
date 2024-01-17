package BuilderDesignPattern;

public class PhoneBuilder {

    private String model;
    private int battery;
    private int size;
    private String os;

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone getPhone() {
        return new Phone(model, battery, size, os);
    }
}
