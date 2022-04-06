package person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Birthable> thingsWithBirthday = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String objectType = tokens[0];

            switch (objectType) {
                case "Citizen":
                    String citizenName = tokens[1];
                    int citezenAge = Integer.parseInt(tokens[2]);
                    String citizenId = tokens[3];
                    String citizenBurthday = tokens[4];
                    Citizen citizen = new Citizen(citizenName, citezenAge, citizenId, citizenBurthday);
                    thingsWithBirthday.add(citizen);
                    break;
                case "Pet":
                    String petsName = tokens[1];
                    String petsBirthday = tokens[2];
                    Pet pet = new Pet(petsName, petsBirthday);
                    thingsWithBirthday.add(pet);
                    break;
                case "Robot":
                    String robotsId = tokens[1];
                    String robotsModel = tokens[2];
                    Robot robot = new Robot(robotsId, robotsModel);
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();
        boolean isFound = false;

        for (Birthable birthable : thingsWithBirthday) {
            if (birthable.getBirthDate().endsWith(year)) {
                isFound = true;
                System.out.println(birthable.getBirthDate());
            }
        }
        if (!isFound) {
            System.out.println("<no output>");
        }
    }
}
