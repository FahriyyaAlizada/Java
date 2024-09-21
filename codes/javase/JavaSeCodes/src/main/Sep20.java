package main;
import java.util.Scanner;
public class Sep20 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter your age...");
		  int age = input.nextInt();
		  if(age>=18){
	            System.out.println("You're an adult");
	        }
	        else if(age<=17) {
	            System.out.println("You're still a kid");
	        } // tapşırıq 1
		  
		  
		  System.out.println("Enter two number in order to compare them...");
		  int a = input.nextInt();
		  int b = input.nextInt();
		  if(a>b){
	            System.out.println(a + " is greater than " + b);
	        }
	        else if(a<b) {
	            System.out.println(a + " is smaller than " + b);
	        }
	        else {
	            System.out.println(a + " is equals to " + b);
	        } // tapşırıq 2
		  
		  
		  System.out.println("Enter your score in math...");
		  int math = input.nextInt();
		  System.out.println("Enter your score in physics...");
		  int physics = input.nextInt();
		  if(math>=60 && physics>=70){
	            System.out.println("You passed both math and physics");
	        }
	        else if(math<60 && physics<70) {
	            System.out.println("You passed neither of math and physics");
	        }
	        else {
	            System.out.println("You passed only one of them and failed the other one");
	        } // tapşırıq 3
		  
		  
		  System.out.println("Enter the day of the week... (ex. Monday, Tuesday...)");
		  String day = input.nextLine();
		  if(day.equals("Saturday") || day.equals("Sunday")){
	            System.out.println("It's weekend, go and have fun!");
	        }
	        else if(day.equals("Monday") || day.equals("Friday")) {
	            System.out.println("It's the begining or the end of the week");
	        }
	        else {
	            System.out.println("It's weekday, go and study!");
	        } // tapşırıq 4
		  
		  
		  System.out.println("Enter the number of the day...");
		  int dayNum = input.nextInt();
		  switch (dayNum) {
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Thursday");
              break;
          case 5:
              System.out.println("Friday");
              break;
          case 6:
              System.out.println("Saturday");
              break;
          case 7:
              System.out.println("Sunday");
              break;            
          default:
              System.out.println("Invalid day");
              break;
      } // tapşırıq 5
		  
		  
		  System.out.println("Enter a month number...");
		  int monthNum = input.nextInt();
		  switch (monthNum) {
          case 12: // December
          case 1:  // January
          case 2:  // February
              System.out.println("Winter");
              break;
          case 3:  // March
          case 4:  // April
          case 5:  // May
              System.out.println("Spring");
              break;
          case 6:  // June
          case 7:  // July
          case 8:  // August
              System.out.println("Summer");
              break;
          case 9:  // September
          case 10: // October
          case 11: // November
              System.out.println("Autumn");
              break;
          default:
              System.out.println("Invalid month");
              break;
      } // tapşırıq 6
		  
		  
		  System.out.println("Enter a month number to get the name of the month...");
		  int month = input.nextInt();
		  switch (month) {
          case 1:
              System.out.println("January");
              break;
          case 2:
              System.out.println("February");
              break;
          case 3:
              System.out.println("March");
              break;
          case 4:
              System.out.println("April");
              break;
          case 5:
              System.out.println("May");
              break;
          case 6:
              System.out.println("June");
              break;
          case 7:
              System.out.println("July");
              break;
          case 8:
              System.out.println("August");
              break;
          case 9:
              System.out.println("September");
              break;
          case 10:
              System.out.println("October");
              break;
          case 11:
              System.out.println("November");
              break;
          case 12:
              System.out.println("December");
              break;
          default:
              System.out.println("Invalid month");
              break;
      } // tapşırıq 7
		  
		  
		  System.out.println("List of the fruits in our market");
		  System.out.println("-> Apple - 1.5 $"
  			+ "\n"
  			+ "-> Orange - 2.0 $"
  			+ "\n"
  			+ "-> Banana - 1.8 $"
  			+ "\n"
  			+ "-> Grape - 3.0 $");
		  System.out.println("What would you like to buy?");
		  String fruit = input.nextLine();
          switch (fruit) {
      case "Apple":
          System.out.println("It costs 1.5 $");
          break;
      case "Orange":
          System.out.println("It costs 2.0 $");
          break;
      case "Banana":
          System.out.println("It costs 1.8 $");
          break;
      case "Grape":
          System.out.println("It costs 3.0 $");
          break;
      default:
          System.out.println("Invalid fruit");
          break;
  } // tapşırıq 8
          
          input.close();
		  
	}

}
