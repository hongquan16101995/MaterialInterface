import java.time.LocalDate;
import java.util.Scanner;

public class MaterialManagement {
    public MaterialManagement() {
    }

    public Material createMaterialManagement(Scanner scanner){
        System.out.println("Nhập vào id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập vào name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào manufacturingDate: ");
        System.out.println("Nhập vào năm: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào tháng: ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào ngày: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào cost: ");
        int cost = scanner.nextInt();
        scanner.nextLine();
        LocalDate localDate = LocalDate.of(year, month, day);
        switch (name) {
            case "Meat":
                System.out.println("Nhập vào weight: ");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                return new Meat(id, name, localDate, cost, weight);
            case "CrispyFlour":
                System.out.println("Nhập vào quantity: ");
                double quantity = scanner.nextDouble();
                scanner.nextLine();
                return new CrispyFlour(id, name, localDate, cost, quantity);
            default:
                System.out.println("Bạn đã nhập sai tên. Đề nghị nhập lại thông tin");
                createMaterialManagement(scanner);
        }
        return null;
    }
}
