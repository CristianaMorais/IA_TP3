import java.util.LinkedList;
import java.util.Scanner;

class Trip_Plan {

    public static void show_menu(){
        System.out.println("Escolha o numero da pergunta:");
        System.out.println();
        System.out.println("A -> Em que dias da semana há um voo direto de Place1 para Place2?");
        System.out.println("B -> Quais são os voos disponiveis para ir de Place1 a Place2 no dia D?");
        System.out.println("C -> Tenho que visitar N locais, em que comecando meu voo a partir de X no dia D1 e retornando para Y no dia D2. Em que sequencia devo visitar estas cidades de forma que eu não tenha mais que um voo por dia?");
        System.out.println();
        System.out.println("voos -> Ver todas as viagens");
        System.out.println("sair -> Para sair do programa");
        System.out.println();
        System.out.print("Qual é a pergunta que pretende?: ");
        System.out.println();       
    }
    
    public static void readInput(Scanner in){
        String input = "";

        while (true){
            show_menu();
            input = in.next();
            System.out.println();
            perguntas(input);
        }
    }

    public static void perguntas(String input){
        Viagens v = new Viagens();

        Scanner in = new Scanner(System.in);
        switch (input){
            case "A" :{
                System.out.print("Place1: ");
                String a = in.next();
                System.out.print("Place2: ");
                String b = in.next();

                String [] dias = v.vooDireto(a,b);
                System.out.print("\nDias de voo: ");
                if(v.diferenteLocal(dias)){
                    for (String d : dias){
                        if(!d.equals(".")){
                            System.out.print(d + "  ");
                        }
                    }
                    System.out.println();
                    System.out.println();
                }
                else
                    System.out.println("Nao existe voo direto");
                break;
            }

            case "B":{
                System.out.print("Place1: ");
                String a = in.next();
                System.out.print("Place2: ");
                String b = in.next();
                System.out.print("D: ");
                String d = in.next();

                LinkedList<String> corse = new LinkedList<String>();
                LinkedList<Flight> avioes = new LinkedList<Flight>();

                int []arr_Time = {0,0};

                System.out.println();
                v.diaPercurso(a,b,d,corse,arr_Time,avioes);
                v.diaRota();
                System.out.println();

                break;
            }

            case "C":{
                LinkedList<String> list = new LinkedList<>();
                LinkedList<String> route =new LinkedList<>();

                System.out.println("Insira \".\" quando terminar de inserir as cidades para visitar");
                System.out.print("N: ");
                String locais = in.next();

                while (!locais.equals(".")) {
                    list.addLast(locais);
                    System.out.print("N: ");
                    locais = in.next();
                }

                System.out.print("X: ");
                String a = in.next();
                System.out.print("D1: ");
                String D1 = in.next();
                System.out.print("Y: ");
                String b = in.next();
                System.out.print("D2: ");
                String D2 = in.next();
                System.out.println();


                System.out.print("ROTA DA VIAGEM: ");
                System.out.println();
                v.visita(a,b,list,D1,D2,route);
                v.printVisita(D1);
                break;
            }

            case "voos" :
            v.printBaseDados();
            break;
            

            case "sair":

            System.exit(0);
            break;

            default:
            System.out.println("Opção Inválida!");
            System.out.println();
            System.out.println();
            break;

        }
    }

    public static void main(String[] args){
        Viagens v = new Viagens();
        v.baseDados();
        Scanner in = new Scanner(System.in);
        readInput(in);
    }
}
