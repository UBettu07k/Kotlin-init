enum class Inx(val nix: Int){
    nome(21){
        override fun toString(): String {
            return "Nome: Marcos e ele tem $nix"
        }
            },
    idade(8),
    peso(14)
}
fun idd(id: Inx){

}

fun main(){
    for(p in Inx.values()){
        println(p)

    }
}

// esando string no enum
/*enum class Mario(val nix: Int){
    baixa(5){
        override fun toString(): String {
            return "nix baixa $nix"
        }
            },
    media(12),
    alta(6)
}

fun main() {
    for(p in Mario.values()){
        println(p)
    }
}*/

//pegar valores
/*enum class Mario(val nix: Int){
    baixa(5), media(12), alta(6)
}

enum class Anmal{
    cachorro, gato, peixe, cobra
}

fun main() {
    for(p in Mario.values()){
        println(p.nix)
    }
}*/

//usando o enum class
/*enum class Mario{
    baixa, media, alta
}

fun prior(p: Mario){

}

fun main() {
    for(p in Mario.values())
        if(p == Mario.alta)
        println(p)
}*/
