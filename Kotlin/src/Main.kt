import java.util.*

fun main(args: Array<String>){
    var op: Int
    val scan = Scanner(System.`in`)
    val banco = Banco()
    var nome: String
    var anoNascimento: Int
    var telefone: String

    println("########################")
    println("##### CRUD PESSOAS #####")
    do{
        println("########################")
        println("1 - Cadastrar")
        println("2 - Remover")
        println("3 - Listar")
        println("4 - Sair")
        print("Op: ")
        op = scan.nextInt()

        if (op == 1){
            println("\nCadastrando pessoas..")
//            print("Nome:")
//            var nome= readLine()
            print("Nome:")
            nome = scan.next()
            print("Ano de Nascimento:")
            anoNascimento = scan.nextInt()
            print("Telefone:")
            telefone = scan.next()

            if (banco.cadastrar(nome, anoNascimento, telefone)) {
                println("Cadastro realizado!!\n")
            } else {
                println("Cadastro não realizado!!\n")
            }


        } else if (op == 2){
            println("\nRemovendo pessoas...")
            print("Digite o nome da pessoa para remove-la: ")
            nome = scan.next()
            if (banco.remover(nome)) {
                println("Pessoa removida com sucesso!!\n")
            } else {
                println("Pessoa não removida/Pessoa não encontrada!!\n")
            }


        } else if (op == 3){
            println("\nListando pessoas...")
            println(banco.listar())
        }
    }while(op != 4)

}