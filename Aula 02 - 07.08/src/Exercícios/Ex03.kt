package `Exercícios`

fun main(){
    println(">>>> VERIFICADOR DE PALINDROMO <<<< \n")

    print("Digite uma frase: ")
    val frase = readLine() ?: ""

    val fraseLimpa = frase.replace(" ", "").lowercase() // tira os espaços da frase, e converte tudo para minúsculo

    val fraseInvertida = fraseLimpa.reversed(); /*inverte o texto*/

    if(fraseLimpa == fraseInvertida){
        print("Sua frase é um palíndromo!")
    } else{
        print("Sua frase não é um palíndromo!")
    }
}