package homeworks.task1;

public class Task1Servlet {

	public static void main(String[] args) 
	{
		int i = 5;
		int j = 10;
		String str = "My first string";
		System.out.println(str);
		System.out.println("Some txt: "+str);
		int k = i+j;
		System.out.println(k);
		System.out.println("Sum: "+k);
		System.out.println("Sum: "+(i+j));
		while(i<j)
		{
			System.out.println(str);
			i++;
		}
		if(i==j)
		{
			System.out.println("i="+i+", j="+j+" и они равны");
		}
		else
		{
			System.out.println("i="+i+", j="+j+" и они НЕ равны");
		}
		
		if(args.length>0)
			for(int m=0;m<args.length;m++)
				System.out.println(args[m]);
	}

}
