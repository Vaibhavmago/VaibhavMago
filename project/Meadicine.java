package project;

import java.util.Scanner;
import java.awt.*;
public class Meadicine extends Addition{
int choice,pin,choices,va;
double card_number;
String address;
int ch;
int pins[]=new int[3];
	static int up=30,ups=0,upsk;
	int f;
	Addition a=new Addition();
void details()
{
	
System.out.println("Enter the name of the medicine");
Scanner sc=new Scanner(System.in);
String name;
name=sc.next();


	if(name.equals("RefreshTear"))
{
	System.out.println("Enter the amount of Refresh Tear's that you require?");
	int number=sc.nextInt();
	if(number>30)
	{
		System.out.println("This much amount is not available");
	}else
	{
	double price=number*120;
	System.out.println("The price of the tablets:\n"+price);
System.out.println("The expiry date of the " + name + " is:\n"+28+"/"+3+"/"+2017);
	System.out.println("Enter the patients name");
String pname=sc.next();
System.out.println("Enter the doctors name");
String dname=sc.next();

int membership_number;
int bo;
double nprice,mprice;
nprice=.1*price;
mprice=price-nprice;
System.out.println("If you do have a membership id then please press 1 or press 0");

bo=sc.nextInt();

if(bo==1){
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
choice=sc.nextInt();
if(choice==1)
{
	System.out.println("Kindly pay " + mprice +" of cash");
	System.out.println("For home delievery \nPress 1 or Press 2 to Exit");
	va=sc.nextInt();
	if(va==1)
	{
		a.address();
	System.out.println("Thank you\nYour medicine will reach you by 30-40 minutes depending on the traffic conditions");
	
	}
	else if(va==2)
	{
		System.out.println("Thank you for your time ");
	}

}
else
{
	System.out.println("Please enter your card number");
	card_number=sc.nextInt();
	

	
	
		System.out.println("Enter the 3 digit Pin number");
		pin=sc.nextInt();
		if(pin>100&&pin<999){
		System.out.println("The transacation has been completed\nThank you for your purchasal "+ mprice +"of money has been deducted");
		System.out.println("For home delievery \nPress 1 or Press 2 to Exit");
		va=sc.nextInt();
		if(va==1)
		{
			a.address();
		System.out.println("Thank you\nYour medicine will reach you by 30-40 minuted dependeing on the traffic conditions");
		
		}
		else if(va==2)
		{
			System.out.println("Thank you for your time ");
		}

		}else
		{
			System.out.println("Wrong pin entered");
		}
	}

}
	
	
	else if(bo==0)
	{
		
		System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Kindly pay " + price +" of cash");
			System.out.println("For home delievery \nPress 1 or Press 2 to Exit");
			va=sc.nextInt();
			if(va==1)
			{
				a.address();
			System.out.println("Thank you\nYour medicine will reach you by 30-40 minuted dependeing on the traffic conditions");
			
			}
			else if(va==2)
			{
				System.out.println("Thank you for your time ");
			}

		}
		else if(choice==2)
		{
			System.out.println("Enter your card number");
			card_number=sc.nextInt();
			
				System.out.println("Enter the 3 digit Pin number");
				pin=sc.nextInt();
				if(pin>100&&pin<999){
				System.out.println("The transacation has been completed\nThank you for your purchasal");
				}
				System.out.println("For home delievery \nPress 1 or Press 2 to Exit");
				va=sc.nextInt();
				if(va==1)
				{
					a.address();
				System.out.println("Thank you\nYour medicine will reach you by 30-40 minuted dependeing on the traffic conditions");
				
				}
				else if(va==2)
				{
					System.out.println("Thank you for your time ");
				}
		
				}
		}
	}
	
}

	

