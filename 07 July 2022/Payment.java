public class Payment {
    private int value;
    public Payment(int value){ this.value  =  value;}
    public int getValue(){return value;}
    public void setValue(int value) {this.value = value;}

    public void execute(){
        System.out.println("executing Payment of " +  value);
    }
    public static void main(String[] args){
        new Payment(3).execute();
    }

    
}
