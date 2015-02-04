
public class RandomTicker {
	/* this class is a way to generate
	*  a random 4-letter ticker name for a stock.
	*  For some reason it returns a null pointer exception.
	*  If anyone could tell me why, that would be aweom*/
	
	public final char[] ALPHABET = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public String out = create();
	
	//default constructor with nothing in it.
	public RandomTicker(){};
	
	//make a string length 1-4 with random letters in it
	public String create(){
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
			name[i] = ALPHABET[(int)(Math.random()*26)];
		}
		
		String returnStr = "";
		
		
		for(int i=0; i<nSzz; i++){
			returnStr+= name[i];
		}
		
		return returnStr;
	}
	
	//make the string
	public void newStr(){
		out = create();
	}
	
	

}

//stocksgame (c) 2015 ZemeckisLebowski
