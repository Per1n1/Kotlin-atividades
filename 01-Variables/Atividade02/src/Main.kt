import java.text.DecimalFormat

fun main() {

    var nome: String = "Eduard";
    var idade:Int = 375;
    var salario:Double = 1100.50;
    var mesesTrabalhados:Int = 9;
    var produtosComprados:Int = 8;

    var salarioAnualLiquido:Double = 0.0;


    var desconto: Double =  (salario * 0.25) * mesesTrabalhados;
    var mediaGastaPorProduto = 100/produtosComprados;
    salarioAnualLiquido = (salario * mesesTrabalhados) - desconto;

    val dec = DecimalFormat("#,###.00")


    println("Olá, $nome! Seu sálario anual líquido é: R$${dec.format(salarioAnualLiquido)} ");
    println("Você gastou em média por produto: R$$mediaGastaPorProduto");
    println("\nInformações adicionais:")
    println("Nome: $nome");
    println("Produtos: $produtosComprados");
    println("Idade: $idade");
    println("Meses trabalhados: $mesesTrabalhados");
    println("Média gasta por produtos: R$$mediaGastaPorProduto");
    println("Desconto: R$$desconto");
    println("Salário bruto: R$$salario")
}