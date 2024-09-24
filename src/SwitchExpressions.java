https://www.google.com/chrome/import java.util.Scanner;

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
1nN47cj81HnL9rc5dnRr6M_M_I3DSIIr_yfdTWiahnQo
        System.out.println("\nExemplo 3");
        mostrarExemplo3(Carro.ANDAR);
        mostrarExemplo3(Carro.PARAR);
        mostrarExemplo3(Carro.DESLIGAR);
    }

    // Como o mesmo código era feito no Java 11 e inferiores
    public static void mostrarExemploAntigo(Carro c) {´
        Carro carro = c;
        String mostrar;

        // Se carro == Carro.ANDAR. Irá mostrar na tela:
        // "O carro está andando", caso seja igual a PARAR e DESLIGAR,
        // irá mostrar, "O carro está parado"
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

        // Como Carro.PARAR e Carro.DESLIGAR tem a mesma saída
        // São postos juntos no switch case
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

        // Para evitar escrever várias atribuições a mostrar
        // O switch case é atribuído a mostrar e retorna um valor com yield
        // (Importante denotar que não era yield no Java 12, mas o próprio break)
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

        // Geralmente o yield é usado para quando há uma lógica de
        // programação dentro do case, caso não haja, é possível reduzir
        // ainda mais o código colocando setas que retornam o valor
        String mostrar = switch (carro) {
            case ANDAR -> "O carro está andando";
            case PARAR, DESLIGAR -> "O carro está parado";
            default -> "Opção inválida";
        };

        System.out.println(mostrar);
    }

}
