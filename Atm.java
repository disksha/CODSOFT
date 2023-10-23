package Pack1;

import java.util.Scanner;


public class ATM {
	
	 public static void withdraw(float amount) {
		 
		Scanner sc= new Scanner(System.in);
		 
    	   System.out.println("your widthrow Money :"); 
    	   float withdraw_money=sc.nextFloat();
    	   if(withdraw_money>amount) {
    		   System.out.println("Alert! \n your Balance is not enough !");
    	   }
    	   else {
    		          float remain=amount-withdraw_money;
    		          System.out.println("you withdraw Successfully !");
    		          System.out.println("now your balance is :"+remain);
    	   }
		 
	 }

	 public static void deposit(float amount) {
		   
		 Scanner sc= new Scanner(System.in);
		 
  	   System.out.println("your Deposite Money :"); 
  	   float Deposite_money=sc.nextFloat();
  	 
  		          float total=amount+Deposite_money;  		       
  		          System.out.println("you Deposite Successfully !");
  		          System.out.println("now your balance is :"+total);
		 
		 
	 }
	 
	 
	 
	 public static void Check_balance (float amount) {
		  System.out.println(amount);
	}
	
	
	public static void main(String[] args) {
		float amount=70000;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your id");
		int idd=sc.nextInt();
	     System.out.println("Enter your password");
	     
	     int passs=sc.nextInt();

	         System.out.println("You are Entered");
//	         withdraw(amount);
	         int i=0;
	         while(i<=4) {
	         System.out.println("1. Deposite Money .");
	         System.out.println("2. Withdraw Money .");
	         System.out.println("3. Check Balance.");
	         System.out.println("4. exit.");
	          System.out.println("Enter Your Choice");
	         int num=sc.nextInt();
	         if(num==1) {
	        	deposit(amount); 
	         }
             if(num==2) {
	        	withdraw(amount); 
	         }
             if(num==3) {
	        	 Check_balance(amount); 
	         }
             if(num==4) {
	        	System.out.println("you are exit"); 
	        	break;
	         }
	       
	         
	     }
}  
	   

}























