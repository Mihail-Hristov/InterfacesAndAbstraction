package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Identifiable> guest = new ArrayList<>();

        String input = reader.readLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            if (tokens.length == 3) {
                guest.add(new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            }else {
                guest.add(new Robot(tokens[0], tokens[1]));
            }

            input = reader.readLine();
        }

        String fakeIdEndWith = reader.readLine();

        for (Identifiable identifiable : guest) {
            if (identifiable.getId().endsWith(fakeIdEndWith)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}
