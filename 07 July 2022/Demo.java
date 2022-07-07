import java.util.Iterator;
import java.util.Optional;

import javax.sound.sampled.Line;

public class Demo {
    public static void main(String[] args){
        Product Brush =  Catalogue.getProduct(itemName:"Brush");
        Product Mobile =  Catalogue.getProduct(itemName:"Mobile");
        Product Books =  Catalogue.getProduct(itemName:"Books")

        ShoppingCart cart  =  new ShoppingCart();
        cart.addLineItem( new LineItem(Brush,quantity:1));
        cart.addLineItem( new LineItem(Mobile,quantity:1));
        cart.addLineItem( new LineItem(Books,quantity:1));
        LineItem brush = new LineItem(brush,quantity:2);
        cart.addLineItem((brush));
        System.out.println(cart.getTotalCost());
        
        Customer johnDoe = new Customer(name:"John Doe",ccNumber: 549065449366564L);
        Optional<Order> order = johnDoe.checkout(cart);
        System.out.println(order);
        order.ifPresent(Demo::fulfil);
        System.out.println(order);
    }
    public static void fulfil(Order o){
        ShoppingCart cart =  o.getCart();
        boolean shippingUnfinished;
        do{
            shippingUnfinished = false;
            for(LineItem li = cart.getLineItems()){
                boolean fulfilHalf  = Math.random() >0.7;
                if(fulfilHalf){
                    li.setQuantity(li.getQuantity()/2);
                    
                    shippingUnfinished = true;
                    // System.out.println(li.getProduct() + " is out of stock");  
                }else{
                    li.setQuantity(0);
                }
                System.out.println(fulfilHalf);
            }
        }while(shippingUnfinished);
    } 
    
}



