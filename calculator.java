import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        double a,b,res;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number:");
        a=sc.nextDouble();
        System.out.println("enter second number: ");
        b=sc.nextDouble();
        System.out.println("enter your choice: \n1.addition(+)\n 2.subtraction(-)\n 3.multiplication(*)\n 4.division(/)\n 5.modulus(%)\n");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                res=a+b;
                System.out.printf(a+"+"+b+"="+res);
                break;

            case 2:
                res=a-b;
                System.out.println(a+"-"+b+"="+res);
                break;

            case 3:
                res=a*b;
                System.out.println(a+"*"+b+"="+res);
                break;

            case 4:
                res=a/b;
                System.out.println(a+"/"+b+"="+res);
                break;

            case 6:
                res=a%b;
                System.out.println(a+"%"+b+"="+res);
                break;


        }
    }
}