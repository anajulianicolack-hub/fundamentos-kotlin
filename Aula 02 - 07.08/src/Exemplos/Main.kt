package Exemplos

fun main(){
    var nome = "Joselito" /* Com o var, podemos mudar a variável*/

    val sobre: String = "D'Silva" /* Com o val, isso não é possível*/
    /*por mais que ele identifique automáticamente, podemos especificar o tipo de variável*/

    var nome2: String? = null;
    /*quando queremos uma variável nula, e que ela possa receber um valor mais tarde, utilizamos a tipagem de variáveis com "?" no final*/

    /* em Kotlin, não conseguimos mudar um tipo de uma variável, pois ele já identifica o que é a variável pelo que vc escreveu*/

    println("Nome $nome | Sobre $sobre")

    /*---------------------------------------------------------------------*/

    val ano = "2000" // input
    val anoInt = ano.toInt() /*aqui estamos convertendo o tipo da variável*/

    /*se input é um string, não conseguimpos fazer a conta da idade, por isso que temos que converter para um valor numérico*/
    // val idade = 2026 - ano --> então agr em vez de subtrair o ano (que esta em string), subtraimos o anoInt

    val idade = 2026 - anoInt
    println("Idade $idade")

    /*---------------------------------------------------------------------*/

    /*Mas e se o usuário digitar uma letra? o que acontece?*/
    /*Se o usuário digitar uma letra, podemos usar uma função de toIntOrNull*/

    val ano2 = "2000S"
    val anoInt2 = ano2.toIntOrNull()
    /*Mas se vc reparar da erro, pois não posso fazer uma conta que diminui algo null, da erro, então podemos fazer um if-else*/

    // val idade2 = 2026 - anoInt2 --> isso da erro, para não dar erro, podemos:

    if(anoInt2 != null) {
        val idade2 = 2026 - anoInt2
        println("Idade2 $idade2")
    } else {
        println("Erro...")
    }

    /*---------------------------------------------------------------------*/
    /*para tratarmos esse erro, podemos dizer ao programa, que se o valor for null, ele colocar um valor padrão*/

    val ano3 = "2000S"
    val anoInt3 = ano3.toIntOrNull() ?: 0 /*Como resolvemos o erro aqui, não precisamos mais do if-else*/
    val idade3 = 2026 - anoInt3
    println("Idade3 $idade3")

}