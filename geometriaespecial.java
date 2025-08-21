import java.util.Scanner;

public class geometriaespecial {

    static abstract class FiguraEspacial {
        public abstract double area();
        public abstract double volume();
        public String getNome() { return this.getClass().getSimpleName(); }
    }
    //Prisma
    static class Prisma extends FiguraEspacial {
        private double base, altura, profundidade;
        public Prisma(double base, double altura, double profundidade) {
            this.base = base;
            this.altura = altura;
            this.profundidade = profundidade; 
        }
        public double areaLateral() {
            return 2 * (base + altura) * profundidade;
        }
        public double areaTotal() {
            return 2 * (base * altura) + areaLateral();
        }
        @Override
        public double area() {
            return areaTotal();
        }
        @Override
        public double volume() {
            return base * altura * profundidade;
        }
    }
    //Cilindro
    static class Cilindro extends FiguraEspacial {
        private double raio, altura;
        public Cilindro(double raio, double altura) {
            this.raio = raio;
            this.altura = altura;
        }
        public double areaBase() {
            return Math.PI * raio * raio;
        }
        public double areaLateral() {
            return 2 * Math.PI * raio * altura;
        }
        public double areaTotal() {
            return 2 * areaBase() + areaLateral();
        }
        @Override
        public double area() {
            return areaTotal();
        }
        @Override
        public double volume() {
            return areaBase() * altura;
        }
    }

    // Esfera
    static class Esfera extends FiguraEspacial {
        private double raio;
        public Esfera(double raio) {
            this.raio = raio;
        }
        @Override
        public double area() {
            return 4 * Math.PI * raio * raio;
        }
        @Override
        public double volume() {
            return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        }
    }

    // Cone
    static class Cone extends FiguraEspacial {
        private double raio, altura;
        public Cone(double raio, double altura) {
            this.raio = raio;
            this.altura = altura;
        }
        public double geratriz() {
            return Math.sqrt(raio*raio + altura*altura);
        }
        public double areaBase() {
            return Math.PI * raio * raio;
        }
        public double areaLateral() {
            return Math.PI * raio * geratriz();
        }
        public double areaTotal() {
            return areaBase() + areaLateral();
        }
        @Override
        public double area() {
            return areaTotal();
        }
        @Override
        public double volume() {
            return (1.0/3.0) * areaBase() * altura;
        }
    }

    // Tronco de cone
    static class TroncoCone extends FiguraEspacial {
        private double raioMaior, raioMenor, altura;
        public TroncoCone(double raioMaior, double raioMenor, double altura) {
            this.raioMaior = raioMaior;
            this.raioMenor = raioMenor;
            this.altura = altura;
        }
        public double geratriz() {
            return Math.sqrt((raioMaior - raioMenor)*(raioMaior - raioMenor) + altura*altura);
        }
        public double areaBaseMaior() {
            return Math.PI * raioMaior * raioMaior;
        }
        public double areaBaseMenor() {
            return Math.PI * raioMenor * raioMenor;
        }
        public double areaLateral() {
            return Math.PI * (raioMaior + raioMenor) * geratriz();
        }
        public double areaTotal() {
            return areaLateral() + areaBaseMaior() + areaBaseMenor();
        }
        @Override
        public double area() {
            return areaTotal();
        }
        @Override
        public double volume() {
            return (1.0/3.0) * Math.PI * altura * (raioMaior*raioMaior + raioMaior*raioMenor + raioMenor*raioMenor);
        }
    }

    // Validação de entrada
    static double lerValorPositivo(Scanner sc, String mensagem) {
        double valor;
        do {
            System.out.print(mensagem);
            while (!sc.hasNextDouble()) {
                System.out.print("Valor inválido. Tente novamente: ");
                sc.next();
            }
            valor = sc.nextDouble();
            if (valor <= 0) System.out.println("Valor deve ser positivo!");
        } while (valor <= 0);
        return valor;
    }

    // Menu principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("\n Menu Geometria Espacial");
        System.out.println("1. Prisma Reto");
        System.out.println("2. Cilindro");
        System.out.println("3. Esfera");
        System.out.println("4. Cone");
        System.out.println("5. Tronco de Cone");
        System.out.println("0. Sair");
        System.out.print("Escolha a figura: ");
        while (!sc.hasNextInt()) {
            System.out.print("Opção inválida. Tente novamente: ");
            sc.next();
        }
        opcao = sc.nextInt();
        FiguraEspacial figura = null;
        switch (opcao) {
            case 1:
                double base = lerValorPositivo(sc, "Base do prisma: ");
                double altura = lerValorPositivo(sc, "Altura do prisma: ");
                double profundidade = lerValorPositivo(sc, "Profundidade do prisma: ");
                figura = new Prisma(base, altura, profundidade);
                System.out.printf("Área lateral: %.2f\n", ((Prisma)figura).areaLateral());
                System.out.printf("Área total: %.2f\n", ((Prisma)figura).areaTotal());
                System.out.printf("Volume: %.2f\n", figura.volume());
                sc.close();
                return;
            case 2:
                double raioCil = lerValorPositivo(sc, "Raio do cilindro: ");
                double alturaCil = lerValorPositivo(sc, "Altura do cilindro: ");
                figura = new Cilindro(raioCil, alturaCil);
                System.out.printf("Área das bases: %.2f\n", 2 * ((Cilindro)figura).areaBase());
                System.out.printf("Área lateral: %.2f\n", ((Cilindro)figura).areaLateral());
                System.out.printf("Área total: %.2f\n", ((Cilindro)figura).areaTotal());
                System.out.printf("Volume: %.2f\n", figura.volume());
                sc.close();
                return;
            case 3:
                double raioEsf = lerValorPositivo(sc, "Raio da esfera: ");
                figura = new Esfera(raioEsf);
                System.out.printf("Área superficial: %.2f\n", figura.area());
                System.out.printf("Volume: %.2f\n", figura.volume());
                sc.close();
                return;
            case 4:
                double raioCone = lerValorPositivo(sc, "Raio do cone: ");
                double alturaCone = lerValorPositivo(sc, "Altura do cone: ");
                figura = new Cone(raioCone, alturaCone);
                System.out.printf("Área da base: %.2f\n", ((Cone)figura).areaBase());
                System.out.printf("Área lateral: %.2f\n", ((Cone)figura).areaLateral());
                System.out.printf("Área total: %.2f\n", ((Cone)figura).areaTotal());
                System.out.printf("Volume: %.2f\n", figura.volume());
                sc.close();
                return;
            case 5:
                double raioMaior = lerValorPositivo(sc, "Raio maior do tronco: ");
                double raioMenor = lerValorPositivo(sc, "Raio menor do tronco: ");
                double alturaTronco = lerValorPositivo(sc, "Altura do tronco: ");
                figura = new TroncoCone(raioMaior, raioMenor, alturaTronco);
                System.out.printf("Área da base maior: %.2f\n", ((TroncoCone)figura).areaBaseMaior());
                System.out.printf("Área da base menor: %.2f\n", ((TroncoCone)figura).areaBaseMenor());
                System.out.printf("Área lateral: %.2f\n", ((TroncoCone)figura).areaLateral());
                System.out.printf("Área total: %.2f\n", ((TroncoCone)figura).areaTotal());
                System.out.printf("Volume: %.2f\n", figura.volume());
                sc.close();
                return;
            case 0:
                System.out.println("Encerrando o programa...");
                sc.close();
                return;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }
    }
}
