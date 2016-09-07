import java.util.*;
class hunt
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String s=String.valueOf(a);
StringBuffer sb=new StringBuffer(s);
int b=Integer.parseInt(String.valueOf(sb.reverse()));
System.out.println(b);
}
}
