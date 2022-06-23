import java.util.Arrays;

import static java.util.Arrays.stream;

public class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int nbOccurences = 1;
        for (int i = 0, length = a.length; i < length; i++) {
            if (i < length - 1) {
                if (a[i] == a[i + 1]) {
                    nbOccurences++;
                }
            } else
                return a[i];
            if (i < length - 1 && a[i] != a[i + 1]) {
                if (nbOccurences % 2 == 1)
                    return a[i];
                nbOccurences = 1;
            }
        }
        return 1234567890;


        //return stream(a).reduce(0, (x, y) -> x ^ y);

        /*int acc = 0;
        for (int i : a) {
            acc = acc ^ i;
        }
        return acc;
         */

        /*
        int odd=0;
    for (int item: A)
      {
        odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
      }

    return odd;
         */
    }
}
