package week2.Day1.Assignments;

import java.util.Arrays;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String data = "I am a software tester";
		String[] sp = data.split(" ");
		String result = "";
		int length = sp.length;
		System.out.println(length);
		for(int i=0;i<=length;i++)
		{
			if(i%2==0)
			{
				char[] array = sp[i].toCharArray();
				String rev ="";
				for(int j=array.length-1;j>=0;j--)
				{
					rev = rev + array[j];
				}
				result = result + rev + " ";
			}
			/* Else statement is not working i don't know why please help me on this
			else
			{
				result = result + sp[i];
			}*/
		}
	System.out.println(result);	
	}
}
