package arrays_package_cci;

import java.util.Scanner;

// check if two strings are permutations of another-efficient
public class PermString 
{
	public boolean isPermutation(String s,String t )
	{
		int[] letters = new int[128];
		char[] sArray = s.toCharArray();
		for(char c: sArray)
		{
			letters[c]++;
		}
		for(int i=0;i<t.length();i++)
		{
			int v = (int)t.charAt(i);
			letters[v]--;
			if(letters[v]<0)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string:");
		String s = sc.nextLine();
		System.out.println("enter second string:");
		String t = sc.nextLine();
		sc.close();
		PermString sp = new PermString();
		boolean flag = sp.isPermutation(s, t);
		System.out.println(flag);
	  }
}
