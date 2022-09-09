public class Main
{
	public static void main(String[] args) {
		String str="PROGRAM";
		int l=str.length()-1;
		for(int i=0;i<=l;i++){
		    for(int j=0;j<=l;j++){
		        if(j==i||j==l-i){
		            System.out.print(str.charAt(j)+" ");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}