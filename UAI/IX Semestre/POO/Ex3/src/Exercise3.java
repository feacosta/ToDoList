
public class Exercise3 {
	 public static void main (String [] args){
		  String day = "Thursday";
		  int date = 16;
		  String month = "July";
		  int year = 2015;
		  
		  System.out.println("Day of the week:"+ day);
		  System.out.println("Day:"+ date);
		  System.out.println("Month:" + month);
		  System.out.println("Year:" + year);
		  
		  System.out.println(day+", "+month+" "+date+", "+year);
		  
		  System.out.println("American format:");
		  printAmerican(day, month, date, year);
		  System.out.println("European format:");
		  printEuropean(day, date, month, year);
		 }
	 public static void printAmerican(String day,String month, int date, int year){
		 System.out.println(day+", "+month+" "+date+", "+year);
	 }
	 public static void printEuropean(String day, int date, String month, int year){
		 System.out.println(day+" "+date+" "+month+", "+year);
	 }
		}
