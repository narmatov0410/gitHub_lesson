import container.ComponentController;
import database.DataBase;

public class Main {
    public static void main(String[] args) {
        System.out.println(DataBase.initData());
        ComponentController.authController.start();
    }
}