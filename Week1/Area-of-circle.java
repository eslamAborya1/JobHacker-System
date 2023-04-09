import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        double a,b,c,d,z;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        z=(d-b)*(d-b)+(c-a)*(c-a);
        System.out.printf("%.4f\n",Math.sqrt(z));
    }
}