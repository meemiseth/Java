package arrays_package_cci;
import java.util.Scanner;
public class StringRotation
{
	//function to check whether string 1 is a rotation of second
	boolean isRotation(String s1,String s2)
	{
		//check if both lengths are equal and length>0
		if(s1.length()==s2.length()&&s1.length()>0)
		{
			//Concatenate s1 with itself to form a new string
			String s1s1 = s1+s1;
			return isSubString(s1s1,s2);
		}
		return false;
	}
	boolean isSubString(String s1s1,String s2)
	{
		//check if string 1 contains string s2
		return(s1s1.contains(s2));
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string:");
		String s1 = sc.nextLine();
		System.out.println("enter the second string:");
		String s2 = sc.nextLine();
		sc.close();
		StringRotation sr = new StringRotation();
		boolean flag = sr.isRotation(s1,s2);
		System.out.println(flag);
	}
}
