
public class TestBill {

	public static void main(String[] args) {
		Bill myBill = new Bill();
		
		int totalBillAmt = myBill.priceOfDosas(2) + myBill.priceOfVadas(2);
		
		System.out.println("Total Bill Amt = " + totalBillAmt);
		
		System.out.println("Waiter's tip = " + totalBillAmt * .05);
	}

}
