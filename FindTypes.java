package week2.Day1.Assignments;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] test1 = test.toCharArray();
		for(int i=0;i<=test1.length-1;i++)
		{
			//System.out.println(test1[i]);
			if(Character.isLetter(test1[i]))
			{
				letter=letter+1;
			}
			else if(Character.isDigit(test1[i]))
			{
				num=num+1;
			}
			else if(Character.isSpaceChar(test1[i]))
			{
				space=space+1;
			}
			else
			{
				specialChar=specialChar+1;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);		
	}

}
