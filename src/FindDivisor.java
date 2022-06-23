import java.util.ArrayList;
import java.util.List;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                nums.add(i);
        }
        return nums.size();
    }
}