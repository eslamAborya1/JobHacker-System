package JobHacker_System.Week1;

import java.io.IOException;
import java.util.Scanner;

public class Average_2 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        double a,b,c,average_weight;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        average_weight=((a*2)+(b*3)+(c*5))/10;
        System.out.printf("MEDIA = %.1f\n",average_weight);
    }
}
