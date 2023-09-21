import java.util.Scanner;
class cricketer
{
	static Scanner sc=new Scanner(System.in);
	String nm,id;
	performance p1;
	cricketer()
	{
		nm=id=null;
	}
	cricketer(String d_nm,String d_id)
	{
		id=d_id;
		nm=d_nm;
	}
	void set_data()	
	{
		System.out.println("Enter Name Of The Cricketer: ");
		nm=sc.next();
		System.out.println("Enter ID No Of The Cricketer: ");
		id=sc.next();	
		p1=new performance();		
	/*1=Test
	2=ODI
	3=20-20
	4=Test+ODI
	5=ODI+20-20
	6=Test+20-20
	7=Test+ODI+20-20
	*/
	}
	void disp_all(cricketer c[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Name: "+c[i].nm+"\n ID No: "+c[i].id);
			c[i].p1.disp();
		}
	}
}
class T20
{
	static Scanner sc=new Scanner(System.in);
	int noOfPlayedMatches,noOfHalfCentury,noOfWickets;
	double avg;
	int rank;
	T20()
	{
		//noOfHalfCentury=0;
		//noOfPlayedMatches=0;	
		noOfWickets=noOfPlayedMatches=noOfHalfCentury=0;	
		avg=0.0f;
		rank=0;
	}
	void set_data(int skill)
	{
		//noOfHalfCentury=h;
		System.out.println("Enter No Of Played Matches: ");
		noOfPlayedMatches=sc.nextInt();	
		//noOfPlayedMatches=n;
		if(skill==1)
		{
			System.out.println("Enter Total No Half Centuries Of All Played Matches: ");
			noOfHalfCentury=sc.nextInt();
		}
		if(skill==2)
		{
			System.out.println("Enter Total Wickets Of All Played Matches: ");
			noOfWickets=sc.nextInt();
		}
		//noOfPlayedMatches=n;
		/*if(skill==1)
		{
			noOfHalfCentury=h;
		}
		if(skill==2)
		{
			noOfWickets=h;
		}*/
		int sum=noOfWickets+noOfHalfCentury;
		System.out.println("sum: "+sum+"played Match: "+noOfPlayedMatches); 
		avg = ((double) sum) / noOfPlayedMatches;
		avg=avg*100;
		System.out.println(avg);
	}
	void cal_rank(T20[] t1,int n)
	{	
		int i;
		double max_avg=0.0f;
		int tr[]=new int[n];
		for(i=0;i<n;i++)
		{
			if(t1[i].avg>max_avg)
			{
				max_avg=t1[i].avg;
			}
		}
		int rank=1;
		for(i=0;i<n;i++)
		{		
			for(int j=0;j<n;j++)
			{
				if(t1[j].avg>t1[i].avg)
				{
					rank++;
				}
			}
			tr[i]=rank;
			rank=1;
		}
		for(i=0;i<n;i++)
		{
			t1[i].rank=tr[i];
		}
	}
	double get_rank(int skill)
	{

		if(noOfPlayedMatches==0)
		{
			return -1;	
		}
		else
		{
			return avg;
		}
	}
	void disp(int skill)
	{
		System.out.println("No Of Played Matches : "+noOfPlayedMatches);
		if(skill==1)
		{
			System.out.println("The Cricketer Is Batsman");
			System.out.println("No Of Half Century: "+noOfHalfCentury);		
		}
		if(skill==2)
		{
			System.out.println("The Cricketer Is Bowler");
			System.out.println("The No Of Wickets: "+noOfWickets);	
		}
		System.out.println("Rank Is: "+rank);
	}
}
class oneDay
{
	static Scanner sc=new Scanner(System.in);
	int noOfPlayedMatches,noOfHalfCentury,noOfWickets;
	double avg;
	int rank;
	oneDay()
	{
		noOfWickets=noOfPlayedMatches=noOfHalfCentury=0;	
		avg=0.0f;
		rank=0;
	}
	void set_data(int skill)
	{
		System.out.println("Enter No Of Played Matches: ");
		noOfPlayedMatches=sc.nextInt();	
		if(skill==1)
		{
			System.out.println("Enter Total No Half Centuries Of All Played Matches: ");
			noOfHalfCentury=sc.nextInt();
		}
		if(skill==2)
		{
			System.out.println("Enter Total Wickets Of All Played Matches: ");
			noOfWickets=sc.nextInt();
		}
		int sum=noOfWickets+noOfHalfCentury;
		System.out.println("sum: "+sum+"played Match: "+noOfPlayedMatches); 
		avg = ((double) sum) / noOfPlayedMatches;
		avg=avg*100;
		System.out.println(avg);
	}
	double get_rank(int skill)
	{
		if(noOfPlayedMatches==0)
		{
			return -1;	
		}
		else
		{
			return avg;
		}
	}
	void disp(int skill)
	{
		System.out.println("No Of Played Matches : "+noOfPlayedMatches);
		if(skill==1)
		{
			System.out.println("The Cricketer Is Batsman");
			System.out.println("No Of Half Century: "+noOfHalfCentury);		
		}
		if(skill==2)
		{
			System.out.println("The Cricketer Is Bowler");
			System.out.println("The No Of Wickets: "+noOfWickets);	
		}
		System.out.println("Rank Is: "+avg);
	}
}
class test
{
	static Scanner sc=new Scanner(System.in);
	int noOfPlayedMatches,noOfHalfCentury,noOfWickets;
	double avg;
	int rank;
	test()
	{
		noOfWickets=noOfPlayedMatches=noOfHalfCentury=0;	
		avg=0.0f;
		rank=0;
	}
	void set_data(int skill)
	{
		System.out.println("Enter No Of Played Matches: ");
		noOfPlayedMatches=sc.nextInt();	
		if(skill==1)
		{
			System.out.println("Enter Total No Half Centuries Of All Played Matches: ");
			noOfHalfCentury=sc.nextInt();
		}
		if(skill==2)
		{
			System.out.println("Enter Total Wickets Of All Played Matches: ");
			noOfWickets=sc.nextInt();
		}
		int sum=noOfWickets+noOfHalfCentury;
		System.out.println("sum: "+sum+"played Match: "+noOfPlayedMatches); 
		avg = ((double) sum) / noOfPlayedMatches;
		avg=avg*100;
		System.out.println(avg);
	}
	double get_rank(int skill)
	{
		if(noOfPlayedMatches==0)
		{
			return -1;	
		}
		else
		{
			return avg;
		}
	}
	void disp(int skill)
	{
		System.out.println("No Of Played Matches : "+noOfPlayedMatches);
		if(skill==1)
		{
			System.out.println("The Cricketer Is Batsman");
			System.out.println("No Of Half Century: "+noOfHalfCentury);		
		}
		if(skill==2)
		{
			System.out.println("The Cricketer Is Bowler");
			System.out.println("The No Of Wickets: "+noOfWickets);	
		}
		System.out.println("Rank Is: "+avg);
	}
}
class performance
{
	int match,skill;
	int i,n,temp;
	static int count;
	static Scanner sc=new Scanner(System.in);
	T20 t1=null;
	oneDay t2=null;
	test t3=null;
	cricketer c1[];
	performance()
	{
		System.out.println("\n1. Test Match \n2. One Day Match \n3. 20-20 Match \n4.Test & One Day Match  \n 5. One Day & 20-20 Match \n6. Test & 20-20 Match \n7. Test Match, One Day Match And 20-20 Match");
		match=sc.nextInt();
		System.out.println("\n1. Batsman\n2. Bowler\nSelect Skill Of That Cricketer");
		skill=sc.nextInt();
		//System.out.println("Enter No Of Played Matches: ");
		//n=sc.nextInt();
		switch(match)
		{	
			case 1:
				t3=new test();
				if(skill==1)
				{	
					t3.set_data(skill);
				}
				if(skill==2)
				{
					t3.set_data(skill);
				}
				break;
			case 2:
				t2=new oneDay();
				if(skill==1)
				{	
					t2.set_data(skill);
				}
				if(skill==2)
				{
					t2.set_data(skill);
				}
				break;
			case 3:
				t1=new T20();
				if(skill==1)
				{	
					//System.out.println("Enter Total Runs Of All Played Matches: ");
					//temp=sc.nextInt();
					t1.set_data(skill);
					//System.out.println("Rank Of That Cricketer: "+t1.get_rank(skill));
				}
				if(skill==2)
				{
					//System.out.println("Enter Total Wickets Of All Played Matches: ");
					//temp=sc.nextInt();
					t1.set_data(skill);
					//System.out.println("Rank Of That Cricketer: "+Double.toString(t1.get_rank(skill)));
				}
				break;
		}		
//		cal();
	/*Match 1=Test
	2=ODI
	3=20-20
	4=Test+ODI
	5=ODI+20-20
	6=Test+20-20
	7=Test+ODI+20-20
	*/
	}
	void disp()
	{
		switch(match)
		{
			case 1:
				System.out.println("The Cricketer Is Playing Test Match");
				t3.disp(skill);
				break;
			case 2:
				System.out.println("The Cricketer Is Playing One Day Match");
				t2.disp(skill);
				break;
			case 3:
				System.out.println("The Cricketer Is Playing T20 Match");
				t1.disp(skill);
				 T20[] t20Cricketers = new T20[n];  // Create an array to hold T20 cricketers
                		t20Cricketers[0] = t20;  // Assuming you have one T20 cricketer, adjust this as needed
                		t20.cal_rank(t20Cricketers, 1);
				break;
		}
	}
	/*performance(int n)
	{
		count=n;
		c1[]=new cricketer[n];
		for(int i=0;i<count;i++)
		{
			c1[i]=new cricketer();
			c1[i].set_data();
		}			
	}*/
	/*performance(int s,int m)
	{
		skill=s;
		match=m;
	}*/
	/*void cal()
	{
		switch(match)
		{
			case 3:
				System.out.println("1. Batsman\n2. Bowler\nSelect Skill Of That Cricketer");
				try
				{
					int temp=sc.nextInt();
					if(temp==1 || temp==2)
					{
						//T20 t1=new T20();
						//skill=temp;
						//System.out.println("Enter No Of Played Matches: ");
						//n=sc.nextInt();
						if(skill==1)
						{	
							System.out.println("Enter Total Runs Of All Played Matches: ");
							temp=sc.nextInt();
							t1.set_data(n,skill,temp);
							System.out.println("Rank Of That Cricketer: "+t1.get_rank());
						}
						if(skill==2)
						{
							System.out.println("Enter Total Wickets Of All Played Matches: ");
							temp=sc.nextInt();
							t1.set_data(n,skill,temp);
							System.out.println("Rank Of That Cricketer: "+t1.get_rank());
						}
					}
					else
					{
						throw new Exception("Skill Must Be 1 or 2");	
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex.toString());
				}			
		}
	}*/
	/*Skill 1=Batsman
	2=Bowler
	3=All Rounder*/
}
class cricketer_main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Players: ");
		int n=sc.nextInt();
		cricketer c1[]=new cricketer[n];			
		for(int i=0;i<n;i++)
		{
			c1[i]=new cricketer();
			c1[i].set_data();
		}
		c1[0].disp_all(c1,n);
		//p1.cal();
	}
}