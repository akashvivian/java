import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      int roll_no=sc.nextInt();
      sc.nextLine();
      String dept=sc.nextLine();
      System.out.println("name = "+name+"\nRoll_no = "+roll_no+"\ndept ="+dept);
         int sum=0,c=0;
    for(int i=1;i<=6;i++){
      int a=sc.nextInt();
      sum =sum+a;
    }
    System.out.println(sum/6);
    }
 
}
