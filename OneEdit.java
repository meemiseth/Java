package arrays_package_cci;
import java.util.Scanner;
public class OneEdit 
{
	public boolean checkOneEdit(String first,String second)
	{
		//if both lengths are equal,then they will be having  a replace difference
		if(first.length()==second.length())
			return editReplace(first,second);
		//if first string's length is 1 less than second string,then one insert away
		if(first.length()+1==second.length())
			return editInsert(first,second);
		//if second string's length is 1 less than first string,then one remove away
		if(first.length()==second.length()+1)
			return editInsert(second,first);
		//if the length's are very different return false
		return false;
	
	}
	//check if one character in one string is replaced with a new character to form the other string
	public boolean editReplace(String s1,String s2)
	{
		boolean checkEdit = false;
		for(int i=0;i<s1.length();i++)
		{
			// check if each character is equal or not
			if(s1.charAt(i)!=s2.charAt(i))
			{
				if(checkEdit)
					return false;
				checkEdit = true;
			}
		}
		return true;
	}
	//check if one string is an insert /remove away from second string
	public boolean editInsert(String s1,String s2)
	{
		int index1 = 0;
		int index2 = 0;
		while(index2<s2.length()&&index1<s1.length())
		{
			if(s1.charAt(index1)!=s2.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
				}
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		OneEdit oe =new  OneEdit();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string:");
		String first = sc.nextLine();
		System.out.println("enter the second string:");
		String second = sc.nextLine();
		sc.close();
		boolean flag = oe.checkOneEdit(first,second);
		System.out.println(flag);
	}
}
