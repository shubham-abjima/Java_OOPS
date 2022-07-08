public class Program {
    public static void main(String[] args){
        Alarm  alarm  =  new Alarm("Temperature Too High");
        alarm.turnOn();
        alarm.sendReport();
        // System.out.println("Before calling dostuff():"+ alarm.active);

        // dostuff(alarm);
        // System.out.println("After calling dostuff():"+ alarm.active);


    }
    // static void dostuff(Alarm a){
    //     a.active  = true;
    // }
    
}
