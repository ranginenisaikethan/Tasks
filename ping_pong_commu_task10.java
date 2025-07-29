package Task4_MultiThreading;


class Chat{
	boolean flag =false;
	public synchronized void Question(String msg){
		if(flag){
			try{
				wait();
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}

		}
		System.out.println(msg);
		flag =true;
		notify();
	}
	public synchronized void Answer(String msg){
		if(!flag){
			try{
				wait();
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}

		}
		System.out.println(msg);
		flag =false;
		notify();

	}
}
class Task3 implements Runnable{
	Chat m;
	String[] s1={"Hi","How are you?","I am also doing fine!!"};

	
	
	public Task3(Chat m){
		this.m =m;
		new Thread(this,"Question").start();

	}
	public void run(){
		for (int i=0;i<s1.length;i++){
			m.Question(s1[i]);
		}


	}


}
class Task4 implements Runnable{
	Chat m;
	String[] s2={"Hello","I am Good ","What about you?","Great!!!"};
	
	public Task4(Chat m){
		this.m =m;
		new Thread(this,"Answer").start();

	}

	public void run(){
		for (int i=0;i<s2.length;i++){
			m.Answer(s2[i]);
		}
	}
	


}
public class ping_pong_commu_task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat obj = new Chat();
		new Task3(obj);
		new Task4(obj);
		

	}

}