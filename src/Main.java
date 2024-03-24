import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seasonName;

        while (true) {
            System.out.println("Сыграем в игру: \"Угадай время года\"");
            System.out.println("Введите название времени года: ");
            seasonName = scanner.nextLine();

            if (seasonName.equals(Seasons.SPRING.name())) {
                System.out.println("Вы угадали сезон!");
                break;
            } else if (seasonName.equals("end")) {
                System.out.println("До свидания");
                break;
            } else {
                System.out.println("Попробуйте угадать еще раз");
            }
        }
    }
}