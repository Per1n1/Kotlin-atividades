fun main() {

    var nome: String = "";
    nome  = "Jhon";

    var altura: Float = 1.79F;
    altura = 1.58F;


    val idade: Int = 25;
    val idadeDois: Int = 18;
    var idadeFinal: Int = 0;
    val identificaoAluno: Boolean = false;


    var comprimento: String = "Olá, $nome!";


    idadeFinal = idade + idadeDois;
    altura = altura * 2;


    fun estudante() {
        if (identificaoAluno == true) {
            return println("É um universitario: Sim!")
        } else {
            return println("É um universitario: Não!")
        }
    }


    println("Idade: $idadeFinal");
    println("Nome: $nome");
    println("Altura: $altura m");
    estudante();
    println("Comprimento: $comprimento");
}