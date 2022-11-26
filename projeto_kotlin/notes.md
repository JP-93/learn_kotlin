class Account{
    var titular = ""
    var NumeroAccount = 0
    var Saldo = 0.0
}

fun testaCondicoes(saldo: Double){
   when{
       saldo > 0.0 -> println("Saldo positivo de $saldo")
        saldo == 0.0 -> println("Saldo 0")
        else -> println("Saldo negativo")
}