class CorreBicho(var velocidade: Float, var nome: String) {

    var ato = ""
    constructor (velocidade: Float, nome: String, ato: String): this(velocidade, nome){
        this.nome = ato
    }

    fun acordar() {
        println("Acordando... e meu nome é $ato")
    }
}

fun main(){

    val pss = CorreBicho(120f,"Inácio","Correr")
    pss.acordar()



}