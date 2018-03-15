package level2;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(blackJackMethod(2, 20));
	}

	public static int blackJackMethod(int a, int b) {
		if (a > b && a <= 21) {
			return a;
		} else if (b > a && b <= 21) {
			return b;
		} else if (a > 21 && b > 21) {
			return b;
		} else if (b > 21 && a > 21) {
			return a;
		} else {
			return 0;
		}
	}
}
