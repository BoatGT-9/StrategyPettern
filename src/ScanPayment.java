
public class ScanPayment implements PaymentStrategy {

	public void pay(int amount) {
		System.out.println("Paid by scan QR Code : " + amount);

	}

}
