import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

/**
 * Created by kiran on 3/20/16.
 */
public class HomeSecuritySystem {
    public static void main(String[] args) {

        final Vector<DoorSensor> doors = new Vector<DoorSensor>(2,2);
        final Vector<TempSensor> temps = new Vector<TempSensor>(2,2);
        final Buzzer buzzer = new Buzzer();

        //Timer One Will add the first Door Sensor
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                doors.add(new DoorSensor());
                System.out.println("door sensor #1 is added");
                doors.get(0).setDoorOpen(true);
                buzzer.beepDoor(1);
                timer.cancel();
            }
        }, 1000);
        //Timer two Will add the second Door Sensor
        final Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {

            @Override
            public void run() {
                doors.add(new DoorSensor());
                System.out.println("door sensor #2 is added");
                timer.cancel();
            }
        }, 2000);
        //Timer three Will add and set  the first Temperature Sensor to "TOO HIGH"
        final Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {

            @Override
            public void run() {
                temps.add(new TempSensor());
                System.out.println("Temperature Sensor #1 is added");
                temps.get(0).setTempStatus("TOO HIGH");
                buzzer.beepTemp(temps.get(0).getTempStatus(),1);
                timer.cancel();
            }
        }, 3000);
        //Timer four Will set  the first Temperature Sensor to "TOO LOW"
        final Timer timer3 = new Timer();
        timer3.schedule(new TimerTask() {

            @Override
            public void run() {
                temps.get(0).setTempStatus("TOO LOW");
                buzzer.beepTemp(temps.get(0).getTempStatus(),1);
                timer.cancel();
            }
        }, 5000);

        //Timer five Will set  the first Temperature Sensor to "TOO HIGH" and door #2 sensor triggered
        final Timer timer4 = new Timer();
        timer4.schedule(new TimerTask() {

            @Override
            public void run() {
                temps.add(new TempSensor());
                temps.get(0).setTempStatus("TOO HIGH");
                buzzer.beepTemp(temps.get(0).getTempStatus(),1);
                doors.get(1).setDoorOpen(true);
                buzzer.beepDoor(2);
                timer.cancel();
            }
        }, 7000);

        //Timer six Will add #2 #3 #4 #5 #6 temp sensors
        final Timer timer5 = new Timer();
        timer5.schedule(new TimerTask() {

            @Override
            public void run() {
                temps.add(new TempSensor());
                System.out.println("Temperature Sensor #2 is added");
                temps.add(new TempSensor());
                System.out.println("Temperature Sensor #3 is added");
                temps.add(new TempSensor());
                System.out.println("Temperature Sensor #4 is added");
                temps.add(new TempSensor());
                System.out.println("Temperature Sensor #5 is added");
                temps.add(new TempSensor());
                System.out.println("Temperature Sensor #6 is added");
                timer.cancel();
            }
        }, 8000);

        //Timer seven Will set  the sixth Temperature Sensor to "TOO HIGH" and door #1 sensor triggered
        final Timer timer6 = new Timer();
        timer6.schedule(new TimerTask() {

            @Override
            public void run() {
                temps.get(5).setTempStatus("TOO HIGH");
                buzzer.beepTemp(temps.get(0).getTempStatus(),6);
                doors.get(0).setDoorOpen(true);
                buzzer.beepDoor(1);
                timer.cancel();
            }
        }, 9000);

        //Timer eight Will complete the testing
        final Timer timer7 = new Timer();
        timer7.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("Testing is Finished Successfully");
                timer.cancel();
                System.exit(0);
            }
        }, 10000);


    }
}

class DoorSensor {
    public boolean isDoorOpen;

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;
    }
}

class TempSensor{
    public String tempStatus;

    public String getTempStatus() {
        return tempStatus;
    }

    public void setTempStatus(String tempStatus) {
        this.tempStatus = tempStatus;
    }
}

class Buzzer {
    public void beepTemp(String alert, int tempSensorNum){
        System.out.println("beep, beep, beep -- The temperature at sensor #"+tempSensorNum+ " is "+ alert + "..!!");
    }

    public void beepDoor(int doorNum){
        System.out.println("beep, beep, beep -- The Door #"+ doorNum +" is Open..!!");
    }
}
