package Timert;
import java.util.Timer;
import java.util.TimerTask;


public class Timerclass {
public	int sec=0;
	Timer tir=new Timer();
	TimerTask task=new TimerTask() {
		public void run() {
			//if (sec>=5) {
			//	tir.cancel();
			//}
			sec++;
			System.out.println(""+sec);
		
				
			}
	};
		public void start() {
			tir.scheduleAtFixedRate(task,3000,3000);
}
		public void stop() {
			tir.cancel();
		}
		public  Timerclass() {
			start();
		}
}
