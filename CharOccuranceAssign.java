package week2.Day1;

public class CharOccuranceAssign {
	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		System.out.println(length);
		for(int i=0;i<length;i++)
		{
			char charAt = str.charAt(i);
			System.out.println(charAt);
			
		}
	}

}
