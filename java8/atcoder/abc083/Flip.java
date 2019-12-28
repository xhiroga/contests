import java.util.Scanner;

public class Flip{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int first = 0;
		int second = 0;
		int last = 0;
		int end = 0;
		int max = 0;
		char lastW = null;
		int status = 1; // 1 or 2 or 5

		for(int i=0;i<s.length();i++){
			if (lastW == s.charAt(i)){
				
				if(status==1){
					first++;
				}else if (status==2){
					second++;
				}
			}
		}
		
	}
	
	
}
