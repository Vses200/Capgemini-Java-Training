package p1;

public class stock {
	
	private String stockName; // infosys
	private int stockPrice;  // 1300
	
	public stock(String name, int price) {
		stockName = name;
		stockPrice = price;
	}
	
	
	
	
	public void display() {
		
		System.out.println("\nStock Name : "+stockName+"\nStock Price : "+stockPrice);
	}
	
	public void changePrice(float percentageChange,boolean action)
	{
		if(action==true) {
			stockPrice += (percentageChange/100)*stockPrice;
			System.out.println("\nPercecntage increase in Price Occured in stock of "+stockName);
		}
			
		else {
			stockPrice -= (percentageChange/100)*stockPrice;
			System.out.println("\nPercecntage decrease in Price Occured in stock of "+stockName);
		}
		
			
	}




	public String getStockName() {
		return stockName;
	}




	public void setStockName(String stockName) {
		this.stockName = stockName;
	}




	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
		
	}




	public int getStockPrice() {
		return stockPrice;
		
	}

}
