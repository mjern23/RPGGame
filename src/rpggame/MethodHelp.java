package rpggame;

import java.util.concurrent.TimeUnit;

public class MethodHelp {

	public void cusWait(int time) {
		try {
			TimeUnit.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
