import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = scanner.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }

        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / 3);
    }
}
