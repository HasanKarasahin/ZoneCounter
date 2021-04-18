package hasan_karasahin;

import java.util.Random;

/**
 *
 * @author hasan_karasahin
 */
public class Utils {
    
    public static final int CoordinatesAreInvalid = -50;
    public static final int NotFoundZeroValue = -99;
    public static final int BoundaryNumber = 1;
    
    public static void main(String[] args) {
        System.out.println("--->"+getRandomNumber());
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(99999999 - 0) + 1;
    }
}
