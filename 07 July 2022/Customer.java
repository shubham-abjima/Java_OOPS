import java.util.Optional;

import BusinessCustomer.BusinessSize;
public class Customer {
    private final String name;
    private CreditCard creditCard;
    public Customer(String name,long ccNumber){
        super();
        this.name  = name;
        this.creditCard =new CreditCard(ccNumber);

    }
    public CreditCard getcCreditCard(){
        return creditCard;
    }
public class BusinessCustomer extends Customer{
    public enum BusinessSize{SMALL,MEDIUM,LARGE}
    private BusinessSize size;
    public BusinessCustomer(String name,long ccNumber,BusinessSize size){
        super(name, ccNumber);
        this.size =  size;
    }
}
    public Optional<Order> checkout(ShoppingCart cart){
        Optional<Payment> payment =  creditCard.mkPayment(cart.getTotalCost());
        return payment.map(value->new Order(this,cart));
    }
    @Override
    public String toString(){
        return "Customer{" + 
        "name='" + name + '\''+
        ",creditCard=" + creditCard+
        '}';
    }
}
