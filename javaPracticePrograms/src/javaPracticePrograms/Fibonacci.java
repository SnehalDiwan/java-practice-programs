package javaPracticePrograms;

public class Fibonacci {
	public static int getLargeNumber(int n1,int n2,int n3) {
		
		if(n1>n2) {
			System.out.println("N1 IS greater no = " + n1);
			return n1;
		}else if(n2>n3){
			System.out.println("N2 is large no" + n2);
			return n2;
		}else {
			System.out.println("N3 is large = " + n3);
			return n3;
		}
	}
	public static char isVowel(char c) {
		if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' ) {
			System.out.println("it ts vowel =" + c);
		}else {
			System.out.println("it is consonant = " + c);
		}
		return c;
	}
	
	public static int getEvenOdd(int num) {
		if(num%2==0) {
			System.out.println("no is even = " + num);
		}else {
			System.out.println("no is odd = " + num);
		}
		return num;
	}
	public static void main(String[] args) {
		getLargeNumber(100,1255,85);
		isVowel('p');
		getEvenOdd(13);
		
		int a=10;
				int b=20;
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a + "and" +b);
		
	
		
		int ch='l';
		int ascii=ch;
		int charascii=(int) ascii;
		System.out.println(charascii);
		int first=12;
		int second=90;

        first = first - second;//12-90=-78
        
        second = first + second;//102-90
        first = second - first;
        System.out.println(first);
        System.out.println(second);
		
	}

}
