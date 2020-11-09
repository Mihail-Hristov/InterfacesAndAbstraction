package DefineAnInterfacePerson;


import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfPeople = Integer.parseInt(reader.readLine());

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] tokens = reader.readLine().split("\\s+");
            String name = tokens[0];
            if (tokens.length == 4) {
                buyers.put(name, new Citizen(name, Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
            }else if (tokens.length == 3) {
                buyers.put(name, new Rebel(name, Integer.parseInt(tokens[1]), tokens[2]));
            }
        }

        String searchingName = reader.readLine();

        while (!"End".endsWith(searchingName)) {
            if (buyers.containsKey(searchingName)) {
                buyers.get(searchingName).buyFood();
            }

            searchingName = reader.readLine();
        }

        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());

        /*String input = reader.readLine();

        List<Birthable> birthables = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String kind = tokens[0];

            switch (kind) {
                case "Citizen":
                    birthables.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));

                    break;
                case "Pet":
                    birthables.add(new Pet(tokens[1], tokens[2]));

                    break;
            }

            input = reader.readLine();
        }

        String searchingYear = reader.readLine();

        for (Birthable unit : birthables) {
            if (unit.getBirthDate().endsWith(searchingYear)) {
                System.out.println(unit.getBirthDate());
            }
        }*/
    }
}
