import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import shortage.Buyer;
import shortage.Citizen;
import shortage.Rebel;

public class MainShortage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Buyer> buyers = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 4) {
                String citizenName = tokens[0];
                int citizenAge = Integer.parseInt(tokens[1]);
                String citizenId = tokens[2];
                String citizenBirthdate = tokens[3];
                Citizen citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthdate);
                buyers.add(citizen);
            }
            if (tokens.length == 3) {
                String rebelName = tokens[0];
                int rebelAge = Integer.parseInt(tokens[1]);
                String rebelgroup = tokens[2];
                Rebel rebel = new Rebel(rebelName, rebelAge, rebelgroup);
                buyers.add(rebel);
            }
        }

        String nameWhoBoughtFood = scanner.nextLine();

        while (!nameWhoBoughtFood.equals("End")) {
            for (Buyer buyer:buyers) {
                if (nameWhoBoughtFood.equals(buyer.getClass().getName())) {
                    buyer.buyFood();
                }
            }
            nameWhoBoughtFood = scanner.nextLine();
        }

       //System.out.println(citizen.getfo);

    }
}
