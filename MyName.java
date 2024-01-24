import java.util.Scanner; 
    public class MyName {
        public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 int a ;
 System.out.print("enter your value for a:");
 a = input.nextInt();
 int b;
 System.out.print("enter your value for b:");
 b = input.nextInt();
 int add = a+b;
 int sub = a-b;
 int div = a/b;
 int multi = a*b;
 System.out.println("the addition of a and b is :"+ add);
 System.out.println("the subtraction of a and b is :"+ sub);
 System.out.println("the division of a and b is :"+ div);
 System.out.println("the multiplication of a and b is :"+ multi);

   }
}
