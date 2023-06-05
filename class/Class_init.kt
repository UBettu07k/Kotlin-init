class Animal(var especie: String){
    init{
        if(especie == "Cachorro" || especie == "Woo"){
            println("Cachorro!")
        }else{
            println("Gato!")
        }
    }
    init{
        fun carro(a: Int, b: Int): Int{
            return a + b
        }
        println(carro(12,10))
    }
}

fun main(){
    Animal("Woo")

}