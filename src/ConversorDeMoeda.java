import java.util.Map;

public class ConversorDeMoeda {
    public double converter(String moedaOrigem, String moedaDestino, double quantidade) {
        ConsultaMoedas consultaMoedas = new ConsultaMoedas();
        RespostaApi respostaApi = consultaMoedas.consulta(moedaOrigem);
        TaxaDeConversao taxasDeConversao = respostaApi.conversion_rates();

        Map<String, Double> mapaDeTaxas = Map.of(
                "USD", taxasDeConversao.USD,
                "BOB", taxasDeConversao.BOB,
                "ARS", taxasDeConversao.ARS,
                "CLP,", taxasDeConversao.CLP,
                "COP", taxasDeConversao.COP,
                "BRL", taxasDeConversao.BRL

        );

        Double taxaDeConversao = mapaDeTaxas.get(moedaDestino);
        if(taxaDeConversao == null){
            throw new IllegalArgumentException("Moeda de destino desconhecida: "+moedaDestino);
        }

        return quantidade * taxaDeConversao;
    }
}
