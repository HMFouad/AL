package Command;

import com.sun.corba.se.pept.broker.Broker;

public class Main {

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStock = new BuyStock(abcStock);
		SellStock sellStock = new SellStock(abcStock);
		
		Command.Broker broker = new Command.Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		
		broker.placeOrder();

	}

}
