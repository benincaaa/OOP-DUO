import java.util.Scanner;

public class Aplicacao {
    private Scanner ler = new Scanner(System.in);

    public void exibir() {
        while (true) {
            System.out.println("\nEscolha a Geometria desejada para calcular");
            System.out.println("1 - Geometria Plana");
            System.out.println("2 - Geometria Espacial");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    new GeometriaPlana().exibir();
                    break;
                case 2:
                    //new GeometriaEspacial().exibir(); 
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }


    public static void main(String[] args) {
        new Aplicacao().exibir();
    }
}