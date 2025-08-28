import java.util.Scanner;

public class geometriaplana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Lado: ");
                double lado = sc.nextDouble();
                System.out.println("Área: " + (lado * lado));
                System.out.println("Perímetro: " + (4 * lado));
                break;

            case 2:
                System.out.print("Base: ");
                double baseRetangulo = sc.nextDouble();
                System.out.print("Altura: ");
                double alturaRetangulo = sc.nextDouble();
                System.out.println("Área: " + (baseRetangulo * alturaRetangulo));
                System.out.println("Perímetro: " + (2 * (baseRetangulo + alturaRetangulo)));
                break;

            case 3:
                System.out.print("Base: ");
                double baseTriangulo = sc.nextDouble();
                System.out.print("Altura: ");
                double alturaTriangulo = sc.nextDouble();
                System.out.println("Área: " + ((baseTriangulo * alturaTriangulo) / 2));
                System.out.println("Perímetro: informe os 3 lados:");
                System.out.print("Lado 1: ");
                double l1 = sc.nextDouble();
                System.out.print("Lado 2: ");
                double l2 = sc.nextDouble();
                System.out.print("Lado 3: ");
                double l3 = sc.nextDouble();
                System.out.println("Perímetro: " + (l1 + l2 + l3));
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}