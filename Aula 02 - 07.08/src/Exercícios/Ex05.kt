package `Exercícios`

fun main(){
    println(">>>> CALCULADORA DE MÉDIA ENTRE 3 NÚMEROS <<<< \n")

    print("Digite o primeiro número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o segundo número: ")
    val num3 = readLine()?.toDoubleOrNull() ?: 0.0

    val media = (num1 + num2 + num3) / 3

    println("MÉDIA: $media")

}