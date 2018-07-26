package janani;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,temp=0;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
a=ja.nextInt();
b=ja.nextInt();
temp=a;
a=b;
b=temp;
System.out.println(a+" "+b);
	}

}
