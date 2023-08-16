/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 33

Description:

Write a function to convert a Roman numeral (e.g., "XIV") to an
integer.
*/

public class Question33
{
	public static long romanToInteger(String s)
	{
		if(s==null)
			return -1;
		if(s.isEmpty())
			return -1;
		
		long sum = 0;
		boolean flag  =true;
		
		for(int i = 0;i<s.length()-1;i++)
		{
			switch(s.charAt(i))
			{
				case 'M':
					sum+=1000;
					break;
				case 'D':
					sum+=500;
					break;
				case 'C':
					switch(s.charAt(i+1))
					{
						case 'D':
							sum+=400;
							i++;
							flag = (i+1)==(s.length()-1)?false:true;
							break;
						case 'M':
							sum+=900;
							i++;
							flag = (i+1)==(s.length()-1)?false:true;
							break;
						default:
							sum+=100;
							break;
					}
					break;
				case 'L':
					sum+=50;
					break;
				case 'X':
					switch(s.charAt(i+1))
					{
						case 'L':
							sum+=40;
							i++;
							flag = (i+1)==(s.length()-1)?false:true;
							break;
						case 'C':
							sum+=90;
							i++;
							flag = (i+1)==(s.length()-1)?false:true;
							break;
						default:
							sum+=10;
							break;
					}
					break;
				case 'V':
					sum+=5;
					break;
				case 'I':
					switch(s.charAt(i+1))
					{
						case 'V':
							sum+=4;
							i++;
							flag = (i+1)==(s.length()-1)?false:true;
							break;
						case 'X':
							sum+=9;
							i++;
							flag = (i+1)==(s.length()-1)?false:true;
							break;
						default:
							sum+=1;
							break;
					}
					break;
				default:
					break;
			}
		}
		if(flag)
			switch(s.charAt(s.length()-1))
			{
				case 'M':
					sum+=1000;
					break;
				case 'D':
					sum+=500;
					break;
				case 'C':
					sum+=100;
					break;
				case 'L':
					sum+=50;
					break;
				case 'X':
					sum+=10;
					break;
				case 'V':
					sum+=5;
					break;
				case 'I':
					sum+=1;
					break;
				default:
					break;				
			}
			
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		String s = "MMMCMXCVIII";		
		System.out.println(s+" : "+romanToInteger(s));
	}
}