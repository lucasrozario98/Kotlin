class Pessoa(var nome: String, var anoNascimento: Int, var telefone: String) {

//    CONSTRUTOR SECUNDARIO
//    constructor(nome: String, anoNascimento: Int) {
//        this.nome = nome
//        this.anoNascimento = anoNascimento
//    }

//    data class Pessoa(var nome: String, var anoNascimento: Int, var telefone: String)

    override fun toString(): String {
        return ("Nome:" + nome
                + " Ano Nascimento:" + anoNascimento
                + " Telefone:" + telefone
                + "\n")
    }

}