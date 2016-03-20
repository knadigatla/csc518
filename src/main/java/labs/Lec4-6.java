import java.util.Timer;
import java.util.TimerTask;

class RunMeTask extends TimerTask
{
	@Override
	public void run() {
		System.out.println("Run Me ~");
	}
}

class Main 
{
    public static void main( String[] args )
    {
 
    	TimerTask task = new RunMeTask();
 
    	Timer timer = new Timer();
    	timer.schedule(task, 1000,1000);
    }
}
