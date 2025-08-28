import java.util.Scanner;

public class GeometriaEspacial  {
   
     public void exibir() {
        Scanner ler = new Scanner(System.in);
        while (true) {
            System.out.println("1) Cilindro");
            System.out.println("2) Pirâmide Triangular");
            System.out.println("3) Esfera");
            System.out.println("4) Cone");
            System.out.println("5) Troncos");
            System.out.println("6) Prismas");
            System.out.println("7) - Voltar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int formaespacial = ler.nextInt();

            switch (formaespacial) {
                case 1: cilindro(); break;
                case 2: piramide(); break;
                case 3: esfera(); break;
                case 4: cone(); break;
                case 5: tronco(); break;
                case 6: prismas(); break;
                case 7: return;
                case 0: System.exit(0);
                default: System.out.println("Opção inválida!");
            }
        }
    }


    //CILINDRO
      public void cilindro() {
        Scanner ler = new Scanner(System.in);

        int rcilindro;
        int hcilindro;
        System.out.printf("Qual o RAIO do cilindro?");
        rcilindro = ler.nextInt();
        System.out.printf("Qual a ALTURA do cilindro?");
        hcilindro = ler.nextInt();

        System.out.println("1) Área das bases");
        System.out.println("2) Área lateral");
        System.out.println("3) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhacilindro = ler.nextInt();

            if (escolhacilindro == 1) {
                int areadasbasesc = rcilindro ^ 2;
                System.out.printf("Área das bases:" +areadasbasesc,"π");
            }
            else if (escolhacilindro == 2) {
                int arealateralc = 2 * rcilindro * hcilindro;
                System.out.printf("Área lateral:" +arealateralc,"π");
            }
            else if (escolhacilindro == 3) {
            int volumec = (rcilindro ^ 2) * hcilindro;
            System.out.printf("Volume:" +volumec,"π");
            }
        }


        //PIRAMIDE
        public void piramide() {
        Scanner ler = new Scanner(System.in);

        int bpiramide;
        int appiramide;
        int hpiramide;
        System.out.printf("Qual a BASE da pirâmide?");
        bpiramide = ler.nextInt();
        System.out.printf("Qual a APÓTEMA da pirâmide?");
        appiramide = ler.nextInt();
        System.out.printf("Qual a ALTURA da pirâmide?");
        hpiramide = ler.nextInt();

        System.out.println("1) Área lateral");
        System.out.println("2) Área total");
        System.out.println("3) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhapiramide = ler.nextInt();

        int arealateralp = (bpiramide * appiramide) / 2;
        int areadabasep = (bpiramide * hpiramide) / 2;

            if (escolhapiramide== 1) {
                System.out.printf("Área lateral:" +arealateralp);
            }
            else if (escolhapiramide == 2) {
                int areatotalp = areadabasep + arealateralp;
                System.out.printf("Área total:" +areatotalp);
            }
            else if (escolhapiramide == 3) {
            int volumep = (areadabasep * hpiramide) / 3;
            System.out.printf("Volume:" +volumep);
            }
        }


        //ESFERA
        public void esfera() {
        Scanner ler = new Scanner(System.in);

        int resfera;
        System.out.printf("Qual o RAIO da esfera?");
        resfera = ler.nextInt();

        System.out.println("1) Área superficial");
        System.out.println("2) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhaesfera = ler.nextInt();

            if (escolhaesfera == 1) {
                int areasuperficiale = 4 * (resfera ^ 2);
                System.out.printf("Área das bases:" +areasuperficiale,"π");
            }
            else if (escolhaesfera == 2) {
                int volumee = (4 / 3) * (resfera ^ 3);
                System.out.printf("Área lateral:" +volumee,"π");
            }
        }


        //CONE
        public void cone() {
        Scanner ler = new Scanner(System.in);

        int rcone;
        int gcone;
        int hcone;
        System.out.printf("Qual o RAIO do cone?");
        rcone = ler.nextInt();
        System.out.printf("Qual a GERATRIZ do cone?");
        gcone = ler.nextInt();
        System.out.printf("Qual a ALTURA do cone?");
        hcone = ler.nextInt();

        System.out.println("1) Área lateral");
        System.out.println("2) Área da base");
        System.out.println("2) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhacone = ler.nextInt();

            if (escolhacone == 1) {
                int arealateralc = rcone * gcone ;
                System.out.printf("Área lateral:" +arealateralc,"π");
            }
            else if (escolhacone == 2) {
                int areadabasec = rcone ^ 2;
                System.out.printf("Área da base:" +areadabasec,"π");
            }

            else if (escolhacone == 3) {
                int volumeco = (rcone * hcone) / 3;
                System.out.printf("Volume:" +volumeco,"π");
            }
        }

        //TRONCO
        public void tronco() {
        Scanner ler = new Scanner(System.in);

        int rpequenotronco;
        int rgrandetronco;
        int htronco;
        System.out.printf("Qual o RAIO PEQUENOS do tronco?");
        rpequenotronco = ler.nextInt();
        System.out.printf("Qual o RAIO GRANDE do tronco?");
        rgrandetronco = ler.nextInt();
        System.out.printf("Qual a ALTURA do tronco?");
        htronco = ler.nextInt();

        System.out.println("1) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhatronco = ler.nextInt();

            if (escolhatronco == 1) {
                int volumet = (htronco * ((rpequenotronco + (rpequenotronco ^ 2)) * (rgrandetronco + (rgrandetronco ^ 2)))) / 3 ;
                System.out.printf("Volume:" +volumet,"π");
            }
            else if (escolhatronco == 2) {
                System.out.printf("não tem...");
            }
        }

        public void prismas(){
        Scanner ler = new Scanner(System.in);

        int hprisma;
        int pprisma;
        int lprisma;
        System.out.printf("Qual o LADO do prisma?");
        lprisma = ler.nextInt();
        System.out.printf("Qual a ALTURA do prisma?");
        hprisma = ler.nextInt();
        System.out.printf("Qual o SEMI-PERÍMETRO da pirâmide?");
        pprisma = ler.nextInt();

        System.out.println("1) Área lateral");
        System.out.println("2) Área total");
        System.out.println("3) Volume");
        System.out.println("O que tu quer calcular?");
        int escolhaprisma = ler.nextInt();

        int baseprisma = lprisma * pprisma;
        if (escolhaprisma == 1) {
                int parealateral = 2 * pprisma * hprisma;
                System.out.printf("Area Lateral:" +parealateral);
            }
        else if (escolhaprisma == 2) {
            int prismaareatotal = ((2 * pprisma) * hprisma) + (2 * baseprisma);
            System.out.printf("Area Total: "+prismaareatotal);
            }

        else if (escolhaprisma == 3) {
            int volumeprisma = baseprisma * hprisma;
            System.out.printf("Volume: "+volumeprisma);
        }

        }
    }