/**
 * Created by kiran on 3/19/16.
 */
import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class RunMeTask extends TimerTask
{
    @Override
    public void run() {
        System.out.println("Run Me ~");
        System.out.println(new Timestamp(new Date().getTime()));

    }
}

class Main
{
    public static void main( String[] args )
    {

        TimerTask task = new RunMeTask();

        Timer timer = new Timer();
        System.out.println(new Timestamp(new Date().getTime()));

        timer.schedule(task, 1000);
        timer.purge();
        timer.cancel();
//        timer = new Timer();
//        System.out.println("break");
//        timer.schedule(task,1000);
//        System.exit(0);
    }
}