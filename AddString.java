package Math;

public class AddString {
	
	public String addStrings(String num1, String num2)
	{
		//if (s1==""|| s2=="") return
		//overflow:
		/*int len1= s1.length();
		int len2= s2.length();
		int len=(len1> len2)? len1: len2;
		int []result= new int[len+1];
		
		//assume both positive
		//4099+22
		String rev_s1= new StringBuilder(s1).reverse().toString();  //reverse the string
		String rev_s2= new StringBuilder(s2).reverse().toString();
		for (int i=0; i<len+1; i++)
		{	
			int s1_num= i>=len1?0: (int)(rev_s1.charAt(i)-'0');   //char to int
			int s2_num= i>=len2?0:(int)(rev_s2.charAt(i)-'0');
			result[i]+= s1_num+s2_num;
			if (result[i]>=10 && i<len)
			{
				result[i+1]+= result[i]/10;     //deal with carr bit
				result[i]%=10;
			}
			System.out.println(i+" "+result[i]);
		}
		//for (int i)
		StringBuilder sb= new StringBuilder();
		for (int i=len; i>=0; i--)
		{
			boolean useless_zero= true;    //if the first bit is 0
			if (result[i]==0 && useless_zero) continue;
			else
			{	
				useless_zero=false;
				sb.append(result[i]);
			}
		}
		return !sb.toString().equals("")?sb.toString():"0";*/
		//solution2:
		int i= num1.length()-1; int j= num2.length()-1;
		int sum=0, carry=0;
		StringBuilder sb= new StringBuilder();
		while (i>=0 || j>=0)
		{
			int n1= i<0?0:(int)(num1.charAt(i)-'0');
			int n2= j<0?0:(int)(num2.charAt(j)-'0');
			sum= n1+n2+carry;
			carry= sum/10;
			sum= sum%10;
			sb.append(sum);
			i--; j--;
		}
		//deal with carry
		if (carry>0) sb.append(carry);
		return sb.reverse().toString();
		
	}


}
