
public class Stock {
	
	/* private stock vars.
	 * String ticker: Ticker of stock. (ex. APPL, YUM, S)
	 * double price: current price of the stock.
	 * double momentum: how the stock price will change every tick in percent.
	 * RandomTicker generator: a string of length 1-4 maker.*/
	private String ticker;
	private double price;
	private double momentum;
	public RandomTicker generator;
	
	//the default constructor
	public Stock(String t, double p, double m){
		t = t.toUpperCase();
		ticker = t.substring(0, Math.min(t.length(), 4));//String shortener
		price = p;
		momentum = m;
	}
	
	/* a constructor that makes a random ticker name, a price from 1-50,
	 * and a momentum from 0.01 to 0.02*/
	public Stock(){
		ticker = create();
		price = (Math.random()*50)+1;
		momentum = (Math.random()*0.01)+0.01;
	}
	
	
	//apply the momentum change
	public void changePrice(){
		price+= (price*momentum);
	}
	
	//make a ticker
	public String create(){
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] name = new char[4];
		int nSzz = 0;
		int rndInt = (int)(Math.random()*4+1);
		
		if(rndInt == 1)
			nSzz = 1;
		else if(rndInt == 2)
			nSzz = 2;
		else if(rndInt == 3)
			nSzz = 3;
		else
			nSzz = 4;
		
		for(int i=0; i<nSzz; i++){
			name[i] = alphabet[(int)(Math.random()*26)];
		}
		
		String returnStr = "";
		
		
		for(int i=0; i<nSzz; i++){
			returnStr+= name[i];
		}
		
		return returnStr;
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

//stocksgame (c) 2015 ZemeckisLebowski
