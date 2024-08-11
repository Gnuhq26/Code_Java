import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //saveAStudents();
        //inputStudent();
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
    public static void saveAStudents() {
        Student an = new Student("20225849", "HungBQ", 2004, 3.14);
        Student Bom = new Student("20225848", "Hungsieudz", 2009, 3.16);
        an.showProfile();
        Bom.showProfile();

        System.out.println("Check the public/private");
        //xem chấm khi có public trong khuôn;
        String s1Name = an.name;
        System.out.println("an name: " + s1Name);
        System.out.println(an.getName());
        System.out.println(an.name);
        //khi sờ trực tiếp đặc điểm, tức là ta chạm trực tiếp biến, chạm biến ~ get() set ()

        an.name = "Siêu chim to";
        an.setName("Chim to nữa");
        an.showProfile();
        Bom.showProfile();
        //static là vùng nhớ vùng chung cho các object cùng loại
        //ai cùng nghĩ là của mình, nhưng thực tế là chung
        //nếu 1 ai đó tác động, thì tất cả bị ảnh hưởng
        //giá trị cuar vùng static chung cho tất cả các object hiện tại và tương lai,
        //WC tập thể chung cho cả dãy lầu
        //sờ static đừng sờ qua kiểu tư hữu mà nên sờ theo kiểu Class chấm Static
        System.out.println("Student name: " + Student.name);
        //có 2 loại chấm: chấm qua biến object hàm ý non-static, đồ thuộc từng object
        //chấm thứ 2: đồ static xài chung, new cả tỉ lần cũng chỉ có 1 vùng ram, chung cả đám
        //vậy chấm qua cả đám hợp lí hơn


    }

}