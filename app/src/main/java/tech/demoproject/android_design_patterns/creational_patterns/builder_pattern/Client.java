package tech.demoproject.android_design_patterns.creational_patterns.builder_pattern;

/** Khi muốn tạo một đối tượng phức tạp thì bạn sẽ làm như thế nào?
 * Có thể bạn sẽ nghĩ tới cách tạo một Constructor dài ngoằng với một
 * chục các tham số. Builder Pattern sẽ cho bạn một cách giải quyết khác.*/

/** Builder Pattern đơn giản hóa việc tạo đối tượng theo cách rất rõ ràng và dễ đọc. Nó phân chia
 *  việc khởi tạo(construction) tổng thể một đối tượng phức tạp ra làm nhiều phần nhỏ.*/

/**Trong Android, Builder design pattern xuất hiện khi sử dụng những đối tượng như
 * AlertDialog.Builder hay NotificationCompat.Builder…. */
public class Client {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setFirstName("Ryan")
                .setLastName("Hoang")
                .setAge(21)
                .create();

        user.Print();
    }
}
