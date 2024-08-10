//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //    biến  value đơn
        Dog chiHu = new Dog("Chi HU HU", 2024, 0.5);
      //kiểu data - dạng data phức tạp, object data type
        chiHu.bark(); //một object làm hành động gì đó

        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2023, 99.5);
        ngaoDa.bark() ;
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);
        System.out.println(ngaoDa.toString());

        //J: ko in tọa độ, nó hiểu là vào vùng ram của object show hết info
        //gọi ngầm hàm toString() khi in biến object
        //nếu ko có toString() rõ ràng trong Khuôn mà lại đòi in ra chi tiết của biến object
        //đang trỏ object, thì JVM tự động in ra 1 con sôs HEXA, gọi là HASH-NUMBER
        //mã băm của vùng ram, toàn bộ data đc đổ vào của object đc băm theo thuật toán
        //convert theo 1 thuật toán để ra đc 1 con số đặc trưng
        //MD5, SHA-256.......

        //in ra tuổi, giao tiếp với object qua việc hỏi/hành động
        System.out.println("NĐ age: " + ngaoDa.getAge());
    }
}
//Toán từ NEW sẽ nhân bản cái Khuôn, sẵn sàng đón vật liệu vào
//Bao nhiêu phát NEW, bấy nhiều lần dùng phễu, bấy nhiêu lần tạo phôi trắng
//mở Khuôn tháo tượng đã khô bỏ ra chừa chỗ chuẩn bị đúc
//Như vậy cứ NEW là trong ram sẽ có bản copy của Khuôn
//vậy bao nhiêu thì bấy nhiều biến name chừa chỗ, biến yob chừa chỗ
//Phễu đổ data vào đúng chỗ thừa tương ứng
//bài này t có đến 2 name, ND k đụng hàng đè chết CH