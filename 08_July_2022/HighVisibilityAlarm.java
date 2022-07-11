import java.awt.Color;

public class HighVisibilityAlarm extends Alarm {

    public HighVisibilityAlarm(String message){
        super(message);
    }


    @Override
    public Color getColor(){
        return Color.ORANGE;
    }
    @Override
    public String getReport(boolean uppercase){
        String report = super.getReport(uppercase); //get report from superclass
        if(report.isEmpty())
            return report;
        else    
            return report  + " !";
        // if (active && !isSnoozing()){
        //     if(uppercase)
        //         return getMessage().toUpperCase()  + "!";
        //     else 
        //         return getMessage() + "!";
        // }else   
        //     return "";

    // public static void  main(String[] args){
    //     HighVisibilityAlarm  alarm =  new HighVisibilityAlarm("Temperature Too High");
    //     alarm.turnOn();
    //     alarm.sendReport();
    //     System.out.println(alarm.toString());
        // System.out.println(alarm.getReport(true));
    } 
    
}
