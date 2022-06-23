package week2.Day1.Assignments;

public class Palindrome {
	//to find the given string is Palindrome or not
public static void main(String[] args) {
	String str = "amma";
	String rev = "";
	int length = str.length();
	System.out.println("length of the string is "+length);
	for(int i=length-1;i>=0;i--)
	{
		rev = rev+str.charAt(i);
	}
	System.out.println(rev);
	if (str.equals(rev))
		System.out.println("Given string is Palindrome");
	else
		System.out.println("Given string is not Palindrome");
}
}
