package BuilderDesignPattern;

public class Phone {
    private String model;
    private int battery;
    private int size;
    private String os;

    public Phone(String model, int battery, int size, String os) {
        this.model = model;
        this.battery = battery;
        this.size = size;
        this.os = os;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", battery=" + battery +
                ", size=" + size +
                ", os='" + os + '\'' +
                '}';
    }
}
