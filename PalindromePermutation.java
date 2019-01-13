package arrays_package_cci;
import java.util.Scanner;
public class PalindromePermutation
{
	//function to check whether string is a permutation of a palindrome
	public boolean isPermuatation(String str)
	{
		int[] table = createCountTable(str);
		 return(countOddNumbers(table));
	}
	//create a hashtable containing the count of all alphabets in the string 
	int[] createCountTable(String str)
	{
		int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c:str.toCharArray())
		{
		   int x = countNumber(c);
		   if(x!=-1)
			   table[x]++;
		}
		return table;
	}
	
	int countNumber(char c)
	{
		int a =   Character.getNumericValue('a');
		int z =   Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(val>= a&& val<=z)
			return val-a;
	return -1;	
}
	// check if there are any odd number of alphabet counts
	boolean countOddNumbers(int[] table)
	{
		boolean checkOdd = false;
		for(int c: table)
		{
			if(c%2==1)
			{
				if(checkOdd==true)
					return false;
				checkOdd = true;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a new String:");
		String str = sc.nextLine();
		sc.close();
		PalindromePermutation pp = new PalindromePermutation();
		boolean flag = pp.isPermuatation(str);
		System.out.println(flag);
	}
}