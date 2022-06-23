package week2.Day1.Assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "posts";
		if(text1.length()==text2.length())
		{
			char[] text3 = text1.toCharArray();
			char[] text4 = text2.toCharArray();
			Arrays.sort(text3);
			Arrays.sort(text4);
			System.out.println(text3);
			System.out.println(text4);
			if(Arrays.equals(text3, text4))
			{
				System.out.println("Given Strings are Anagram");
			}
			else
			{
				System.out.println("Given Strings are not Anagram");
			}
		}
		else
			{
				System.out.println("length of two string is not equal");
			}
}
}
