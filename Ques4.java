package lab1;
import java.util.Scanner;
public class Ques4 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.next();
	CountChar(str);
}
static void CountChar(String st)
{
	int count[]=new int[256];
	int i=0,f=0;
	for(i=0;i<st.length();i++)
		count[st.charAt(i)]++;
	char ch[]=new char[st.length()];
	for(i=0;i<st.length();i++)
	{
		ch[i]=st.charAt(i);
		f=0;
		for(int j=0;j<=i;j++)
		{
			if(st.charAt(i)==ch[j])
				f++;
		}
		if(f==1)
			System.out.println("no of occurance of "+st.charAt(i)+ " is: "+count[st.charAt(i)]);
	}
}
}
