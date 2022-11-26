class User (var nome: String, var  isAdm: Boolean){ //  classe com costrutor simples
    constructor(name: String) : this(name, false) // sobrecargade construtor

    fun concat(nome: String): String{
        return ("Bem vindo $nome")
    }
}