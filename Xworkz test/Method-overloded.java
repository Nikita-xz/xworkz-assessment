METHOD OVERLOADING: two or more methods can have same name if they differ in parameters. The methods have same signature but different arguments.

public class Stars{
	public static void shining (String sky){
		System.out.println("invoked shining ");
		System.out.println("arg sky: "+sky);
		
	}
	public static void shining(String sky,String noOfPlanets)
	{
		System.out.println("invoked shining with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 sky: " +sky);
		System.out.println("arg2 noOfPlanets: "+noOfPlanets);
		
	}
	
	public static void shining(String sky,int noOfPlanets)
	{
		
		System.out.println("invoked shining with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 sky: " +sky);
		System.out.println("arg2 noOfPlanets: "+noOfPlanets);
	}
	
	public static void shining(int noOfPlanets,String sky)
	{
		System.out.println("invoked shining with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfPlanets: "+noOfPlanets);
		System.out.println("arg2 sky: " +sky);
		
	}
	
	
	
}



public class StarsTester{


public static void main(String[] beautiful)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+beautiful.length);	
        
		String white="Color";
		Stars.shining(white);

		Stars.shining(white,6);
		
		Stars.shining(white,"small");
		Stars.shining("6","color");


	System.out.println("EXIT :: main");	
}

}