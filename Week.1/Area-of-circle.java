import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        double r = in.nextDouble();
        double a = r * r * 3.14159;
        System.out.printf("A=%.4f\n",a);
    }
}