package project;
import java.util.*;
import java.util.Scanner;

public class Equipment extends Meadicine{
	String ename;
	
	void detail()
	{
		double pr,pri,pric,p,q,w,e;
		pr=2000;
		pri=3096;
		pric=120;
		p=4000;
		q=5000;
		w=1800;
Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the equipment");
	Scanner sw=new Scanner(System.in);
	ename=sw.next();
	if(ename.equals("Stethescope"))
	{
		System.out.println("The price of the Stethescope is:\n"+pr);
		System.out.println("Enter the patients name");
		String pname=sc.next();
		System.out.println("Enter the doctors name");
		String dname=sc.next();
		System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Kindly pay " + pr +" in cash");
		}
		else
		{
			System.out.println("Enter your card number");
			card_number=sc.nextInt();
			if(card_number<=5)
			{
			throw new ArithmeticException("Error");
			}
				else
			
			{
				System.out.println("Enter the 3 digit Pin number");
				pin=sc.nextInt();
				
				if(pin<999){
				System.out.println("The transacation has been completed\nThank you for your purchasal");
				}else
				{
					System.out.println("Wrong pin entered");
				}
		
				}
			}
		
	
				}
			
	else if(ename.equals("Nebuliser"))
	{
		System.out.println("The price of the Nebuliser is:\n"+pri);
		System.out.println("Enter the patients name");
		String pname=sc.next();
		System.out.println("Enter the doctors name");
		String dname=sc.next();
		System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Kindly pay" + pri +" of money");
		}
		else
		{
			System.out.println("Enter your card number");
			card_number=sc.nextInt();
			if(card_number<10)
			{
			System.out.println("Invalid Card number entered");
			}
				else
			
			{
				System.out.println("Enter the 3 digit Pin number");
				pin=sc.nextInt();
				if(pin<999){
				System.out.println("The transacation has been completed\nThank you for your purchasal");
				}else
				{
					System.out.println("Wrong pin entered");
				
		
				}
			}
		}
	
				
			
	}
	
	else if(ename.equals("Syringe"))
			{
		System.out.println("The price of the Syringe is:\n"+pric);
		System.out.println("Enter the patients name");
		String pname=sc.next();
		System.out.println("Enter the doctors name");
		String dname=sc.next();System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Kindly pay" + pri +" of money");
		}
		else
		{
			System.out.println("Enter your card number");
			card_number=sc.nextInt();
			if(card_number<10)
			{
			System.out.println("Invalid Card number entered");
			}
				else
			
			{
				System.out.println("Enter the 3 digit Pin number");
				pin=sc.nextInt();
				if(pin<999){
				System.out.println("The transacation has been completed\nThank you for your purchasal");
				}else
				{
					System.out.println("Wrong pin entered");
				
		
				}
			}
		}
	
				}
			
	
	else if(ename.equals("ECG Machines"))
	{
System.out.println("The price of the ECG Machines is:\n"+p);

System.out.println("Enter the patients name");
String pname=sc.next();
System.out.println("Enter the doctors name");
String dname=sc.next();System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
choice=sc.nextInt();
if(choice==1)
{
	System.out.println("Kindly pay" + pric +" of money");
}
else
{
	System.out.println("Enter your card number");
	card_number=sc.nextInt();
	if(card_number<10)
	{
	System.out.println("Invalid Card number entered");
	}
		else
	
	{
		System.out.println("Enter the 3 digit Pin number");
		pin=sc.nextInt();
		
		if(pin<999){
		System.out.println("The transacation has been completed\nThank you for your purchasal");
		}else
		{
			System.out.println("Wrong pin entered");
		}

	}
}

		}
	
	
	
	else if(ename.equals("Blood Pressure Machine"))
	{
System.out.println("The price of the Blood Pressure Machine is:\n"+p);

System.out.println("Enter the patients name");
String pname=sc.next();
System.out.println("Enter the doctors name");
String dname=sc.next();System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
choice=sc.nextInt();
if(choice==1)
{
	System.out.println("Kindly pay" + p +" of money");
}
else
{
	System.out.println("Enter your card number");
	card_number=sc.nextInt();
	if(card_number<10)
	{
	System.out.println("Invalid Card number entered");
	}
		else
	
	{
		System.out.println("Enter the 3 digit Pin number");
		pin=sc.nextInt();
		
		if(pin<999){
		System.out.println("The transacation has been completed\nThank you for your purchasal");
		}else
		{
			System.out.println("Wrong pin entered");
		}

	}
}

		}
	
	
	
	else if(ename.equals("Cutery Equipment"))
	{
System.out.println("The price of the Cutery Equipment Machine is:\n"+q);

System.out.println("Enter the patients name");
String pname=sc.next();
System.out.println("Enter the doctors name");
String dname=sc.next();System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
choice=sc.nextInt();
if(choice==1)
{
	System.out.println("Kindly pay" + q +" of money");
}
else
{
	System.out.println("Enter your card number");
	card_number=sc.nextInt();
	if(card_number<10)
	{
	System.out.println("Invalid Card number entered");
	}
		else
	
	{
		System.out.println("Enter the 3 digit Pin number");
		pin=sc.nextInt();
		
		if(pin<999){
		System.out.println("The transacation has been completed\nThank you for your purchasal");
		}else
		{
			System.out.println("Wrong pin entered");
		}

	}
}

		}
	
	
	else if(ename.equals("Pulse Oximeter"))
	{
System.out.println("The price of the Pulse Oximeter is:\n"+w);

System.out.println("Enter the patients name");
String pname=sc.next();
System.out.println("Enter the doctors name");
String dname=sc.next();System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
choice=sc.nextInt();
if(choice==1)
{
	System.out.println("Kindly pay" + w +" of money");
}
else
{
	System.out.println("Enter your card number");
	card_number=sc.nextInt();
	if(card_number<10)
	{
	System.out.println("Invalid Card number entered");
	}
		else
	
	{
		System.out.println("Enter the 3 digit Pin number");
		pin=sc.nextInt();
		if(pin<999){
		System.out.println("The transacation has been completed\nThank you for your purchasal");
		}else
		{
			System.out.println("Wrong pin entered");
		}

	}
}

		}
	
	
	else
	{
		System.out.println("The equipment is not available");
			}
	
}
	}


