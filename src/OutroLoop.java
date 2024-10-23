import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        double assessment = 0;
        double notice = 0;
        double total = 0;
        while (notice != -1) {
            System.out.println("Diga a nota do filme...");
            notice = reading.nextDouble();
            if (notice != -1) {
                assessment += notice;
                total++;
            }
        }
        System.out.println("A média do filme é " + assessment / total );
    }
}
