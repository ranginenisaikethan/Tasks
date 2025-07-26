package JavaOOPSTask2;

abstract class Appliance_Task8 {
    abstract void turnOn();
}

interface Connectable {
    void connect();
}

class SmartTV extends Appliance_Task8 implements Connectable {
    public void turnOn() {
        System.out.println("SmartTV is turned ON");
    }

    public void connect() {
        System.out.println("SmartTV is connected to WiFi");
    }

    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.connect();
    }
}
