package in.Java8Features.stream;

import java.util.Arrays;
import java.util.List;

public class FindtheSecondLargest {

	public static void main(String[] args) {

		Object[] mixedArray = { 1, "Rahul", 34, "abcd", "Kempa", 143, "123" };

		System.out.println(Arrays.toString(mixedArray));

		System.out.println("-----Printing Only String Values---");
		for (Object element : mixedArray) {
			if (element instanceof String) {

				System.out.println((String) element);
			}
		}
	}
}
