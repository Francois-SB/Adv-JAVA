package fr.ldnr.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

  public static void main(String[] args) {
    
    Thread thread = new Thread(new MonRunnable(1000));

 

    thread.start();
  }

  private static class MonRunnable implements Runnable {

    private long delai;
    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    
    public MonRunnable(long delai) {
      this.delai = delai;
      //this.df = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public void run() {
    	while(true) {
	      try {
	        Thread.sleep(delai);

	        System.out.print(df.format(new Date()) + "\n\n\n\n\n\n\n\n\n");//+ "\n\n\n\n\n\n\n\n\n\n\n\n"
//	        for(int i=0; i<8;i++) {
//	        	System.out.println();
//	        }

	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    	}
    }
  }
}