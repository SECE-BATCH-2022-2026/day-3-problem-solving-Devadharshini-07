import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(UserMainCode.findthetriple(arr));
	}
}

class UserMainCode {
	public static boolean findthetriple (int [] arr){
		int l = arr.length;
		for(int i=0;i<l-3;i++){
			if(arr[i] == arr[i+1] && arr[i+1]==arr[i+2]){
				return true;
			}
		}
		return false;
	}
}