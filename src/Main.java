import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaterialManagement materialManagement = new MaterialManagement();
        System.out.println(materialManagement.createMaterialManagement(scanner));
    }
}
