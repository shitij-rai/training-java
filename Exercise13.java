
public class Exercise13 {

	public static void main(String[] args) {
		// The Super Market- Stock Challenge
		
		int stockList[] = {4,11,13,20,55,41,33,5,9};
		int max = stockList[0]; 
		
		for(int i=0;i<stockList.length;i++) {
			if(stockList[i]>max)
				max = stockList[i];
		}
		System.out.println("Maximum values is " + max);
	}

}
