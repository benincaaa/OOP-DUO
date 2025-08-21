import java.util.Scanner;

public class geometriaplana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGEOMETRIA PLANA");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retngulo");
            System.out.println("3 - Triangulo");
            System.out.println("4 - Circulo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Lado: ");
                    double lado = sc.nextDouble();
                    System.out.println("Área: " + (lado * lado));
                    System.out.println("Perímetro: " + (4 * lado));
                }
                case 2 -> {
                    System.out.print("Base: ");
                    double base = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    System.out.println("Área: " + (base * altura));
                    System.out.println("Perímetro: " + (2 * (base + altura)));
                }
                case 3 -> {
                    System.out.print("Base: ");
                    double base = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    System.out.println("Área: " + ((base * altura) / 2));
                    System.out.println("Perímetro: informe os 3 lados:");
                    System.out.print("Lado 1: ");
                    double l1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    double l2 = sc.nextDouble();
                    System.out.print("Lado 3: ");
                    double l3 = sc.nextDouble();
                    System.out.println("Perímetro: " + (l1 + l2 + l3));
                }
                case 4 -> {
                    System.out.print("Raio: ");
                    double raio = sc.nextDouble();
                    System.out.println("Área: " + (Math.PI * raio * raio));
                    System.out.println("Perímetro (circunferência): " + (2 * Math.PI * raio));
                }
                case 0 -> System.out.println("Encerrando...");
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}
