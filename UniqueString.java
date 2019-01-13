package arrays_package_cci;
import java.util.Scanner;
public class UniqueString 
{
  public boolean isUniqueString(String str)
  {
	  boolean[] charSet = new boolean[128];
	  for(int i=0;i<str.length();i++)
	  {
		  int value = str.charAt(i);
		  if(charSet[value])
		  {
			  return false;
		  }
		  charSet[value] = true;
	  }
	  return true;
  }
  public static void main(String args[])
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter string:");
	 String str = sc.nextLine();
	 sc.close();
	 UniqueString uq = new UniqueString();
	 boolean flag = uq.isUniqueString(str);
     System.out.println(flag);	 
  }
}
