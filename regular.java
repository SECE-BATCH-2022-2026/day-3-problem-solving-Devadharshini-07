import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println(UserMainCode.regular(inp));
	}
}
class UserMainCode {
	public static boolean regular(String inp){
		return inp.matches("(^[2][1-9]$)|(^[3][0-9]$)|(^[4][0-5]$)");
	}
}