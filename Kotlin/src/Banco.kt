class Banco {

    var pessoas = arrayOfNulls<Pessoa>(50)

    fun cadastrar(nome: String, anoNascimento: Int, telefone: String): Boolean {
        val p = Pessoa(nome, anoNascimento, telefone) //instanciacao

        for (i in pessoas.indices) {
            if (pessoas[i] == null) {
                pessoas[i] = p
                return true
            }
        }
        return false
    }

    fun listar(): String {
        var str = "##### PESSOAS #####"
        for (i in pessoas.indices) {
            if (pessoas[i] != null) {
                str += "\n" + pessoas[i].toString()
            }
        }
        return str
    }

    fun buscar(nome: String?, anoNascimento: Int, telefone: String): Pessoa? {
        for (i in pessoas.indices) {
            if (pessoas[i] != null && pessoas[i]!!.nome === nome && pessoas[i]!!.anoNascimento === anoNascimento && pessoas[i]!!.telefone === telefone) {
                return pessoas[i]!!
            }
        }
        return null
    }

    fun remover(nome: String?): Boolean {
//        val c = buscar(nome)
//        return if (c != null) {
//            c.remover(Pessoa)
//        } else false
        return false
    }

}