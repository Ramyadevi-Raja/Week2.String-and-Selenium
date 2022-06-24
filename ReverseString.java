package week2.Day1.Assignments;

public class ReverseString {
	public static void main(String[] args) {
	String test = "Good Morning";
	int length = test.length();
	System.out.println(length);
	char[] array = test.toCharArray();
	for(int i=length-1;i>=0;i--)
	{
		System.out.println(array[i]);
	}
	}
}
