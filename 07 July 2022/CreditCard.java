import java.util.UUID;

public class CreditCard {
    private final long cardNumber{
        CreditCard(long cardNumber){
        this.cardNumber =  cardNumber;}
        public Payment mkPayment(int value){
            if (Math.random() > 0.3){
                return new Payment(creditCard:this,value,UUID.randomUUID());
            }
            else{
                return null;
            }
        }
        @Override
        public String toString(){
            return "CreditCard{" + 
                    "cardNumber=" +  cardNumber + 
                    "}";
        }
    } 
    
}
