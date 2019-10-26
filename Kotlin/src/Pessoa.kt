class Pessoa(val nome: String, val anoNascimento: Int, val telefone: String) {

//    data class Pessoa(var nome: String, var anoNascimento: Int, var telefone: String)

    override fun toString(): String {
        return ("Nome:" + nome
                + " Ano Nascimento:" + anoNascimento
                + " Telefone:" + telefone
                + "\n")
    }

}