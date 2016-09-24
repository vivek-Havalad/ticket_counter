package trains;
import java.util.*;
public class MainClass {
	 
	
	private static final String integer = null;

	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		String [] cd=new String[30];
		int[] a=new int[30];
	int [] b=new int[30];
	int sum=0;
	for(int i:a)
	{
		a[i]=0;b[i]=0;
	}
		Object from,to;
		while(true)
		{
		System.out.println("enter choice 1 to continue 0 to display");
		int cp=sc.nextInt();
		if(cp==1)
		{
		System.out.println("Enter the from station:");
		
			from=sc.next();
		
		
		System.out.println("Enter the to station:");
			to =sc.next();
			
			cd[1]="Hanuman";
			cd[2]="domlur";
			cd[3]="white";
			cd[4]="majestic";
			cd[5]="giri";
			
			
			Map<String, Integer> m1 = new HashMap<String, Integer>(); 
			m1.put("hanuman", 1);
		      m1.put("domlur", 2);
		      m1.put("white", 3);
		      m1.put("majestic", 4);
		      m1.put("giri", 5);

	    /*Map<Object, Integer> m2=new HashMap<Object, Integer>();
	    m2.put("Hanumant_nagar", 0);
	      m2.put("domlur", 0);
	      m2.put("whitefield", 0);
	      m2.put("mejastic", 0);
	      m2.put("girinagar", 0);
	      Map<Object, Integer> m3=new HashMap<Object, Integer>();
		    m3.put("Hanumant_nagar", 0);
		      m3.put("domlur", 0);
		      m3.put("whitefield", 0);
		      m3.put("mejastic", 0);
		      m3.put("girinagar", 0);
	      System.out.println();*/
	    /*  Object t=from;
	      
	    int  sum=0;
	    Object u;
	    int y=0;
	    		y=(int) m2.get(from);
	    		m2.put(from, (int)m2.get(from)+1);
	    	//	System.out.println(m2.get(from));*/
	      int n=(int)m1.get(from);
	    		int n2=(int)m1.get(to);
	      int Stations=n2-n;
	      if(Stations==0)
	      {
	    	  System.out.println("invalid Route");
	    	  continue;
	      }
	      if(Stations<0)
	      {
	    	  Stations=-Stations;
	      }
	     if(Stations<=3)
	     {
	    	// System.out.println(11);
	    	 sum=11;
	     }
	     else if(n==1&&n2==5||n==5&&n2==1)
	    	 sum=25;
	     else
	     {
	    	 int sum1=(Stations-3)*3;
	    	 sum1=sum1+11;
	    	 System.out.println(sum1);
	     }
	     
	     int u=m1.get(from);
	     a[u]+=sum;b[u]+=1;
	     System.out.println("Enter the Gender to print the ticket");
	     String pp=sc.next();
	     System.out.println("Ticket:from "+from+" to "+to+" total amout to pay: "+sum+" Gender "+ pp);
	     /*System.out.println(a[u]);
	     System.out.println(b[u]);*/
		}
		else
		{
			for(int i=1;i<=5;i++)
				System.out.println(cd[i]+" "+"tickets sold "+b[i]+" amount="+a[i]);
		}
	     /*System.out.println("m3="+m3.get(from));
	    int c=m3.get(from);
	    System.out.println(c);
	     c+=sum;
	     System.out.println(c);
	     u=from;
	     System.out.println(u);
	   
	     m3.put(u,c);
	   //  System.out.println(m2.get(from));
	     //System.out.println(m3.get(from));
	*/
	     }
	}
}
