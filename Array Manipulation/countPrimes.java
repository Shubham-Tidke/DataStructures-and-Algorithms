public class countPrimes {
	public static void main(String[] args) {
		int n = 10;
		System.out.println((getPrimes(n)));
	}
	private static int getPrimes(int n) {
		boolean[]isPrime = new boolean[n];
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		int count = 0;
		for (int i = 2; i*i < n; i++) {
			if(!isPrime[i])
				continue;
			//marking all multiples of i as non-prime
			for (int j = i*i; j < n; j+=i) {
				isPrime[j] = false;
			}
		}
		for (int i = 0; i < isPrime.length; i++) {
			if(isPrime[i])
				count++;
		}
		return count;
	}
}