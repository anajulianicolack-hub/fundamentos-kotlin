package `Exercícios`

fun main(){
    println(">>>> TROCADOR DE ESPAÇOS POR HÍFENS <<<< \n")
    print("Digite uma frase: ");
    val frase = readLine() ?: ""

    val fraseComHifen = frase.replace(" ", "-")

    print("Frase modificada: $fraseComHifen")
}