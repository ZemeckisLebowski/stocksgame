
public class Test {

	public static void main(String[] args) {
		
		StockMarket market = new StockMarket(12);
		Stock test1 = new Stock(market.lookupNum(5));
		String testStr = test1.getTicker();
		System.out.println(test1);
		System.out.println(testStr);
		System.out.println(market.lookup(testStr));
		System.out.println(market);
		System.out.println(market.listTickers());
	}

}


//This one is in here just so I can have all my code I use online.

//stocksgame (c) 2015 ZemeckisLebowski
