package project;
import java.util.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) throws Exception {
		int choice,ch;
		int kal=1;
			String ma;
		int choi=1;
		int choices,choicesss;
		String choicess,password;
String name,nmname;
	Scanner sc=new Scanner(System.in);
Meadicine s=new Meadicine();
Equipment e=new Equipment();
Addition a=new Addition();

Tests t=new Tests();
System.out.println("\n       					--------------");
System.err.println("\n					Mago Drug Wala");
System.out.println("					--------------");
System.out.println("Enter the password to continue");

password=sc.next();


	
		if(!password.equals("Vaibhav"))
{
	throw new Exception("Wrong Password Entered");

}
else if(password.equals("Vaibhav"))
		{
	Date d1=new Date();
		Calendar c1=Calendar.getInstance();
		c1.setTime(d1);
		System.out.println("The login timings are:\n"+d1.toString());
		
			System.err.println("Password entered is correct");
			{
				System.out.println("Enter from the following options\n1.)Medicines\n2.)Equipments\n3.)Addition of new stock\n4.)To check the remaining tablet's of meadicine\n5.)To view out other branches\n6.)Tests");					

			choice=sc.nextInt();
			if(choice==1) 
			{
				s.details();
				
				
System.err.println("Press 1 to Confirm and O to Exit");
choicesss=sc.nextInt();

if(choicesss==1)
{


			s.updates();
			
		
}
else
{
	System.err.println("The system has not been updated");
}
			}
		
			

			else if(choice==2)
			{
				e.detail();
			}
			else if(choice==3)
			{
				System.out.println("Press \n 1.) To add Medicine stock\nPress \n 2.) To add Equipments");
				choices=sc.nextInt ();
				if(choices==1){
				a.add();
				s.dont();
				System.err.println("Press 1 to Confirm and O to Exit");
				choicesss=sc.nextInt();
				if(choicesss==1)
				{


							a.upd();
							
				}
			
				
				else
				{
					System.err.println("The system has not been updated");
				}
							}
				else if(choices==2)
				{
				a.adds();
				System.err.println("Press 1 to Confirm and O to Exit");
				choicesss=sc.nextInt();
				if(choicesss==1)
				{


							a.upd();
							//s.panga();
				}
				else
				{
					System.err.println("The system has not been updated");
				}
							}
				else{
					System.err.println("Invalid input entered");
				}
				
			}
			else if(choice==4)
			{
				System.out.println("Enter the name of the medicine that you want to check the stock of");
				ma=sc.next();
				if(ma.equals("Crocin")||(ma.equals("Alprex"))||(ma.equals("Neumilid")||(ma.equals("Augmenton")||(ma.equals("Allegra")||ma.equals("Paracetamol")||ma.equals("RefreshTear")||ma.equals("Citrazen")||ma.equals("Sompraz")||ma.equals("Pantadom"))||ma.equals("Cyclopam"))||ma.equals("Amplpres")))
				
					{s.show();
			}
				else
				{
				System.out.println("The following medicine is not available with us");	
				}
			}
			else if(choice==5)
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
				else
				{
					System.err.println("Wrong input entered");
				}
			
			
			
			}
			else if(choice==6)
			{
	t.test();
			}
			else
			{
				System.err.println("Wrong input entered");
			}
			System.err.println("Do you want to continue? Enter\nYes to Continue\n Or No to Exit");
			choicess=sc.next();
			
			if(choicess.equals("Yes"))
				for(int v=1;v<50;v++)
				{
			{
				do
				{
				System.out.println("Enter from the following options\n1.)Medicines\n2.)Equipments\n3.)Addition of new stock\n4.)To check the remaining tablet's of meadicine\n5.)To view out other branches\n6.)Tests\n7.)Feedback\n8.)Exit");	
				
				choice=sc.nextInt();
				if(choice==1)
				{
				System.out.println("To buy the medicine that is recently added in the stock please select from the following options\nPress 1 or Press 0 to check from the meadicines alredy available in the stock");
				kal=sc.nextInt();	
				if(kal==1)
					{
					a.u();	
					}
					else
					{
				
				
				s.details();
					
					
				
				
				
				System.err.println("Press 1 to Confirm and O to Exit");
				choicesss=sc.nextInt();
				if(choicesss==1)
				{


							s.updates();
							//s.panga();
				}
				else
				{
					System.err.println("The system has not been updated");
				}
							}
				}
				else if(choice==2)
				{
					e.detail();
				}
				else if(choice==3)
				{
					System.out.println("Press \n 1.) To add Medicine stock\nPress \n 2.) To add Equipments");
					choices=sc.nextInt ();
					if(choices==1){
					a.add();
					System.err.println("Press 1 to Confirm and O to Exit");
					choicesss=sc.nextInt();
					if(choicesss==1)
					{


								a.upd();
								//s.panga();
					}
					else
					{
						System.err.println("The system has not been updated");
					}
					}			
					else if(choices==2)
					{
					a.adds();
					System.err.println("Press 1 to Confirm and O to Exit");
					choicesss=sc.nextInt();
					}					
				}else if(choice==4)
				{

					System.out.println("To show the details of the remaining medicines that were recently updated\nPress 1 to see or Press 0 to to see details of other meadicines");
				int l,m;
				l=sc.nextInt();
				if(l==1)
				{
					a.ma();
				}else 
				{
					System.out.println("To show the original number of meadicines available\nPress 1 or Press 0 to see the updated value");
					m=sc.nextInt();
					if(m==1)
					{

						System.out.println("Enter the name of the medicine that you want to check the stock of");
						ma=sc.next();
						if(ma.equals("Crocin")||(ma.equals("Alprex"))||(ma.equals("Neumilid")||(ma.equals("Augmenton")||(ma.equals("Allegra")||ma.equals("Paracetamol")||ma.equals("RefreshTear")||ma.equals("Citrazen")||ma.equals("Sompraz")||ma.equals("Pantadom"))||ma.equals("Cyclopam"))||ma.equals("Amplpres")))
						
						a.kyu();
					}
					else
					{
						s.show();
					
					}
					
					}
				}
				else if(choice==5)
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
					else if(choice==6)
					{
						t.test();
						}
					else if(choice==7)
					{
						String decoy=sc.next();
						System.out.println("Please enter your name");
						String n=sc.nextLine();
						System.out.println("Enter your feedback");
						String feedback=sc.next();
						System.out.println("Thank you for your time");
					}
					else if(choice==8)
					{
						System.out.println("Thank you for your time");
						break;
					}
						
				}while(choice!=8);
				}
				}
					
				}
				
			}	
			
	}}

					
				
			
			
		
	

					