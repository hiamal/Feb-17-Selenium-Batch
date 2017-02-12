
public class Bill {
	int dosaPrice = 20;
	int vadaPrice = 8;
	
	int priceOfDosas(int noOfDosas){
		return noOfDosas * dosaPrice;
	}
	
	int priceOfVadas(int noOfVadas){
		return noOfVadas * vadaPrice;
	}

}
