package strings;//: strings/ReplacingStringTokenizer.java

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";

        StringTokenizer stoke = new StringTokenizer(input);
        System.out.print("[");
        while (stoke.hasMoreElements())
            System.out.print(stoke.nextToken() + ", ");
        System.out.print("]");

        System.out.println();

        System.out.println(Arrays.toString(input.split(" ")));

        Scanner scanner = new Scanner(input);
        System.out.print("[");
        while (scanner.hasNext())
            System.out.print(scanner.next() + ", ");
        System.out.print("]");
    }
} /* Output:
But I'm not dead yet! I feel happy!
[But, I'm, not, dead, yet!, I, feel, happy!]
But I'm not dead yet! I feel happy!
*///:~
