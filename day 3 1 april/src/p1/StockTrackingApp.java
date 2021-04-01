package p1;

public class StockTrackingApp {

	public static void main(String[] args) {
		
		// display the price .
		
		// call price change method 
		
		// display the stock details again
		
		stock newstock = new stock("Ex why jedd",200000);
		newstock.display();
		
		stock randomStock = new stock("Random co.",500000);
		randomStock.display();
		
		randomStock.changePrice(50, false);
		randomStock.display();
		
		newstock.changePrice(25, true);
		newstock.display();
		
		System.out.print("\n"+newstock.getStockName()+" changed to ");
		newstock.setStockName("First stock");
		System.out.println(newstock.getStockName());
		
		System.out.print("\n"+randomStock.getStockPrice()+" changed to ");
		randomStock.setStockPrice(500);
		System.out.println(randomStock.getStockPrice());
		
		
		
		
	}
	
}
