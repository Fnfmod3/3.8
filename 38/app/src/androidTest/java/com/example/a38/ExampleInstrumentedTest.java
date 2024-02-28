import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> participants = new ArrayList<>();
        participants.add("Участник 1");
        participants.add("Участник 2");
        participants.add("Участник 3");
        participants.add("Участник 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Встряхните смартфон для выбора участника:");

        try {
            scanner.nextLine(); // Ждем ввод пользователя (виртуальная встряска)
            Random random = new Random();
            String selectedParticipant = participants.get(random.nextInt(participants.size()));
            System.out.println("Выбранный участник: " + selectedParticipant);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
