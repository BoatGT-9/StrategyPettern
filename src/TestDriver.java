
public class TestDriver {

	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		cart1.checkout(3000);
		cart1.setPaymentStrategy(new CreditcardPayment());
		cart1.checkout(5000);
		cart1.setPaymentStrategy(new ScanPayment());
		cart1.checkout(30000);
	}

}
