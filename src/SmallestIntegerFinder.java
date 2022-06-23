import java.util.*;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        // get and return the smallest one
        return Arrays.stream(args).min().getAsInt();
    }
}
