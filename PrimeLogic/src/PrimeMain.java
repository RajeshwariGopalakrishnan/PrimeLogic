import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeMain {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 6, 9, 34, 52, 63, 81, 19, 83);
		System.out.println("Current List of Numbers " + numbers);
		List<Integer> secondList = numbers.stream().filter(PrimeMain::isPrime).collect(Collectors.toList());
		System.out.println("List of Prime numbers " + secondList);
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false; 
		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}

}
