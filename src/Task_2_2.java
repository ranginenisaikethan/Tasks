package Task3_JavaExceptionalHandling;

//RemoteControl interface with abstract, default, and static methods
interface RemoteControl1 {
 void turnOn();

 default void batteryStatus() {
     System.out.println("Battery is at 80%");
 }

 static void info() {
     System.out.println("RemoteControl interface for devices");
 }
}

//TV class implements RemoteControl
class TV1 implements RemoteControl1 {
 public void turnOn() {
     System.out.println("TV turned on");
 }
}

//Printable interface
interface Printable {
 void print();
}

//Scannable interface
interface Scannable {
 void scan();
}

//MultifunctionPrinter implements both Printable and Scannable
class MultifunctionPrinter implements Printable, Scannable {
 public void print() {
     System.out.println("Printing document...");
 }

 public void scan() {
     System.out.println("Scanning document...");
 }
}

//Main class to test both tasks
public class Task_2_2 {
 public static void main(String[] args) {
     TV1 tv = new TV1();
     tv.turnOn();
     tv.batteryStatus();
     RemoteControl1.info();

     MultifunctionPrinter mfp = new MultifunctionPrinter();
     mfp.print();
     mfp.scan();
 }
}

/* TV turned on
Battery is full
Exception in thread "main" java.lang.NoSuchMethodError: 'void Task3_JavaExceptionalHandling.RemoteControl.info()'
	at Task3_JavaExceptionalHandling.Task_2_2.main(Task_2_2.java:50)

*/
