package javaBasics;

public class Flass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Lenght=100000;
	
		for(int i=1;i<=Lenght;i++)
		{
			for(int j=i;j<=Lenght;j++)
			{
		
			if (j%2 != 0 && i%j!=0) {
				
				System.out.println(j);
			//	 break;
				
				
			}else {
				
				//System.out.println("your number is  odd number");
				//break;
				
			}
			
		}
	}	
			
	}		

}
