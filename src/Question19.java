/*

Author: Ananthanarayanan R
Course: Java Full Stack, Uttara Info Solutions
Batch Number: B107

Practicals: Questions on Control Statements 
Question: 19

Description: 
What will be the output of the following code?

boolean b=97>='a';
int a=65/'A'+1;
switch(b){
case true:
a++;
break;
case false:
a+=a;
}
System.out.print(a);


Output-

boolean cannot be used as the choice inside switch.



*/


public class Question19
{
	public static void main(String[] args)
	{
		System.out.println("Boolean cannot be used as choice inside switch");
	}
}
