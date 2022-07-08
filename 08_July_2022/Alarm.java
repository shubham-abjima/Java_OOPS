import java.time.LocalDateTime;
class Alarm {
    boolean active;
    // final String message;
    final String message;
    LocalDateTime snoozeUntil;
    // Alarm(){
    //     this("*************");
    // }
    Alarm(String message){
        this.message =  message;
        stopSnoozing();
    }

    void snooze(){
        snoozeUntil =  LocalDateTime.now().plusMinutes(5);
    }

    boolean isSnoozing(){
        return snoozeUntil.isAfter(LocalDateTime.now());
        // if(snoozeUntil.isAfter(LocalDateTime.now()))
        //     return true;
        // else    
        //     return false;

    }

    void stopSnoozing(){
        snoozeUntil =  LocalDateTime.now().minusSeconds(1);
    }

    String getMessage(){return message;}
    
    
     void turnOn(){
        active =  true;
    }
    void turnOff(){
        active  =  false;
    }

    String getReport(){
        return getReport(false);
    }
    String getReport(boolean uppercase){
        if (active && !isSnoozing()){
            if(uppercase)
                return message.toUpperCase();
            else 
                return message;
        }else   
            return "";
    }
    void sendReport(){
        System.out.println(getReport(true));
    }
    public static void main(String[] args){
        Alarm  alarm  =  new Alarm("Temperature Too High");
        alarm.turnOn();
        alarm.snooze();
        Thread.sleep(60000*6);
        alarm.sendReport();       
    }

    }
    