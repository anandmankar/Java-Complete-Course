
import java.util.Scanner;

public class MonthOfYearSwitch49 {

        public void oldSwitch(int month) {
            switch(month) {
                case 1: System.out.println("January");
                        break;
                
                case 2: System.out.println("February");
                        break;

                case 3: System.out.println("March");
                        break;

                case 4: System.out.println("April");
                        break;

                case 5: System.out.println("May");
                        break;
            
                case 6: System.out.println("June");
                        break;

                case 7: System.out.println("July");
                        break;

                case 8: System.out.println("August");
                        break;

                case 9: System.out.println("September");
                        break;

                case 10: System.out.println("Octomber");
                        break;

                case 11: System.out.println("November");
                        break;

                case 12: System.out.println("December");
                        break;

                default: System.out.println("Invalid month");
            }
        }

        public void newSwitch(int month) {
            String s = switch(month) {
                case 1 -> "Jan";
                case 2 -> "Feb";
                case 3 -> "Mar";
                case 4 -> "Apr";
                case 5 -> "May";
                case 6 -> "Jun";
                case 7 -> "Jul";
                case 8 -> "Aug";
                case 9 -> "Sep";
                case 10 -> "Oct";
                case 11 -> "Nov";
                case 12 -> "Dec";
                default -> "Invalid";
            };
            System.out.println(s);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month: ");
        int month = sc.nextInt();

        MonthOfYearSwitch49 m = new MonthOfYearSwitch49();
        // m.oldSwitch(month);
        m.newSwitch(month);

        
    }
}
