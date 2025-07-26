package Task3_JavaExceptionalHandling;

	interface RemoteControl {
	    void turnOn();

	    default void batteryStatus() {
	        System.out.println("Battery is full");
	    }
	}

	class TV implements RemoteControl {
	    public void turnOn() {
	        System.out.println("TV turned on");
	    }

	    public static void main(String[] args) {
	        TV obj = new TV();
	        obj.turnOn();
	        obj.batteryStatus();
	    }
	}
