public class Main
{
	public static void main(String[] args) {
		String arr[][]={{"luke","shaw"},
		{"wayne","rooney"},
		{"rooney","ronaldo"},
		{"shaw","rooney"}};
		int c=0;    
		for(int i=0;i<arr.length;i++){
		    if(arr[i][1].equals("ronaldo")){
		        for(int j=0;j<arr.length;j++){
		            if(arr[i][0].equals(arr[j][1])){
		                c++;
		            }
		        }
		        break;
		    }
		}
		System.out.print(c);
	}
}