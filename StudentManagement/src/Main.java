import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        saveAStudent();
        inputStudent();
    }

    //muốn nhập info từ bp, ta cần phương tiện nhập, OOP cái gì cx phải là object
    //tương tác với object qua chấm.
    public static void inputStudent() {
        String id, name;
        int yob;
        double gpa;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        while (true) {
            try {
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid year: ");
            }
        }

        System.out.print("Input gpa: ");
        while (true) {
            try {
                gpa = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid GPA: ");
            }
        }

        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    //hard-code fix luôn info sv, ko đã, ước gì nhập từ bàn phím, cũng phải đổ vào Khuôn/phễu
    public static void saveAStudent() {
        Student an = new Student("20225849", "HungBQ", 2004, 3.14);
        an.showProfile();
    }

}