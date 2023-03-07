import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberStream {

    public static double oddNumberFraction(int sise) {
        List <Integer> list = new ArrayList<>();

        generation(list, sise);

        int count = (int) list.stream().filter(odd -> odd % 2 != 0).count();
        return ((double) count) / list.size() * 100;
    }

    private static void generation (List <Integer> list, int sise) {
        Random random = new Random();

        for (int i = 0; i < sise; i++) {
            list.add(random.nextInt(-1000, 1000));
        }
    }
}
