import java.util.Random;

public class VinGenerator {

    private static final String CHARACTERS = "ABCDEFGHJKLMNPRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random random = new Random();
    private static final int LENGTH = 17;

    public static String generateVin() {
        StringBuilder stringBuilder = new StringBuilder(LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            stringBuilder.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return stringBuilder.toString();
    }
}
