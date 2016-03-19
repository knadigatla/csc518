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

        //First Security System Object with Empty Constructor
        SecuritySystem secSystem = new SecuritySystem();

        //arming the System
        secSystem.armSystem();
        System.out.println("Security System1 is Armed..!!");

        //Printing the State of the System
        System.out.println("The State of the Security System1 is " + (secSystem.isArmed() ? "Armed":"Not Armed"));

        //disarming the System
        secSystem.disarmSystem();
        System.out.println("Security System1 is Disarmed..!!");

        //Printing the State of the System
        System.out.println("The State of the Security System1 is " + (secSystem.isArmed() ? "Armed":"Not Armed"));

        //Second Security System Object with armed=true Constructor
        SecuritySystem secSystem2 = new SecuritySystem(true);

        //Printing the State of the System
        System.out.println("The State of the Security System2 is " + (secSystem2.isArmed() ? "Armed":"Not Armed"));

        //Setting the Duration of System turned on to 0.5 days
        secSystem2.setOnDuration((float)0.5);

        //Printing the how Long the system is turned on
        System.out.println("The System2 is turned on from "+secSystem2.getOnDuration()+" days");


        //Thrid Security System Object with all parameters(doorOpen=true, armed=true, onDuration=0.2days)
        // passed to Constructor
        SecuritySystem secSystem3 = new SecuritySystem(true, true, (float)0.2);

        //Printing the State of the System
        System.out.println("The State of the Security System3 is " + (secSystem3.isArmed() ? "Armed":"Not Armed"));

        //Printing the Current Status of The Door
        System.out.println("The Current Status of the Door is " + (secSystem3.isDoorOpen() ? "Open":"Closed"));

        //Printing the how Long the system is turned on
        System.out.println("The System3 is turned on from "+secSystem3.getOnDuration()+" days");

    }
}
