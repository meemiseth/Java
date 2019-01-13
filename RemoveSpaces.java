package arrays_package_cci;
import java.util.Scanner;
public class RemoveSpaces
{
	public char[] spacesRemove(char[] strArray,int trueLength)
	{
		int spaceCount=0,newLength=0;
		//count the number of spaces
		for(char c:strArray)
		{
			if(c==' ')
				spaceCount++;
		}
		//find the length of the new string
		newLength = trueLength+spaceCount*2;
		//if the character array's length greater than actual length,append \0 to the end
		if(trueLength<strArray.length)
		{
			strArray[trueLength]='\0';
		}
		char[] newArray = new char[newLength];
		//iterate through each element in the character array
		for(int i=trueLength-1;i>=0;i--)
		{
			//if the element is equal to space then,add '%20'
			if(strArray[i]==' ')
			{
				newArray[newLength-1]='0';
				newArray[newLength-2]='2';
				newArray[newLength-3]='%';
				newLength = newLength -3;
			}
			//else ,append the element to the new character array
			else
			{
				newArray[newLength-1]=strArray[i];
				newLength--;
			}
		}
		return newArray;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = sc.nextLine();
		System.out.println("enter the truelength:");
		int trueLength = sc.nextInt();
		sc.close();
		char[] strArray = str.toCharArray();
		RemoveSpaces rs = new RemoveSpaces();
		char[] newArray = rs.spacesRemove(strArray,trueLength);
		System.out.println(newArray);
	}
}
