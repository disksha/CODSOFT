package Pack1;

import java.util.Scanner;
//Student Grade Calculator
public class Task2 {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Take marks Obtained (out of 100) in each Subject
		System.out.println("Enter marks Of HINDI out of 100 :");
		double hindi=sc.nextDouble();
		System.out.println("Enter marks Of ENGLISH out of 100 :");
		double eng=sc.nextDouble();
		System.out.println("Enter marks Of MATH out of 100 :");
		double math=sc.nextDouble();
		System.out.println("Enter marks Of SCIENCE out of 100 :");
		double sci=sc.nextDouble();
		System.out.println("Enter marks Of SANSKRIT out of 100 :");
		double sans=sc.nextDouble();
		System.out.println("Enter marks Of S.S.T. out of 100 :");
		double sst=sc.nextDouble();
		
//		Calculate Total Marks 
		System.out.println("Your Total  Marks Is out of 600 :");
		double total_marks=hindi+eng+math+sci+sans+sst;
		System.out.println(total_marks);
 
//		Calculate Average Percentage
		System.out.println("Your Average Percentage :");
		double per=((total_marks/600)*100);
		System.out.println(per + "%");
   if(per>90 ) {
	   System.out.println("GRADE : A+");
	   
   }
   if(per>=70 && per<=89 ) {
	   System.out.println("GRADE : A");
	   
   }
   if(per>=60 && per<=69 ) {
	   System.out.println("GRADE : B");
	   
   }
   if(per>=50 && per<=59 ) {
	   System.out.println("GRADE : C");
	   
   }
   if(per>=40 && per<=49) {
	   System.out.println("GRADE : D \n PLEASE STUDY CAREFULLY.");
	   
   }
   if(per<=30 ) {
	   System.out.println("GRADE : fail");
	   
   }

   
   
   
   
   
   
   
   
   


	}

}
