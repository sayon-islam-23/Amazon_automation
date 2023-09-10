package My_Package;

public class PriceValidation {
	public boolean validateResult(float firstPrice,float secondPrice,float totalPrice) {
		if(firstPrice + secondPrice == totalPrice) {
			return true;
		}
		else {
			return false;
		}
	}
}
