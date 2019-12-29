// https://yukicoder.me/problems/no/920

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No920 {

    public static String output = "";

    public static void main(final String[] args) {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final List<Integer> nums = new ArrayList<Integer>();

        String line;
        try {
            line = br.readLine().trim();

            final String[] numTokens = line.split(" ");
            for (final String numToken : numTokens) {
                nums.add(Integer.valueOf(numToken));
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }

        final Solver solver = new Solver();
        solver.solve(nums);

        // Print the final output
        System.out.println(output);
    }
}

class Solver {
    public void solve(final List<Integer> input) {
        final int red = input.get(0);
        final int blue = input.get(1);
        final int white = input.get(2);

        if (Math.abs(red - blue) >= white) {
            // System.out.println("赤玉と青玉の差が大きすぎるので、白玉を少ない方の玉にすべて変換するケース");
            No920.output = String.valueOf(Math.min(red, blue) + white);
        } else {
            // System.out.println("赤玉と青玉の差が少ないので、白玉を均等に割り振るケース");
            No920.output = String.valueOf((red + blue + white) / 2);
        }
    }
}
