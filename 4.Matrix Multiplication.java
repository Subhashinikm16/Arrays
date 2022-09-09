import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns for 1st matrix:");
		int m=ob.nextInt();
		int n=ob.nextInt();
		int a1[][]=new int[m][n];
		System.out.println("Enter the elements");
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        a1[i][j]=ob.nextInt();
		    }
		}
		System.out.println("Enter the number of rows and columns for 2st matrix:");
		int p=ob.nextInt();
		int q=ob.nextInt();
		int a2[][]=new int[p][q];
		System.out.println("Enter the elements");
		for(int i=0;i<p;i++){
		    for(int j=0;j<q;j++){
		        a2[i][j]=ob.nextInt();
		    }
		}
		int c[][]=new int[m][q];
		for(int i=0;i<m;i++){
		    for(int j=0;j<q;j++){
		        c[i][j]=0;
		        for(int k=0;k<n;k++){
		            c[i][j]+=a1[i][k]*a2[k][j];
		        }
		    }
		}
		for(int i=0;i<m;i++){
		    for(int j=0;j<q;j++){
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}