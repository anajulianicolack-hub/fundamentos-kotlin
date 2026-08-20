package Exemplos

fun main(){
    print("Nome: ")
    val nome: String = readLine() ?: "Usuário" /*Serve para pegar input, e caso de algum problema o valor padrão sera "Usuário"*/
    println("Nome: $nome")

    print("Ano: ")
    val ano = readLine()
    // val anoInt = ano.toInt() /*se fizermos dessa forma da erro, basicamente a variável ano, pode não existir, então não podemos realizar a conversão*/

    /*Então podemos fazer da seguinte forma: */

    /*if(ano != null){
        val anoInt = ano.toInt();
    }*/

    /*Mas a forma mais fácil de fazer isso, é colocando um ponto de interrogação aqui*/
    val anoInt = ano?.toInt()

    if (anoInt != null) {
        val idade = 2026 - anoInt
        print("Idade: $idade")
    }

    /*ou poderiamos só colocar um valor pádrão, assim não precisamos do if*/

    // val anoInt = ano?.toInt() ?: 0

    /*----------------------------------------------*/

    /*Podemos deixar nosso código ainda menor*/
    print("Ano2: ")
    val ano2 = readLine()?.toIntOrNull()

    if (ano2 != null) {
        val idade2 = 2026 - ano2
        print("Idade2: $idade2")
    }

}