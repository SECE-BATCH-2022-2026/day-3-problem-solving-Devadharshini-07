import java.util.*;
public class day3{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String org=sc.nextLine();
      int count=0;
      for(int i=0;i<=str1.length()-org.length();i++){
      	if(str1.substring(i,i+org.length()).equals(org)){
      		count++;
      	}
      }
      System.out.println(count);
      
}
}
