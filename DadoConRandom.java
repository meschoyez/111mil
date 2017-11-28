import java.util.Random;
public class Dado {
	public static void main (String[] args) {
		Random dado = new Random();
		for (int i = 0; i < 6; i++) {
			int cara = dado.nextInt(6) + 1;
			System.out.println(cara);
		}
	}
}

