import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Exemplo antigo");
        mostrarExemploAntigo(Carro.ANDAR);
        mostrarExemploAntigo(Carro.PARAR);
        mostrarExemploAntigo(Carro.DESLIGAR);

        System.out.println("\nExemplo 1");
        mostrarExemplo1(Carro.ANDAR);
        mostrarExemplo1(Carro.PARAR);
        mostrarExemplo1(Carro.DESLIGAR);

        System.out.println("\nExemplo 2");
        mostrarExemplo2(Carro.ANDAR);
        mostrarExemplo2(Carro.PARAR);
        mostrarExemplo2(Carro.DESLIGAR);

        System.out.println("\nExemplo 3");
        mostrarExemplo3(Carro.ANDAR);
        mostrarExemplo3(Carro.PARAR);
        mostrarExemplo3(Carro.DESLIGAR);
    }

    public static void mostrarExemploAntigo(Carro c) {
        Carro carro = c;
        String mostrar;

        switch (carro) {
            case ANDAR:
                mostrar = "O carro está andando";
                break;
            case PARAR:
            case DESLIGAR:
                mostrar = "O carro está parado";
                break;
            default:
                mostrar = "Opção inválida";
                break;
        }

        System.out.println(mostrar);
    }

    public static void mostrarExemplo1(Carro c) {
        Carro carro = c;
        String mostrar;

        switch (carro) {
            case ANDAR:
                mostrar = "O carro está andando";
                break;
            case PARAR, DESLIGAR:
                mostrar = "O carro está parado";
                break;
            default:
                mostrar = "Opção inválida";
                break;
        }

        System.out.println(mostrar);
    }

    public static void mostrarExemplo2(Carro c) {
        Carro carro = c;

        String mostrar = switch (carro) {
            case ANDAR:
                yield "O carro está andando";
            case PARAR, DESLIGAR:
                yield "O carro está parado";
            default:
                yield "Opção inválida";
        };

        System.out.println(mostrar);
    }

    public static void mostrarExemplo3(Carro c) {
        Carro carro = c;

        String mostrar = switch (carro) {
            case ANDAR -> "O carro está andando";
            case PARAR, DESLIGAR -> "O carro está parado";
            default -> "Opção inválida";
        };

        System.out.println(mostrar);
    }

}
