package project;

import java.util.Scanner;

public class Addition {
	int number,date,year,month,option;
	double price;
	String nename;
	String nmname;
	static int numberx;
	static int x=0,z=0;
	int p=30,i;
	
	
	
	void address()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your house number");
		int house_number=sc.nextInt();
		System.out.println("Enter your address");
		String address=sc.next();
		System.out.println("Enter postcode");
		int postcode=sc.nextInt();
		
		
	}
	void add()
	{
		
		System.out.println("Enter the name of the medicine that you want to add");
		Scanner sc=new Scanner(System.in);
		nmname=sc.next();
		if(nmname.equals("Crocin")||(nmname.equals("Alprex"))||(nmname.equals("Neumilid")||(nmname.equals("Augmenton")||(nmname.equals("Allegra")||nmname.equals("Paracetamol")||nmname.equals("RefreshTear")||nmname.equals("Citrazen")||nmname.equals("Sompraz")||nmname.equals("Pantadom"))||nmname.equals("Cyclopam"))||nmname.equals("Amplpres")))

			{
			System.out.println("The medicine is already available");
			System.out.println("Do you want to add to the existing stock?\nEnter1.)To Continue or 2.)Exit");
			option=sc.nextInt();
			if(option==1)
			{
				System.out.println("Enter the quantity of the medicine");
				
				number=sc.nextInt();
				
				System.out.println("Enter the expiry date of the medicine");
				
				date=sc.nextInt();
				
				month=sc.nextInt();	
				
				year=sc.nextInt();
				System.out.println("The expiry date is:\n"+date+"/"+month+"/"+year);
				
				
			
				if(year<=2016||date>31||month>12)
				{
					System.out.println("Inavlid date entered");
				}
				else
				{
					System.out.println("Enter the price per tablet");
					
					price=sc.nextDouble();
					System.out.println("The name of the new medicine is:\n"+nmname);
					System.out.println("The price of the new medicine is:\n"+price);
					System.out.println("The quantity of the new medicine is:\n"+number);
					System.out.println("The expiry of the new medicine is:\n"+date+"/"+month+"/"+year);	
					i=p+number;
					System.out.println("The new amount of tablets left are:\n"+i);		
				}
			}
			else
			{
			System.out.println("Thank you for your time");
			}
			}
			else
			{
			System.out.println("Enter the quantity of the medicine");
			
		number=sc.nextInt();
		
		System.out.println("Enter the expiry date of the medicine");
		date=sc.nextInt();
		
		month=sc.nextInt();	
		
		year=sc.nextInt();
		System.out.println("The expiry date is:\n"+date+"/"+month+"/"+year);
		
		if(year<=2016&&date>31&&month>12)
		{
			System.out.println("Inavlid date entered");
		}
		else
		{
			System.out.println("Enter the price per tablet");
			
			price=sc.nextDouble();
			System.out.println("The name of the new medicine is:\n"+nmname);
			System.out.println("The price of the new medicine is:\n"+price);
			System.out.println("The quantity of the new medicine is:\n"+number);
			System.out.println("The expiry of the new medicine is:\n"+date+"/"+month+"/"+year);
			
		}
		
	}
	}
	
	
		
		
		
		
		
		
		
		
		
		
	
	void adds()
	{
		String nmname;
		System.out.println("Enter the name of the equipment that you want to add");
		Scanner sc=new Scanner(System.in);
		nename=sc.next();
		System.out.println("Enter the quantity of equipment");
		number=sc.nextInt();
		
		
			System.out.println("Enter the price of the equipment");
			price=sc.nextDouble();
		
		
	}
	static void upd()
	{
		++x;
		System.out.println("System updated:\n"+x);
		
	}
	



void u()
{
	double amountss;
	Scanner sc=new Scanner(System.in);
	System.out.println("The name of the new added medicine is:\n"+nmname);
	System.out.println("Enter the number of tablets that you require?");
	int l;
	l=sc.nextInt();
	if(l>number)
	{
		System.out.println("This much amount is not available with us right now\nSorry for the inconvinience");
	}
	
	else
	{
		amountss=price*number;
		System.out.println("The price of the medicine is:\n"+amountss);
		System.out.println("Enter the doctors name");
		String dname=sc.next();
		System.out.println("Enter the payment method\n1.)Cash\n2.)Card");
		int choice;
		int card_number;
		int pin;
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
				pin=sc.nextInt();
				if(pin>100&&pin<999){
						System.out.println("The transacation has been completed\nThank you for your purchasal");
						}else
						{
							System.out.println("Wrong pin entered");
						}
						}
				

		}

				}}
			


void ma()
{
	int v;
	v=30-number;
System.out.println("The remaining tablets of medicines are:\n"+v);


}
static void panga()
{
	z++;
	System.out.println("System updated:"+z);
}
void kyu()
{
	int i;
	i=30;
	
	System.out.println("The remaining tablets of meadicines are:\n"+i);
	
	
}
void pass()
{
	Scanner sc=new Scanner(System.in);
	
	}
	
	


}