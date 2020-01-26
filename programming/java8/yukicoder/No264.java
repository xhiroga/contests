import java.util.Scanner;

public class No264{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int me = sc.nextInt();
		int you = sc.nextInt();
		int rs = you - me;

		if (rs == 1 || rs == -2){
			System.out.println("Won");
		} else if (rs == 0 ){
			System.out.println("Drew");
		} else {
			System.out.println("Lost");
		}
	}
	
}
