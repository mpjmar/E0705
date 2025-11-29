public class App {
    public static void main(String[] args) throws Exception {

        int numeros[] = new int[8];
        int max = 0, min = Integer.MAX_VALUE;
        System.out.println("Vaya introduciendo números por teclado y pulsando INTRO: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
            max = numeros[i] > max ? numeros[i] : max;
            min = numeros[i] < min ? numeros[i] : min;
        }
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            System.out.printf(numeros[i] == min ? "mínimo%n" : numeros[i] == max ? "máximo%n" : "%n");
        }
        System.out.println();
    }
}
