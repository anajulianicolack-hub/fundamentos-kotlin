package `Exercícios`

fun main(){
    print(">>>> CORTADOR DE FRASES PELO INDICE <<<< \n")

    print("Digite uma frase: ")
    val frase = readLine() ?: ""

    print("Digite o indice inicial: ")
    val indiceInicial = readLine()?.toIntOrNull() ?: 0

    print("Digitre o indice final: ")
    val indiceFinal = readLine()?.toIntOrNull() ?: 0

    print("A frase cortada com seus indices ficou: ")

    println(frase.substring(indiceInicial, indiceFinal))

}