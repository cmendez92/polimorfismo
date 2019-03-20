class poly
	{
		public void disp()
			{
				System.out.println("This is the example of polymorphism");
			}
		public void disp(String name)
			{
				System.out.println("Name	:"+name);
			}
		public void disp(String name,int age)
			{				
				System.out.println("Name	:"+name);
				System.out.println("Age	:"+age);
			}
		public void disp(String name,int age,String city)
			{				
				System.out.println("Name	:"+name);
				System.out.println("Age	:"+age);				
				System.out.println("City	:"+city);
			}
		public void disp(String name,int age,String city,int roll)
			{				
				System.out.println("Name	:"+name);
				System.out.println("Age	:"+age);			
				System.out.println("City	:"+city);
				System.out.println("Roll	:"+roll);
			}
	}
class polimorfismo
	{
		public static void main(String a[])
			{
				poly obj1=new poly();
				poly obj2=new poly();
				poly obj3=new poly();
				poly obj4=new poly();
				poly obj5=new poly();

				obj1.disp();
				obj2.disp("Arun");
				obj3.disp("Arun",21);
				obj4.disp("Arun",21,"Salem");
				obj5.disp("Arun",21,"Salem",001);			
			}
	}
