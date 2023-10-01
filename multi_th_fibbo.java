class buffer
{
	int id,counter;
	int a,b,c;
	buffer()
	{
		a=0;
		b=1;
		c=0;
		counter=1;
		System.out.println(a);
		try
		{
			Thread.sleep(100);
		}	
		catch(InterruptedException io)
		{
		}
		System.out.println(b);	
		try
		{
			Thread.sleep(100);
		}	
		catch(InterruptedException io)
		{
		}
	}
	synchronized void fibbonacci(int s,int e,int id)
	{
		while(counter!=id)
		{
			try
			{	
				wait();
			}	
			catch(InterruptedException io)
			{
			}
		}	
		if(counter==1)
		{
			e=e-2;
		}
		for(int i=s;i<=e;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException io)
			{
			}
		}
		counter++;
		notifyAll();
	}
}
class multi_th_fibbo extends Thread
{
	buffer b1;
	int id,s,e;
	multi_th_fibbo(buffer d_b1,int id,int s,int e)
	{
		super();
		b1=d_b1;
		this.id=id;
		this.s=s;
		this.e=e;
		start();
	}	
	public void run()
	{
		b1.fibbonacci(s,e,id);
	}
}
class multi_th_fibbo_main
{
	public static void main(String s[])
	{
		buffer b1=new buffer();
		multi_th_fibbo m1=new multi_th_fibbo(b1,1,1,10);
		multi_th_fibbo m2=new multi_th_fibbo(b1,2,11,20);
		try
		{
			m1.join();
			m2.join();
		}
		catch(InterruptedException io)
		{
		}
	}
} 