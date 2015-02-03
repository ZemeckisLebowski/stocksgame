
public class Stock {
	
	/* private stock vars.
	 * String ticker: Ticker of stock. (ex. APPL, YUM, S)
	 * double price: current price of the stock.
	 * double momentum: how the stock price will change every tick in percent.*/
	private String ticker;
	private double price;
	private double momentum;
	
	//the default constructor
	public Stock(String t, double p, double m){
		t = t.toUpperCase();
		ticker = t.substring(0, Math.min(t.length(), 4));//String shortener
		price = p;
		momentum = m;
	}
	
	//apply the momentum change
	public void changePrice(){
		price+= (price*momentum);
	}
	
	//accessors
	public String getTicker(){ return ticker; }
	public double getPrice(){ return price; }
	public double getMomentum(){ return momentum; }
	
	//modifiers
	
	public void setTicker(String t){ ticker = t; }
	public void setPrice(double p){ price = p; }
	public void setMomentum(double m){ momentum = m; }
	
	public String toString(){
		String str = ticker + ": $"+ price + " (";
		if(momentum >= 0)
			str+= "^"+momentum + ")";
		else
			str+= "v"+Math.abs(momentum)+ ")";//momentum going up or down
		return str;
	}
	
}
