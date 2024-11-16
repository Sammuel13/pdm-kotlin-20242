package br.ifpb.pdm.praticas.funcoes

// 1. Declaração de Funções
fun apresentarPessoa(nome: String, idade: Int): String {
    // Implemente a função para retornar "Nome: <nome>, Idade: <idade>"
    // Exemplo de chamada: apresentarPessoa("Ana", 30)
    // Resultado esperado: "Nome: Ana, Idade: 30"
    return ""
}

fun calcularAreaCirculo(raio: Double): Double {
    // Implemente a função para retornar a área do círculo dado o raio
    // Exemplo de chamada: calcularAreaCirculo(5.0)
    // Resultado esperado: 78.53981633974483
    return 0.0
}

// 2. Parâmetros
fun descreverProduto(nome: String, preco: Double, quantidade: Int): String {
    // Implemente a função para retornar "Produto: <nome>, Preço: <preco>, Quantidade: <quantidade>"
    // Exemplo de chamada: descreverProduto("Caneta", 1.50, 10)
    // Resultado esperado: "Produto: Caneta, Preço: 1.5, Quantidade: 10"
    return ""
}

fun calcularDesconto(preco: Double, porcentagemDesconto: Double): Double {
    // Implemente a função para calcular o preço com desconto
    // Exemplo de chamada: calcularDesconto(100.0, 15.0)
    // Resultado esperado: 85.0
    return 0.0
}

// 3. Retornos
fun obterMaiorNumero(a: Int, b: Int): Int {
    // Implemente a função para retornar o maior número entre a e b
    // Exemplo de chamada: obterMaiorNumero(5, 10)
    // Resultado esperado: 10
    return 0
}

fun verificarIdadeParaVotar(idade: Int): Boolean {
    // Implemente a função para verificar se a idade é suficiente para votar
    // Exemplo de chamada: verificarIdadeParaVotar(20)
    // Resultado esperado: true
    return true
}

// 4. Funções de Ordem Superior
fun operacaoComNumero(numero: Double, operacao: (Double) -> Double): Double {
    // Implemente a função para aplicar a operação ao número
    // Exemplo de chamada: operacaoComNumero(10.0) { it * 2 }
    // Resultado esperado: 20.0
    return 0.0
}

fun filtrarNumerosPositivos(numeros: List<Int>, filtro: (Int) -> Boolean): List<Int> {
    // Implemente a função para filtrar números positivos
    // Exemplo de chamada: filtrarNumerosPositivos(listOf(-1, 2, 3, -4)) { it > 0 }
    // Resultado esperado: [2, 3]
    return listOf()
}

// 5. Lambdas

//Descomentar as funçôes para implementar a resposta

//val ehPar: (Int) -> Boolean = { numero ->
//    // Implemente a expressão lambda para verificar se o número é par
//    // Exemplo de chamada: ehPar(4)
//    // Resultado esperado: true
//}

//val calcularSalario: (Int, Double) -> Double = { horasTrabalhadas, valorPorHora ->
//    // Implemente a expressão lambda para calcular o salário com base nas horas trabalhadas e valor por hora
//    // Exemplo de chamada: calcularSalario(40, 15.0)
//    // Resultado esperado: 600.0
//}

// Função principal para testar as práticas
fun main() {
    // Testes de cada função com resultados esperados

    // 1. Declaração de Funções
    println(apresentarPessoa("Ana", 30))  // Resultado esperado: "Nome: Ana, Idade: 30"
    println("Área do círculo: ${calcularAreaCirculo(5.0)}")  // Esperado: 78.53981633974483

    // 2. Parâmetros
    println(descreverProduto("Caneta", 1.50, 10))  // Esperado: "Produto: Caneta, Preço: 1.5, Quantidade: 10"
    println("Preço com desconto: ${calcularDesconto(100.0, 15.0)}")  // Esperado: 85.0

    // 3. Retornos
    println("Maior número: ${obterMaiorNumero(5, 10)}")  // Esperado: 10
    println("Pode votar? ${verificarIdadeParaVotar(20)}")  // Esperado: true

    // 4. Funções de Ordem Superior
    println("Resultado da operação: ${operacaoComNumero(10.0) { it * 2 }}")  // Esperado: 20.0
    println("Números positivos: ${filtrarNumerosPositivos(listOf(-1, 2, 3, -4)) { it > 0 }}")  // Esperado: [2, 3]

    // 5. Lambdas
    // Descomentar os prints quando for implementado as funções Lambdas
    //println("Número é par? ${ehPar(4)}")  // Esperado: true
    //println("Salário calculado: ${calcularSalario(40, 15.0)}")  // Esperado: 600.0
}