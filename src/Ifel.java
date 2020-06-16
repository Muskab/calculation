import java.util.Scanner;

public class Ifel {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a num");
      int num1=sc.nextInt();
      System.out.println("Enter another num");
      int num2=sc.nextInt();
      int sum=num1+num2;
      System.out.println("Sum is "+ sum);
    System.out.println("Enter a num");
    int num3=sc.nextInt();
    System.out.println("Enter another num");
    int num4=sc.nextInt();
    System.out.println("product is " + num3*num4);
    sc.nextLine();
      System.out.println("input first string");
      String firstString=sc.nextLine();
      System.out.println("input your second string");
      String secondString = sc.nextLine();
      System.out.println(firstString+ " "+ secondString);


  }
}
