package Basic;
public class ChangeProper {
    public static void main(String[] args) {
        String fullName = "nguyễn huỳnh duyên";
        System.out.println("Họ tên định dạng Proper: " + formatName(fullName));
    }

    public static String formatName(String fullName) {
        // Chia họ tên thành các từ bằng khoảng trắng
        String[] words = fullName.split(" ");
        StringBuilder properName = new StringBuilder();

        // Xử lý từng từ để chuyển đổi thành Proper Case
        for (String word : words) {
            if (!word.isEmpty()) {
                // Chuyển đổi chữ cái đầu tiên thành chữ hoa
                String firstLetter = word.substring(0, 1).toUpperCase();
                // Lấy phần còn lại của từ và chuyển đổi thành chữ thường
                String restOfWord = word.substring(1).toLowerCase();
                // Ghép lại Proper Case
                properName.append(firstLetter).append(restOfWord).append(" ");
            }
        }

        // Loại bỏ khoảng trắng thừa ở cuối và trả về
        return properName.toString().trim();
    }
}
