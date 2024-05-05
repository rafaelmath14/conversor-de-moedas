import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();

        String menu = """
                    ####### Sejam vem vindos ao conversor de moedas #######
                    
                    Digite o número que represente a sua escolha
                    
                    1) USD (Dólar Americano) => BRL (Real Brasileiro)
                    2) BRL( Real BRASILEIRO) => BOB (Boliviano)
                    3) CLP ( Peso Chileno) => COP (Peso Colombiano)
                    4) BOB (Boliviano) => ARS (Peso Argentino)
                    5) ARS (Peso Argentino) => BRL (Real Brasileiro)
                    6) USD (Dólar Americano) => ARS (Peso Argentino)
                    7) Digite uma moeda de origem, destino e quantidade.
                    8) Sair
                    _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                """;
        System.out.println(menu);


        while (true) {
            System.out.println("Digite o número que representa as opções acima:");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite a quantidade da moeda de origem: ");
                double quantidadeMoedaOrigem = scanner.nextDouble();
                double resultado = conversorDeMoeda.converter("USD", "BRL", quantidadeMoedaOrigem);
                System.out.println("\n____________Resultado____________");
                System.out.println(quantidadeMoedaOrigem + "[USD]" + " => " + "[BRL]" + resultado);
            }
            if (opcao == 2) {
                System.out.println("Digite a quantidade da moeda de origem: ");
                double quantidadeMoedaOrigem = scanner.nextDouble();
                double resultado = conversorDeMoeda.converter("BRL", "BOB", quantidadeMoedaOrigem);
                System.out.println("\n____________Resultado____________");
                System.out.println(quantidadeMoedaOrigem + "[BRL]" + " => " + "[BOB]" + resultado);
            }
            if (opcao == 3) {
                System.out.println("Digite a quantidade da moeda de origem: ");
                double quantidadeMoedaOrigem = scanner.nextDouble();
                double resultado = conversorDeMoeda.converter("CLP", "COP", quantidadeMoedaOrigem);
                System.out.println("\n____________Resultado____________");
                System.out.println(quantidadeMoedaOrigem + "[CLP]" + " => " + "[COP]" + resultado);
            }
            if (opcao == 4) {
                System.out.println("Digite a quantidade da moeda de origem: ");
                double quantidadeMoedaOrigem = scanner.nextDouble();
                double resultado = conversorDeMoeda.converter("BOB", "ARS", quantidadeMoedaOrigem);
                System.out.println("\n____________Resultado____________");
                System.out.println(quantidadeMoedaOrigem + "[BOB]" + " => " + "[ARS]" + resultado);
            }
            if (opcao == 5) {
                System.out.println("Digite a quantidade da moeda de origem: ");
                double quantidadeMoedaOrigem = scanner.nextDouble();
                double resultado = conversorDeMoeda.converter("ARS", "BRL", quantidadeMoedaOrigem);
                System.out.println("\n____________Resultado____________");
                System.out.println(quantidadeMoedaOrigem + "[ARS]" + " => " + "[BRL]" + resultado);
            }
            if (opcao == 6) {
                System.out.println("Digite a quantidade da moeda de origem: ");
                double quantidadeMoedaOrigem = scanner.nextDouble();
                double resultado = conversorDeMoeda.converter("USD", "ARS", quantidadeMoedaOrigem);
                System.out.println("\n____________Resultado____________");
                System.out.println(quantidadeMoedaOrigem + "[USD]" + " => " + "[ARS]" + resultado);
            }
            if (opcao == 7) {
                System.out.println("Digite o símbolo da moeda de origem: ");
                String moedaOrigem = scanner.next();
                System.out.println("Digite o símbolo da moeda de destino: ");
                String moedaDestino = scanner.next();
                System.out.println("Digite a quantidade da moeda de origem: ");
                double quantidadeMoedaOrigem = scanner.nextDouble();
                double resultado = conversorDeMoeda.converter("USD", "BRL", quantidadeMoedaOrigem);
                System.out.println("\n____________Resultado____________");
                System.out.println(quantidadeMoedaOrigem + "[" + moedaOrigem + "]" + " => " + "[" + moedaDestino + "]" + resultado);
            }
            if (opcao == 8) {
                break;
            }
        }

        System.out.println("*****Obrigado por ter utilizado o nosso conversor de moedas :D *****");
        scanner.close();

    }
}
