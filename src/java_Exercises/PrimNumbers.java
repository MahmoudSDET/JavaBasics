package java_Exercises;

public class PrimNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";
	       
	       int m=0;
	       int flag=0;
	       
            
	       for (i = 0; i <= 100; i++)         
	       { 	
	    	   flag=0;
	    	   if(i==0||i==1){  
	    		   System.out.println(i+" is not prime number"); 
	    		   flag=1;
	    		  }else{  
	          
	    			  
	    			  m=i/2;
	    			  
	    			  for(int j=2;j<=m;j++){      
	    				    if(i%j==0){      
	    				     System.out.println(i+" is not prime number");      
	    				     flag=1;      
	    				     break;      
	    				    }      
	    				   }}      
		  if (flag==0)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		     
		     
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);

	}

}
	

