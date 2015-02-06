
public class StockMarket {
	/* A class meant to contain several stocks. It can also apply
	 * a change to every stock in the market, or one specific stock
	 * in the market.
	 * 
	 * Stock[] market: an array holding all the stocks in the market.*/
	
	private Stock[] market;
	
	//default constructor
	public StockMarket (int a){//ammount of stocks to put in the array.
		market = new Stock[a];
		for(int i=0; i<a; i++){
			market[i] = new Stock();
		}
	}
	
	//Blank constructor, makes 20 stocks in the market
	public StockMarket(){
		market = new Stock[20];
	}
	
	//Search the array for a stock with a specific ticker.
	public Stock lookup (String s){
		s = s.toUpperCase();
		String ticker = s.substring(0, Math.min(s.length(), 4));//String shortener
		for(int i=0; i<market.length; i++){
			if(ticker.equals(market[i].getTicker()))
				return market[i];
		}
		return null;
	}
	
	//look up a stock at a specific place in the array.
	public Stock lookupNum(int num){ return market[num]; }
	
	//list all the stock tickers in the market
	public String listTickers(){
		String str = "";
		for(int i=0; i<market.length; i++){
			str+= market[i].getTicker()+", ";
			if(i%5 == 0 && i != 0)
				str+= "\n";
		}
		return str;
	}
	
	//toString
	public String toString(){
		String str = "";
		int total = 0;
		for(int i=0; i<market.length; i++){
			total+= market[i].getPrice();
		}
		str+= "There are "+market.length+" stocks in the market," +
		      "\nTotaling $"+total+" in price";
		return str;
	}
	
}

//stocksgame (c) 2015 ZemeckisLebowski
