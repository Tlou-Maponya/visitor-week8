import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        // Created two scanners due to 1 scanner not being able to read in all inputs
        //Multiple scanner objects are not advised
        Scanner input = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        Visitor visitor1 = new Visitor();
        MyDate visitDay = new MyDate();
        MyTime visitTime = new MyTime();

        System.out.println("Please enter full name: ");
        String name = input.nextLine();
        visitor1.fullName = name;

        System.out.println("Please enter age: ");
        int age = input.nextInt();
        visitor1.age = age;

        System.out.println("Please enter the date of visit: (e.g 27/01/2020)");
        System.out.println("Enter day of visit: ");
        int d = input.nextInt();
        System.out.println("Enter month of visit: ");
        int m = input.nextInt();
        System.out.println("Enter year of visit: ");
        int y = input.nextInt();

        if(d > 0 && d <= 31 && m > 0 && m <= 12 && y > 1900 && y <= 2090) {
            visitDay.setDate(d, m, y);
            visitor1.dayOfVisit = visitDay;

            System.out.println("Please enter the time of visit: (e.g 22:30)");
            System.out.println("Enter hours of the day: (format: 00-24)");
            int hh = input.nextInt();
            System.out.println("Enter minutes: (format: 0-59)");
            int mm = input.nextInt();

            if(hh >= 0 && hh <=24 && mm >= 0 && mm < 60) {
                visitTime.setTime(hh, mm);
                visitor1.time = visitTime;

                System.out.println("Please enter the comment: ");
                String comments = stringScanner.nextLine();
                visitor1.comments = comments;

                System.out.println("Please enter the assistant's name: ");
                String assist = stringScanner.nextLine();
                visitor1.assist = assist;

                visitor1.save();
                visitor1.load("Tlou Maponya");

            }
            else {
                System.out.println("You have entered an invalid Time.");
            }
        }
        else {
            System.out.println("You have entered an invalid date.");
        }
    }
}
