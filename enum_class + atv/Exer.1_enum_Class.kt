import kotlin.time.times

/*Exercício 1: Dias da semana
Crie uma enum class chamada DiaSemana que represente os dias da semana. A enumeração
deve conter os seguintes valores: DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA e SABADO.
Em seguida, crie uma função chamada imprimirDiaUtil que receba um parâmetro do tipo DiaSemana
e verifique se o dia é um dia útil(segunda a sexta-feira) ou um dia de fim de semana. A função
deve imprimir uma mensagem indicando o tipo de dia.*/

//Minha resolusão:
/*enum class SemanaDias{
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
}
fun imprirDiaUtil(dia: SemanaDias){
    when{
        dia == SemanaDias.DOMINGO -> println("Fim de semana")
        dia == SemanaDias.SEGUNDA -> println("Dia útil")
        dia == SemanaDias.TERCA -> println("Dia útil")
        dia == SemanaDias.QUARTA -> println("Dia útil")
        dia == SemanaDias.QUINTA -> println("Dia útil")
        dia == SemanaDias.SEXTA -> println("Dia útil")
        dia == SemanaDias.SABADO -> println("Fim de semana")
    }
}

fun main(){
    imprirDiaUtil(SemanaDias.SEGUNDA)
}*/

//Resolusão chatGpt
/*enum class SemanaDias{
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
}
fun dias(dia: SemanaDias){
    if(dia == SemanaDias.DOMINGO || dia == SemanaDias.SABADO ){
        println("Fim de semana")
    }else{
        println("Dia útil")
    }
}

fun main(){
    val dia1 = SemanaDias.SEGUNDA
    val dia2 = SemanaDias.SABADO

    dias(dia1)
}*/


/*
Exercício 2: Tipos de operação
Crie uma enum class chamada TipoOperacao que represente os tipos de operação matemática: SOMA, SUBTRACAO,
MULTIPLICACAO e DIVISAO. Em seguida, crie uma função chamada calcular que receba dois números e um
parâmetro do tipo TipoOperacao, e retorne o resultado da operação correspondente.
*/
/*enum class TiposOP{
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO
}
fun calcular(n1: Int, n2: Int, c: TiposOP): Int{
    return when(c){
        TiposOP.SOMA -> return n1 + n2
        TiposOP.SUBTRACAO -> return n1 - n2
        TiposOP.MULTIPLICACAO -> return n1 * n2
        TiposOP.DIVISAO -> return n1 / n2
    }
}

fun main(){
    val som1 = TiposOP.SOMA
    println(calcular(23,23, som1))
    val sub1 = TiposOP.SUBTRACAO
    println(calcular(23,23, sub1))
    val mult1 = TiposOP.MULTIPLICACAO
    println(calcular(23,23, mult1))
    val div1 = TiposOP.DIVISAO
    println(calcular(23,23, div1))
}*/