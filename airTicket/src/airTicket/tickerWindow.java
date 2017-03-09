package airTicket;

public class tickerWindow implements Runnable{
	
	//total number of tickets is 3000
	 private static int nums = 3000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
			synchronized(this){
			// if the place has tickets
				if(nums > 0){
					//display the number of tickets
					System.out.println(Thread.currentThread().getName() + "The number of ticket just sold is:" + nums);
					//control the speed of the selling ticket
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						
					}
					nums--;
				}else {
					//the ticket all sold out 
					break;
				}
			}
		}
	}
	 
}
