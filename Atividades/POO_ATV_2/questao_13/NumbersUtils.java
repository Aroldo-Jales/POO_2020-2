package POO_ATV_02;

public class NumbersUtils {
	int number;

    public boolean isPair() {
        if (number % 2 == 0) {
        	return true;
        } else {
        	return false;
        }
    }

    public boolean isOdd() {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isPrime() {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printCount() {
        for (int i = 0; i <= number; i++) {
        	String s = ""+i;
            System.out.print(s+", ");
        }
    }

    public void printReverseCount() {
        for (int i = number; i >= 0; i--) {
        	String s = ""+i;
            System.out.print(s+", ");
        }
    }
}
