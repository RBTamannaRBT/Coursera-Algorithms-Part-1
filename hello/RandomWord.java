import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String c = "";
        String champ = StdIn.readString();
        int i = 1;
        while (!StdIn.isEmpty()) {
            i++;
            c = StdIn.readString();
            if (StdRandom.bernoulli((1.0 / i))) {
                champ = c;
            }
        }
        StdOut.println(champ);
    }
}