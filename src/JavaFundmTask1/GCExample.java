package JavaFundmTask1;

public class GCExample {
    protected void finalize() {
        System.out.println("Object");
    }
    public static void main(String[] args) {
    	GCExample obj = new GCExample();
        obj = null;   //eligible null
        System.gc();
    }
}