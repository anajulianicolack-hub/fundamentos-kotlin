package `Exercícios`

fun main(){
    println(">>>> COMPRIMIDOR DE FRASE <<<< \n")

    print("Digite uma string: ")
    val texto = readLine() ?: ""

    var comprimida = ""
    var letraAtual = texto[0]
    var contador = 0

    /*verifica se o carctere atual tem mais de um na frase, se tiver, aumenta o contador, se não ele pula pro próximo e faz a msm coisa; enquanto tiver caracteres no texto*/
    for(caractere in texto){
        if (caractere == letraAtual){
            contador++
        } else{
            comprimida += "$letraAtual$contador"
            letraAtual = caractere
            contador = 1
        }
    }
    comprimida += "$letraAtual$contador"

    if (comprimida.length < texto.length) {
        println("String comprimida: $comprimida")
    } else {
        println("String comprimida: $texto")
    }

}