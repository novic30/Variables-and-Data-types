import java.io.*;

public class swap {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		System.out.println("1." + value1);
		System.out.println("2." + value2);
		System.out.println(" ");

		value1 = value1 + value2;
		value2 = value1 - value2;
		value1 = value1 - value2;
		System.out.println("1." + value1);
		System.out.println("2." + value2);
	}
}