public class Dog {
    public String name; //chừa chỗ điền tên
    private int yob; //chừa chỗ điền năm sinh
    private double weight;//chừa chỗ điền cân nặng

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public void bark() {
        System.out.printf("|GOGO|%-10s|%4d|%4.1f|", name, yob, weight);
        System.out.println("");
    }
    //mỗi object sinh ra thường có hồ sơ: đt bán trên tgdd thông số chi tiết,
    //mua về đập hộp thì cũng thấy một cuốn sách nhỏ ghi toàn bộ thông số
    //vào mục setting thấy toàn bộ thông số
    //cccd/cmnd cũng là 1 dạng hồ sợ: show thông tin cơ bản đủ nhận ra bạn
    //...
    //con người cũng có profile trên FB, Email,...
    //nhu cầu show ra thông tin dc dổ đc đúc đang có là có thật cho mọi object
    //có 2 cách để show info đang có: nhờ tool tự viết ( alt+ínert )
    //hoặc tự viết
    //cách tự genarate tool tự viết giùm thì theo cách của nó
    //hàm toString() biến đổi mọi info ta có thành chuỗi, ko thèm in ra, return

    @Override //khác OverLoad, nó liên quan đến kế thừa - INHERTITANCE
    //          cả 2 cùng dính liên quan đến POLYMORPHISM, đa sắc thái, đa xạ đa hình
    public String toString() {
        String tmpMsg = String.format("|GOGO|%-10s|%4d|%4.1f|", name, yob, weight);
        return tmpMsg;
    }
    //ai có nhiều info, gã đó nên xử lí, cung cấp cái tiện ích ra bên ngoài
    //mình có năm sinh, sẵn sàng trả lời câu hỏi tuổi
    public int getAge() {
        return 2024-yob;
    }
}
