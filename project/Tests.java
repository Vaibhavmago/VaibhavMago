package project;
import java.util.*;
public class Tests {

	
	void test()
	{
		int ch,choice;
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter from the following options\n1.)Blood Test\n2.)MRI\n3.)CT Scan\n4.)Ultrasound");
		ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("Please select again from one of the following options\n1.)Hemogram\n2.)CBC\n3.)LFT and KFT\n4.)Blood sugar fasting\n5.)Lipid Profile");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Please pay Rs 120");
			System.out.println("Your report will reach within 10 hours");
		}
		else if(choice==2)
		{
			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Please pay Rs 220");
			System.out.println("Your report will reach within 10 hours");
		}
		
		else if(choice==3)
		{
			System.out.println("Please press 1 for LFT and 2 for KFT");
			int k;
			k=sc.nextInt();
			if(k==1)
			{
	
			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Please pay Rs 420");
			System.out.println("Your report will reach within 10 hours");
			}
			
			else
			{
				System.out.println("Enter the patients name");
				String name=sc.next();
				System.out.println("Enter the doctors name");
				String dname=sc.next();
				System.out.println("Please pay Rs 520");
			
			}
		}
		else if(choice==4)
		{
			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Please pay Rs 1220");
			System.out.println("Your report will reach within 10 hours");
		
		}
		else if(choice==5)
		{
			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Please pay Rs 520");
			System.out.println("Your report will reach within 10 hours");
		}
		
		}
		else if(ch==2)
		{

			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Your report will reach you within 1 day");
		
		}
		else if(ch==3)
		{

			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Your report will reach within 10 hours");
		}
		
		else if(ch==4)
		{

			System.out.println("Enter the patients name");
			String name=sc.next();
			System.out.println("Enter the doctors name");
			String dname=sc.next();
			System.out.println("Your report will reach within 10 hours");
		}
		
		else
		{
			System.out.println("We do not have the following facility available with us");
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
	}

