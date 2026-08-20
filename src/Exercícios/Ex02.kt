package `Exercícios`

fun main(){
    print(">>>> CONTADOR DE CARACTERES <<<< \n")
    print("Digite uma palavra: ")
    val palavra = readLine().toString()

    val caracteres = palavra.length

    print("Sua palavra tem $caracteres caracteres")

}