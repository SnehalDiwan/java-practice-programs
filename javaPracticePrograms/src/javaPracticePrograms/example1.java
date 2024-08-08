package javaPracticePrograms;

public class example1 {

	public static void main(String[] args) {
		//Factorial of a number
		int num=10;
		long factorial=1;
		for(int i=1; i <=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		// multiplication of table
		
		int numm=5;
		for(int i=1; i<=10; i++) {
			System.out.println(numm +"*" + i + "=" + numm*i);
		}
		
		// fibonacci series
		int n=10; int firstterm=0; int secondterm=1;
		System.out.println("fibonacci series of first 10 no : ");
		for(int i=1; i<=n;i++ ) {
			
			System.out.print(firstterm + ",");
			System.out.println("  ");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
		
		// Display the char of A to Z
		 char c;
		 for( c='A'; c<='Z'; c++) {
			 System.out.print(c+" ");
			 
		 }
		 
		 int count=0; int numb=12345;
		 while(numb!=0) {
			 numb=numb/10;
			 count++;
		 }
		 
		 System.out.println("count of given no is ");
		 System.out.println(count);
	}

}
