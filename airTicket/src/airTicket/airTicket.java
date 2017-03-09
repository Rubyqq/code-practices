package airTicket;

public class airTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create ticket window
		tickerWindow tw = new tickerWindow();
		tickerWindow tw1 = new tickerWindow();
		tickerWindow tw2 = new tickerWindow();
		
		Thread t = new Thread(tw);
		Thread t1 = new Thread(tw);
		Thread t2 = new Thread(tw);
		
		t.start();
		t1.start();
		t2.start();
	}
	
	

}
