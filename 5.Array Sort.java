import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int i,j;
		int a[]=new int[n];
		for(i=0;i<n;i++){
		    a[i]=ob.nextInt();
		}
		Arrays.sort(a);
		int h=n/2;
        int c=n/2==0?h-1:h;
		for(i=c,j=c+1;i>=0;i--,j++){
		if(i==0 && j<n-1){
		        System.out.print(a[i]);
		}
		else{
		    System.out.print(a[i]+" ");
		    System.out.print(a[j]+" ");
		}
		}
	}
}