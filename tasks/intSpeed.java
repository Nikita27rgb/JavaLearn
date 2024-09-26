import java.time.Duration;
import java.time.Instant;

import static java.time.Instant.now;

public class intSpeed {

	public static void main(String arv[]) {
		long[] timeWork1 = new long[5];
		long[] timeWork2 = new long[5];
		Instant timeStart1;
		long sum = 0;

		for (int j = 0; j < 5; j++) {
			sum = 0;
			timeStart1 = now();
			for (int i = 0; i != Integer.MAX_VALUE; i++)
				sum += i;

			timeWork1[j] = Duration.between(timeStart1, Instant.now()).toMillis();
		}

		for (int j = 0; j < 5; j++) {
			sum = 0;
			timeStart1 = now();
			for (Integer i = 0; i != Integer.MAX_VALUE; i++)
				sum += i;

			timeWork2[j] = Duration.between(timeStart1, Instant.now()).toMillis();
			System.out.printf("Итерация %d: Время int: %d | Время Integer: %d\n", j, timeWork1[j], timeWork2[j]);
		}
	}
}
