fun valor(value: Any): Unit{
    println(true)
}
//Any aceita qualquer valor

fun valores():Unit{
    val carro = "carro"
    print(carro)
}

fun validacao(valor: String ): Nothing{
    throw Exception(valor)
}

fun main(){
    valor(false)
    valores()
    validacao("Carrim")
}
