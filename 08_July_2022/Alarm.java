import java.time.LocalDateTime;
import java.awt.Color;
public abstract class Alarm  implements Widget,PersistentObject {
    // public sealed class Alarm permits HighVisibilityAlarm, PrioritizedAlarm{
    protected boolean active;
    // final String message;
    private final String message;
    private LocalDateTime snoozeUntil;
    // Alarm(){
    //     this("*************");
    // }
    public Alarm(String message){
        this.message =  message;  
        stopSnoozing();
    }
    @Override
    public String getHelpText() {
        return "I am an alarm. You can turn me on or off and snooze anytime";
    }
    @Override
    public void save() {
        System.out.println(("Saving...."));
    }
    public abstract Color getColor();
    public LocalDateTime getSnoozeUntil(){
        return snoozeUntil;
    }

    public void snooze(int minutes){
        if(active)
            snoozeUntil =  LocalDateTime.now().plusMinutes(minutes);
    }

    public boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
        // if(snoozeUntil.isAfter(LocalDateTime.now()))
        //     return true;
        // else    
        //     return false;

    }

    // public void stopSnoozing(){
    //     snoozeUntil =  LocalDateTime.now().minusSeconds(1);
    // }

    public String getMessage(){return message;}
    
    
    public void turnOn(){
        active =  true;
        stopSnoozing();
    }
    public void turnOff(){
        active  =  false;
        stopSnoozing();
    }

    public String getReport(){
        return getReport(false);
    }
    public  String getReport(boolean uppercase){
        if (active && !isSnoozing()){
            if(uppercase)
                return message.toUpperCase();
            else 
                return message;
        }else   
            return "";
    }
    public void sendReport(){
        System.out.println(getReport(true));
    }
    @Override
    public String toString(){
        return getReport();
    }
    private void stopSnoozing(){ 
        snoozeUntil =  LocalDateTime.now().minusSeconds(1);
    }
    public static void main(String[] args){
        Alarm alarm  = new PrioritizedAlarm("We're almost out of donuts !",42);
        System.out.println(alarm.getColor());
    //     Alarm  alarm  =  new Alarm("Temperature Too High");
    //     alarm.turnOn();
    //     alarm.snooze(3);
    //     // Thread.sleep(60000*6);
    //     alarm.sendReport();         
    // }
    // method called by the constructor should be either private or public.
    }
}
    