package HomeWork;

public class Class_homework2 {

	public static void main(String[] args) {
		
		
/*1. Declare "Nature is the one song of praise that never stops singing"  
in a string variable and prints them twice in the same line.*/
		
	String txt1="Nature is the one song of praise that never stops singing"; 
	String txt2="Nature is the one song of praise that never stops singing"; 
	System.out.println(txt1+"  "+txt2);
	//Result:Nature is the one song of praise that never stops singing  Nature is the one song of praise that never stops singing	

//2.Declare 234 & 234.50 variable, add them & print
		
		int num=234;
		double num2=234.50;
		System.out.println(num+num2);// Result: 468.5
		
/*3.Declare "Nothing is more effective than sincere" in String variable and 9876 in int variable, 
	Print both String & int in the same line with the concept of + */
		
		String txt="Nothing is more effective than sincere";
		int num1 =9876;
	System.out.println(txt+"  "+num);// Ans: Nothing is more effective than sincere  234
	
//4. Declare "In praise there is more obtrusiveness than in blame" in string variable & print only "obtrusiveness than in blame"

	String s= "In praise there is more obtrusiveness than in blame";
	System.out.println(s.substring(24));// Ans:obtrusiveness than in blame
	
//5. Declare "In praise there is more obtrusiveness than in blame" in string variable & print only "obtrusiveness"
	
	String t= "In praise there is more obtrusiveness than in blame";
	System.out.println(t.substring(23,36));//Ans: obtrusivenes
	
//6.Print "more" & "than" from String "Nothing is more effective than sincere" using split concept
	
	String k="Nothing is more effective than sincere";
	String[] sp=k.split(" ");
	System.out.println(sp[2]);// Ans: more
	System.out.println(sp[4]);// Ans: than
	
//7. Declare Strings "Hello "," TTech  ","  Students     "  print by removing all empty spaces from strings
	
//8.Declare String variables  "200","300","400",convert all String to integer, Add & print


	String v1 ="200";
	String v2 ="300";
	String v3 ="400";
	
	// convert string to integer
	
	int nu1= Integer.parseInt(v1);
	int nu2= Integer.parseInt(v2);
	int nu3= Integer.parseInt(v3);
	int add = nu1 + nu2 + nu3;
	System.out.println(add);// Ans: 900
	
	/*9.Declare three integer variables and print true & false for below operators
    1. > more than
     2. < less than
     3. == equal to
     4. && and
     5. |  | or  
     6. >= more than equal
     7. <=less than equal */

	int a = 100;
	int b = 200;
	int c = 300;
	System.out.println(b>a);//true
	System.out.println(b<a);//false
	System.out.println(c==a);//false
	System.out.println(b<c&&b>a);//true
	System.out.println(c>a||a==b);//true
	System.out.println(b>=a);//true
	System.out.println(b<=a);//false
	

//10. Declare two integer variables and apply to add, multiply and division operator & print
	int x= 3;
	int y= 12;

	System.out.println(x+y);//15
	System.out.println(x-y);//-9
	System.out.println(x*y);//36
	System.out.println(x/y);//0
	
	
	
	
	



		

	}

}
