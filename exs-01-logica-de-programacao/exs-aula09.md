# Exercício Aula 09
### 1 e 2-)
```javascript
function imprimir(mensagem){
    console.log(mensagem)
}

// Dados dois nomes, verificar se os mesmos são iguais

function mesmoNome(nome1, nome2){ 
  return nome1 === nome2
}

// Verificar a maioridade de determinada pessoa dada sua idade

function maiorDeIdade(idade){
  return idade >= 18
}

// Calcula o valor de um boleto atrasado com 10% de acréscimo

function valorComJuros(valorDoBoleto){
    return valorDoBoleto * 1.1
}

// Calculo da média aritmética dos valores de um dado array

function mediaAritmetica(itensDoArray){
    sum = 0

    for(index=0; index < itensDoArray.length; index++)
    sum += itensDoArray[index]

    return sum / itensDoArray.length
}

// Calcular o lucro bruto de uma empresa (em percentual), dados o lucro líquido de vendas e o custo dos produtos vendidos.

function margemBruta(receitaLiquidaVendas, custoProdutosVendidos){
    return (((receitaLiquidaVendas - custoProdutosVendidos) / receitaLiquidaVendas) * 100)
  }
  
 cwi = "CWI"
reset = "Reset"
imprimir(mesmoNome(cwi, cwi))   // true
imprimir(mesmoNome(cwi, reset)) // false

imprimir("---")

imprimir(maiorDeIdade(30)) // true
imprimir(maiorDeIdade(18)) // true
imprimir(maiorDeIdade(5))  // false

imprimir("---")

imprimir(valorComJuros(100))   // 110
imprimir(valorComJuros(984.5)) // 1082.95

imprimir("---")

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3

imprimir("---")

imprimir(margemBruta(1000000, 500000))      // 50
imprimir(margemBruta(528459.11, 632501.87)) // -19.68[...]
```
