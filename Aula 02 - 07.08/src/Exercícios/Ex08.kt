package `Exercícios`

fun main() {
    print("Digite a primeira string: ")
    val str1 = readLine() ?: ""

    print("Digite a segunda string (de mesmo comprimento): ")
    val str2 = readLine() ?: ""

    if (str1.length == str2.length) {
        var resultado = ""

        for (i in 0 until str1.length) {
            resultado += "${str1[i]}${str2[i]}"
        }

        println("Strings intercaladas: $resultado")
    } else {
        println("Erro: As duas strings precisam ter o mesmo tamanho!")
    }
}