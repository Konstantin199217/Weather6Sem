package project;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class UserInterfaceView {
    Controller controller = new Controller();
    public void runInterface(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;\n" +
                    "Введите 5 для прогноза  на 5 дней;\n" +
                    "Для выхода введите 0 \n");

            String command = scanner.nextLine();

            if(command.equals("0")) break;

            try{
                controller.getWeather(command, city);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        UserInterfaceView userInterfaceView = new UserInterfaceView();

        userInterfaceView.runInterface();
    }
}
