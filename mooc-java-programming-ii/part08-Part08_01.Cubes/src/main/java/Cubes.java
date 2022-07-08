
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String strings = scanner.nextLine();

            if (strings.equals("end")) {
                break;
            }
            int stringsCube = Integer.valueOf(strings);
            int cube = stringsCube * stringsCube * stringsCube;
            System.out.println(cube);
            continue;
        }
    }
}
