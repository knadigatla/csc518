import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by kiran on 1/31/16.
 */
public class SecuritySystem {

    private boolean isDoorOpen;
    private boolean isArmed;
    private float onDuration;

    public SecuritySystem() {
        super();
        System.out.println("\nSecurity System is initialized with No Parameters..!!");
    }

    public SecuritySystem(boolean isArmed) {
        this.isArmed = isArmed;
        System.out.println("\nSecurity System is initialized with Armed = "+isArmed);
    }

    public SecuritySystem(boolean isDoorOpen, boolean isArmed, float onDuration) {
        this.isDoorOpen = isDoorOpen;
        this.isArmed = isArmed;
        this.onDuration = onDuration;
        System.out.println("\nSecurity System is initialized with Armed = "+isArmed+" isDoorOpen = "+
                isDoorOpen+" onDuration = "+onDuration);
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;

        System.out.println("The Door is "+(isDoorOpen ? "Open":"Closed"));
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
        isArmed = armed;
    }

    public float getOnDuration() {
        return onDuration;
    }

    public void setOnDuration(float onDuration) {
        this.onDuration = onDuration;
    }

    public void armSystem() {
        setArmed(true);
    }

    public void disarmSystem() {
        setArmed(false);
    }

    public static void main(String[] args) {


        //Second Security System Object with armed=true Constructor
        final SecuritySystem secSystem2 = new SecuritySystem(true);

        //Printing the State of the System
        System.out.println("The State of the Security System2 is " + (secSystem2.isArmed() ? "Armed":"Not Armed"));

        //Timer One will print the test is ready at 1st second
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("The test is ready to Run..!!");
                timer.cancel();
            }
        }, 0);

        //Timer two will open the door
        final Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {

            @Override
            public void run() {
                secSystem2.setDoorOpen(true);
                timer1.cancel();
            }
        }, 2000);

        //Timer three will close the door
        final Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {

            @Override
            public void run() {
                secSystem2.setDoorOpen(false);
                timer2.cancel();
            }
        }, 3000);


        //Timer four will complete the test
        final Timer timer3 = new Timer();
        timer3.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("The test is Finished..!!");
                timer3.cancel();
            }
        }, 4000);



    }
}
