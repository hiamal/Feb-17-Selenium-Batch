
public class TestCarrot {

	public static void main(String[] args) {
		Carrot myCarrot = new Carrot();
		
		int hisPrice = myCarrot.marketPrice(15);
		System.out.println("Salesman Price = " + (hisPrice + hisPrice*.05));
		
	}

}
