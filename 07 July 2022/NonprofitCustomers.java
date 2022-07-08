public class NonprofitCustomers extends Customer {
    public NonprofitCustomers(String name,long ccNumber) {super(name,ccNumber);}

    @Override
    public int calculateDiscount() {return 15; 
    }
    
}
