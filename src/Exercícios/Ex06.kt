package `Exercícios`

fun main(){
    println(">>>> VERIFICADOR DE ANAGRAMAS <<<< \n")

    print("Digite a primeira string: ")
    val string1 = readLine() ?: ""

    print("Digite a segunda string: ")
    val string2 = readLine() ?: ""

    val limpa1 = string1.replace(" ", "").lowercase() /*deleta os espaços e deixa a palavra toda em letras minusculas*/
    val limpa2 = string2.replace(" ", "").lowercase()

    val letrasOrdenadas1 = limpa1.toCharArray().sorted() /*transforma cada array em letras, e as organiza em ordem alfabética*/
    val letrasOrdenadas2 = limpa2.toCharArray().sorted()

    /*Compara se as duas listas de letras ficaram iguais*/
    if (limpa1.isNotEmpty() && letrasOrdenadas1 == letrasOrdenadas2) {
        println("'$string1' e '$string2' são anagramas.")
    } else {
        println("'$string1' e '$string2' não são anagramas.")
    }
}