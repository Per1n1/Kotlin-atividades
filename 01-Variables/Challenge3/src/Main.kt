fun main() {
    var nome:String = "ChicoMoedas";


    val preco:Double = 0.60;
    val quantidade:Int = 7;

    var taxaImposto: Double = 20.0 / 100.0
    var margemDeLucro:Double = 40.0 / 100.0;

    var valorTotal:Double = preco * quantidade;
    var valorComImposto:Double =  valorTotal + (valorTotal * taxaImposto);
    var precoDeVenda: Double = valorComImposto * (1 + margemDeLucro);


    precoDeVenda = String.format("%.2f", precoDeVenda).toDouble()
    valorComImposto = String.format("%.2f", valorComImposto).toDouble()


    val valorComImpostoFormatado = "R$%.2f".format(valorComImposto)
    val precoDeVendaFormatado = "R$%.2f".format(precoDeVenda)

    println("Produto: $nome");
    println("Valor Total com Impostos: $valorComImpostoFormatado");
    println("Preço de Venda Sugerido: $precoDeVendaFormatado");
}