import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        double a,b,c,average_weight;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        average_weight=((a*2)+(b*3)+(c*5))/10;
        System.out.println(average_weight);
    }
}