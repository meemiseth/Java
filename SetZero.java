package arrays_package_cci;
import java.util.Scanner;
public class SetZero
{
  public void hasZero(int[][] matrix)
  {
	  boolean [] rows = new boolean[matrix.length];
	  boolean [] cols = new boolean[matrix[0].length];
	  for(int i=0;i<matrix.length;i++)
	  {
		  for(int j=0;j<matrix[0].length;j++)
		  {
			  if(matrix[i][j]==0)
			  {
				  rows[i]=true;
				  cols[j]=true;
			  }
		  }
	  }
	  nullifyRow(rows,matrix);
	  nullifyCol(cols,matrix);
  }
  void nullifyRow(boolean[] rows,int[][] matrix)
  {
	  for(int i=0;i<rows.length;i++)
	  {
		  if(rows[i])
			  setRowZero(matrix,i);
	  }
  }
  void nullifyCol(boolean[] cols,int[][] matrix)
  {
	  for(int j=0;j<cols.length;j++)
	  {
		  if(cols[j])
			  setColZero(matrix,j);
	  }
  }
  void setRowZero(int[][] matrix,int row)
  {
	  for(int j=0;j<matrix[0].length;j++)
	  {
		  matrix[row][j]=0;
	  }
  }
  void setColZero(int[][] matrix,int col)
  {
	  for(int i=0;i<matrix.length;i++)
	  {
		  matrix[i][col]=0;
	  }
  }
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  int m,n;
	  SetZero sz = new SetZero();
	  System.out.println("enter the limits of the matrix:");
	  m= sc.nextInt();
	  n=sc.nextInt();
	  int matrix[][] = new int[m][n];
	  System.out.println("enter the matrix:");
	  for(int i=0;i<m;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  matrix[i][j]=sc.nextInt();
		  }
	  }
	  sc.close();
	  sz.hasZero(matrix);
	  for(int i=0;i<m;i++)
	  {
		  System.out.println();
		  for(int j=0;j<n;j++)
		  {
			  System.out.print("\t"+matrix[i][j]);
		  }
	  } 
  }
}