	else if(name.equals("Allegra"))
	{
		System.out.println("Enter the amount of Allegra tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{double price=number*8;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:\n"+28+"/"+3+"/"+2017);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();


	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	
	if(bo==1){
		System.out.println("Enter your membership number");
		membership_number=sc.nextInt();
	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else if(choice==2)
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	else if(name.equals("Crocin"))
	{
		
	System.out.println("Enter the amount of Crocin tablet's that you require?");
	int number=sc.nextInt();
	if(number>30)
	{
		System.out.println("This much amount is not available");
	}else
	{double price=number*6;
	System.out.println("The price of the tablets:\n"+price);
System.out.println("The expiry date of the " + name + " is:"+28+"/"+1+"/"+2018);
	System.out.println("Enter the patients name");
String pname=sc.next();
System.out.println("Enter the doctors name");
String dname=sc.next();

int membership_number;
int bo;
double nprice,mprice;
nprice=.1*price;
mprice=price-nprice;
System.out.println("If you do have a membership id then please press 1 or press 0");

bo=sc.nextInt();
if(bo==1){

System.out.println("Enter your membership number");
membership_number=sc.nextInt();
System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
choice=sc.nextInt();
if(choice==1)
{
	System.out.println("Kindly pay " + mprice +" of cash");
}
else
{
	
	card_number=sc.nextInt();
	if(card_number<200)
	{
	System.out.println("Invalid Card number entered");
	
	}
		else
	
	{
		System.out.println("Enter the 3 digit Pin number");
		pin=sc.nextInt();
		if(pin>100&&pin<999){
		System.out.println("The transacation has been completed\nThank you for your purchasal");
		}else
		{
			System.out.println("Wrong pin entered");
		}
	}
}
}
	
	
	else if(bo==0)
	{
		
		System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Kindly pay " + price +" of cash");
		}
		else
		{
			card_number=sc.nextInt();
			if(card_number<200)
			{
			System.out.println("Invalid Card number entered");
			
			}
				else
			
			{
				System.out.println("Enter the 3 digit Pin number");
				pin=sc.nextInt();
				if(pin>100&&pin<999){
				System.out.println("The transacation has been completed\nThank you for your purchasal");
				}else
				{
					System.out.println("Wrong pin entered");
				}
				}
		}
	}
	}
}

	else if(name.equals("Neumilid"))
	{
		System.out.println("Enter the amount of Neumilid tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{double price=number*12;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + "is: "+8+"/"+7+"/"+2017);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	
	else if(name.equals("Augmenton"))
	{
		System.out.println("Enter the amount of Augmenton tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{	double price=number*120;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:"+20+"/"+7+"/"+2017);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}


	else if(name.equals("Citrazen"))
	{
		System.out.println("Enter the amount of Citrazen tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{double price=number*11;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:"+1+"/"+8+"/"+2017);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	
	else if(name.equals("Sompraz"))
	{
		System.out.println("Enter the amount of Sompraz tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{double price=number*8;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:\n"+8+"/"+12+"/"+2017);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	else if(name.equals("Pantadom"))
	{
		System.out.println("Enter the amount of Pantadom tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{double price=number*11;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:\n"+23+"/"+3+"/"+2017);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	
	else if(name.equals("Cyclopam"))
	{
		System.out.println("Enter the amount of Cyclopam tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{double price=number*13;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:\n"+6+"/"+12+"/"+2018);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	
	else if(name.equals("Paracetamol"))
	{
		System.out.println("Enter the amount of Paracetamol tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{
		double price=number*14;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:"+30+"/"+12+"/"+2017);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	else if(name.equals("Domstol"))
	{
		System.out.println("Enter the amount of Domstol tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{	double price=number*12;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:"+1+"/"+1+"/"+2018);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();

	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		}
	}

	
	else if(name.equals("Amplopres"))
	{
		System.out.println("Enter the amount of Amplpres tablet's that you require?");
		int number=sc.nextInt();
		if(number>30)
		{
			System.out.println("This much amount is not available");
		}else
		{	double price=number*7;
		System.out.println("The price of the tablets:\n"+price);
	System.out.println("The expiry date of the " + name + " is:"+22+"/"+4+"/"+2019);
		System.out.println("Enter the patients name");
	String pname=sc.next();
	System.out.println("Enter the doctors name");
	String dname=sc.next();
	int membership_number;
	int bo;
	double nprice,mprice;
	nprice=.1*price;
	mprice=price-nprice;
	System.out.println("If you do have a membership id then please press 1 or press 0");

	bo=sc.nextInt();
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
	if(bo==1){

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + mprice +" of cash");
	}
	else
	{
		System.out.println("Enter your three digit membership number");
		card_number=sc.nextInt();
		if(card_number<200)
		{
		System.out.println("Invalid Card number entered");
		
		}
			else
		
		{
			System.out.println("Enter the 3 digit Pin number");
			pin=sc.nextInt();
			if(pin>100&&pin<999){
			System.out.println("The transacation has been completed\nThank you for your purchasal");
			}else
			{
				System.out.println("Wrong pin entered");
			}
		}
	}
	}
		
		
		else if(bo==0)
		{
			
			System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Kindly pay " + price +" of cash");
			}
			else
			{
				card_number=sc.nextInt();
				if(card_number<200)
				{
				System.out.println("Invalid Card number entered");
				
				}
					else
				
				{
					System.out.println("Enter the 3 digit Pin number");
					pin=sc.nextInt();
					if(pin>100&&pin<999){
					System.out.println("The transacation has been completed\nThank you for your purchasal");
					}else
					{
						System.out.println("Wrong pin entered");
					}
					}
			}
		}
		

	System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
	choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("Kindly pay " + price +" of cash");
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
			if(pin>100&&pin<999){
				System.out.println("The transacation has been completed\nThank you for your purchasal");
				}
			else
				{
					System.out.println("Wrong pin entered");
				}		}
		}
	}
				}else if(!name.equals("Crocin")||(name.equals("Alprex"))||(name.equals("Neumilid")||(name.equals("Augmenton")||(name.equals("Allegra")||name.equals("Paracetamol")||name.equals("RefreshTear")||name.equals("Citrazen")||name.equals("Sompraz")||name.equals("Pantadom"))||name.equals("Cyclopam"))||name.equals("Amplpres")))
				{
	
System.out.println("The given meadicine is not available\nYou can try our other store\nPress 1 to check our other store or Press 0 to continue");	
int pl=sc.nextInt();				
		if(pl==1)
				{

			System.out.println("Enter from the following options to check the contact number\n1.)GreenPark\n2.)Hauz Khas\n3.)Tilak Nagar\n4.)Shahdra\n5.)Dlf Phase-1,Gurgaon\n6.)Mayapuri");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("The address of the shop in Green Park is:\nA1-12,shop number-14,Green Park\nContact number is:\n9810803450");
			}
			else if(ch==2)
			{
				System.out.println("The address of the shop in Hauz Khas is:\nF-43,Hauz Khas\nContact number is:\n9971415553");
					
			}
			else if(ch==3)
			{
				System.out.println("The address of the shop in Tilak Nagar is:\n19/36 B Tilak Nagar\nContact number is:\n9810631378");
				
			}
			else if(ch==4)
			{
				System.out.println("The address of the shop in Shahdra is:\nB1/1243 B Shahdra\nContact number is:\n09742506578");
			}
			else if(ch==5)

			{
				System.out.println("The address of the shop in Dlf Phase-1,Gurgaon is:\n Shop number 43 Dlf Phase-1,Gurgaon\nContact number is:\n9810631378");
						
			}
			else if(ch==6)
			{
				System.out.println("The address of the shop in Mayapuri is:\n Shop number 67 Mayapuri\nContact number is:\n8920631378");
					
				}
				
				
				}
				}


	
}	



static void updates()
	{
		--up;
		System.out.println("The remainig packets of the medicine available is:\n"+up);
	}
	
static void panga()
{
	if(up==0)
	{
		System.out.println("No more medicine available in the stock");
	}
	else
	{
		System.out.println("medicine available ");
	}
}
	

	
static void show()
{
	
	System.out.println("The remaining tablets of medicines left are:\n"+up);
}
static void shows()
{
	--up;
	System.out.println("The remaining tablets of meadicines left are:\n"+up);
}
static void dont()
{
	upsk=ups+up;
	
}

void bit()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the medicine that you require");
	String mag;
	mag=sc.next();
	
System.out.println("Enter the number of tablets that you require");	
int num,num1;
num=sc.nextInt();
num1=number-num;
if(num>num1)
{
	System.out.println("This much amount of tablets we do not have\nPlease try from our other branches");
}
else
{
	double price=number*120;
	System.out.println("The price of the tablets:\n"+price);
System.out.println("The expiry date of the medidicine is:\n"+28+"/"+3+"/"+2017);
	System.out.println("Enter the patients name");
String pname=sc.next();
System.out.println("Enter the doctors name");
String dname=sc.next();

int membership_number;
int bo;
double nprice,mprice;
nprice=.1*price;
mprice=price-nprice;
System.out.println("If you do have a membership id then please press 1 or press 0");

bo=sc.nextInt();

if(bo==1){
	System.out.println("Enter your membership number");
	membership_number=sc.nextInt();
System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
choice=sc.nextInt();
if(choice==1)
{
	System.out.println("Kindly pay " + mprice +" of cash");
}
else
{
	System.out.println("Please enter your card number");
	card_number=sc.nextInt();
	

	
	
		System.out.println("Enter the 3 digit Pin number");
		pin=sc.nextInt();
		if(pin>100&&pin<999){
		System.out.println("The transacation has been completed\nThank you for your purchasal "+ mprice +"of money has been deducted");
		}else
		{
			System.out.println("Wrong pin entered");
		}
	}

}
	
	
	else if(bo==0)
	{
		
		System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Kindly pay " + price +" of cash");
		}
		else if(choice==2)
		{
			System.out.println("Enter your card number");
			card_number=sc.nextInt();
			
				System.out.println("Enter the 3 digit Pin number");
				pin=sc.nextInt();
				if(pin>100&&pin<999){
				System.out.println("The transacation has been completed\nThank you for your purchasal");
				}
				System.out.println("For home delievery \nPress 1 or Press 2 to Exit");
				va=sc.nextInt();
				if(va==1)
				{
					System.out.println("Please enter your home address");
					String address=sc.next();
					System.out.println("Please enter your contact number");
				int contact=sc.nextInt();
				System.out.println("Thank you\nYour medicine will reach you by 30-40 minuted dependeing on the traffic conditions");
				
				}
				else if(va==2)
				{
					System.out.println("Thank you for your time ");
				}
		
				}
		}
	}
	
}







}