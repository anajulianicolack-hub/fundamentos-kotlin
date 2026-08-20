package Exemplos

fun main(){
    val nome: String = "Joselito"
    val sobre: String? = "D'Silva"

    println("Nome $nome | Sobre $sobre")

    val nomeCompleto = nome + sobre
    var nomeCompleto2 = "$nome $sobre Sauro"

    /*TOP 6 FUNÇÕES DE STRING*/

    /*pra imprimir*/
    println(nomeCompleto)

    /*tamanho da nossa string*/
    println(nomeCompleto.length)

    /*para pegar um caractere específico*/
    println(nomeCompleto[3])

    /*para pegar uma parte da frase */
    println(nomeCompleto.substring(3, 7))

    /*para mudar informações dentro dessa string*/
    nomeCompleto2 = nomeCompleto2.replace("D'Silva", "Pereira")
    println(nomeCompleto2)

    /*para quebrar a nossa frase em partes, ali nas aspas a gente coloca a nossa condição para quebrar, nesse caso, quando ele encontrar um espaço ele vai quebrar*/
    println(nomeCompleto2.split(" "))

}