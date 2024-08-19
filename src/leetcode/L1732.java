package leetcode;

public class L1732 {

	public int largestAltitude(int[] gain) {

		int altitude = 0;
		int max = 0;
		int n = gain.length;

		for (int i = 0; i < n; i++) {
			altitude = altitude + gain[i];
			if (altitude > max) {
				max = altitude;
			}
			// max = Math.max(max, altitude);
		}
		return max;
	}

	public static void main(String[] args) {

		int[] gain = { 44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85, -39, 67, -63, 64,
				-47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81 };
		L1732 l = new L1732();
		int max = l.largestAltitude(gain);
		System.out.println(max);

	}

}
