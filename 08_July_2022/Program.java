public class Program {
    public static void main(String[] args){
        HighVisibilityAlarm alarm   =  new HighVisibilityAlarm("Hello There!");
        activate(alarm);
        printHelpText(alarm);
        saveItTwice(alarm);
        // Alarm  alarm  =  new Alarm("Temperature Too High");
        // alarm.turnOn();
        // String report   =  alarm.getReport();
        // System.out.println(report);
        // alarm.turnOn();
        // System.out.println(alarm);
        // alarm.sendReport();
        // System.out.println("Before calling dostuff():"+ alarm.active);

        // dostuff(alarm);
        // System.out.println("After calling dostuff():"+ alarm.active);
 

    }
    private static void activate(Alarm alarm){
        alarm.turnOn();
    }
    private static void printHelpText(Widget widget){
        System.out.println(widget.getHelpText());

    }
    private static void saveItTwice(PersistentObject persistentObject){
        persistentObject.save();
        persistentObject.save(); 
    }
    // static void dostuff(Alarm a){
    //     a.active  = true;
    // }
    
}
