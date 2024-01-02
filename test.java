import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class test {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your names: ");
        String names = sc.nextLine();

        System.out.println("DOB (1989-11-10)");
        String dob = sc.nextLine();
        LocalDate date = LocalDate.parse(dob);

        System.out.println("gender");
        String gender = sc.nextLine();

        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - date.getYear();

        // month calculations
        if ((currentDate.getMonthValue() < date.getMonthValue()) || (currentDate.getMonthValue() == date.getMonthValue()) && (currentDate.getDayOfMonth() < date.getDayOfMonth())){
            age--;
        }

        System.out.println("Welcome " + names + ", you are " + age + " years old and today's date is " + currentDate.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
    }
}
