import java.util.Scanner;

public class GeometriaPlana {
    private Scanner ler = new Scanner(System.in);

    public double AreaQuadrado(double lado) {
        return lado * lado;
    }

    public double PerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    //
    public double AreaRetangulo(double a, double b) {
        return a * b;
    }

    public double PerimetroRetangulo(double a, double b) {
        return 2 * (a + b);
    }

    //
    public double AreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double PerimetroTriangulo(double a, double b, double c) {
        return a + b + c;
    }
    //
    public double AreaTrianguloEquilatero(double lado) {
        return (Math.sqrt(3) / 4) * (lado * lado);
    }

    public double PerimetroTrianguloEquilatero(double lado) {
        return 3 * lado;
    }

    // 
    public double AreaParalelogramo(double base, double altura) {
        return base * altura;
    }

    public double PerimetroParalelogramo(double a, double b) {
        return 2 * (a + b);
    }

    // 
    public double AreaLosango(double D, double d) {
        return (D * d) / 2;
    }

    public double PerimetroLosango(double lado) {
        return 4 * lado;
    }

    //
    public double AreaTrapezio(double B, double b, double h) {
        return ((B + b) * h) / 2;
    }

    public double PerimetroTrapezio(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    //
    public double AreaCirculo(double r) {
        return Math.PI * r * r;
    }

    public double PerimetroCirculo(double r) {
        return 2 * Math.PI * r;
    }


    public void exibir() {
        while (true) {
            System.out.println("\n Escolha a forma Geometrica desejada");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Triângulo Equilátero");
            System.out.println("5 - Paralelogramo");
            System.out.println("6 - Losango");
            System.out.println("7 - Trapézio");
            System.out.println("8 - Círculo");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1: Quadrado(); break;
                case 2: Retangulo(); break;
                case 3: Triangulo(); break;
                case 4: TrianguloEquilatero(); break;
                case 5: Paralelogramo(); break;
                case 6: Losango(); break;
                case 7: Trapezio(); break;
                case 8: Circulo(); break;
                case 9: return;
                case 0: System.exit(0);
                default: System.out.println("Opção inválida!");
            }
        }
    }

    private void Quadrado() {
        System.out.println("\n Você escolheu o Quadrado");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        System.out.print("Informe o lado: ");
        double a = ler.nextDouble();

        if (op == 1) {
            System.out.println("Área: " + AreaQuadrado(a));
        } else if (op == 2) {
            System.out.println("Perímetro: " + PerimetroQuadrado(a));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void Retangulo() {
        System.out.println("\n Você escolheu o Retângulo");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        System.out.print("Informe o lado A: ");
        double a = ler.nextDouble();
        System.out.print("Informe o lado B: ");
        double b = ler.nextDouble();

        if (op == 1) {
            System.out.println("Área: " + AreaRetangulo(a, b));
        } else if (op == 2) {
            System.out.println("Perímetro: " + PerimetroRetangulo(a, b));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void Triangulo() {
        System.out.println("\n Você escolheu o Triângulo");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        if (op == 1) {
            System.out.print("Base: ");
            double a = ler.nextDouble();
            System.out.print("Altura: ");
            double h = ler.nextDouble();
            System.out.println("Área: " + AreaTriangulo(a, h));
        } else if (op == 2) {
            System.out.print("Lado A: ");
            double a = ler.nextDouble();
            System.out.print("Lado B: ");
            double b = ler.nextDouble();
            System.out.print("Lado C: ");
            double c = ler.nextDouble();
            System.out.println("Perímetro: " + PerimetroTriangulo(a, b, c));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void TrianguloEquilatero() {
        System.out.println("\n Você escolheu o Triângulo Equilátero");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        System.out.print("Lado: ");
        double l = ler.nextDouble();

        if (op == 1) {
            System.out.println("Área: " + AreaTrianguloEquilatero(l));
        } else if (op == 2) {
            System.out.println("Perímetro: " + PerimetroTrianguloEquilatero(l));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void Paralelogramo() {
        System.out.println("\n Você escolheu o Paralelogramo");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        if (op == 1) {
            System.out.print("Base: ");
            double a = ler.nextDouble();
            System.out.print("Altura: ");
            double h = ler.nextDouble();
            System.out.println("Área: " + AreaParalelogramo(a, h));
        } else if (op == 2) {
            System.out.print("Lado A: ");
            double a = ler.nextDouble();
            System.out.print("Lado B: ");
            double b = ler.nextDouble();
            System.out.println("Perímetro: " + PerimetroParalelogramo(a, b));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void Losango() {
        System.out.println("\n Você escolheu o Losango");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        if (op == 1) {
            System.out.print("Diagonal maior: ");
            double D = ler.nextDouble();
            System.out.print("Diagonal menor: ");
            double d = ler.nextDouble();
            System.out.println("Área: " + AreaLosango(D, d));
        } else if (op == 2) {
            System.out.print("Lado: ");
            double a = ler.nextDouble();
            System.out.println("Perímetro: " + PerimetroLosango(a));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void Trapezio() {
        System.out.println("\n Você escolheu o Trapézio");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        if (op == 1) {
            System.out.print("Base maior: ");
            double B = ler.nextDouble();
            System.out.print("Base menor: ");
            double b = ler.nextDouble();
            System.out.print("Altura: ");
            double h = ler.nextDouble();
            System.out.println("Área: " + AreaTrapezio(B, b, h));
        } else if (op == 2) {
            System.out.print("Lado A: ");
            double a = ler.nextDouble();
            System.out.print("Lado B: ");
            double b = ler.nextDouble();
            System.out.print("Lado C: ");
            double c = ler.nextDouble();
            System.out.print("Lado D: ");
            double d = ler.nextDouble();
            System.out.println("Perímetro: " + PerimetroTrapezio(a, b, c, d));
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void Circulo() {
        System.out.println("\n Você escolheu o Círculo");
        System.out.println("1 - Calcular Área");
        System.out.println("2 - Calcular Perímetro");
        int op = ler.nextInt();

        System.out.print("Raio: ");
        double r = ler.nextDouble();

        if (op == 1) {
            System.out.println("Área: " + AreaCirculo(r));
        } else if (op == 2) {
            System.out.println("Perímetro: " + PerimetroCirculo(r));
        } else {
            System.out.println("Opção inválida!");
        }
    }
}