import java.util.*;

public class Dolphin {
	public static void public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int position = new int[testCase];
		int i = 0;

		for (i; i < testCase; i++) {
			position[i] = scan.nextInt();
		}

		int j = 0;

		for (j; j < testCase; j++) {
			int sum = 0, round = 1;

			while ((position[j] >= 1) && (position[j] <= 2000000000)) {
				sum +=  round * 3;
				if (sum >= position[j]) {
					int temp = position[j] - (sum - (round * 3));
					int action;
					if (temp <= round) {
						action = 0;
					} else {
						int difference, count;
						do {
							difference = temp - round;
							count++;
						} whlie (difference < round)
						action = count;
					}

					if (action == 0) {
						if (round == 1) {
							System.out.println(round + " dolphin");
						} else {
							System.out.println(round + " dolphins");
						}
					} else if (action == 1) {
						if (round == 1) {
							System.out.println(round + " jump");
						} else {
							System.out.println(round + " jumps");
						}
					} else if (action == 2) {
						System.out.println("Splash");
					}
				}
				round++;
			}
		}
	}
}