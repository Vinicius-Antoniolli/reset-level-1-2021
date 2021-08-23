# Exercício Aula 09
### 1-)
```javascript
function imprimir(mensagem){
    console.log(mensagem)
}

imprimir("Exercicio 1");
```

### 2-)
```javascript
// Dados dois nomes, verificar se os mesmos são iguais

function mesmoNome(nome1, nome2){ 
  return nome1 === nome2
}
mesmoNome(); //return true or false

// Verificar a maioridade de determinada pessoa dada sua idade

function maiorDeIdade(idade){
  return idade >= 18
}
maiorDeIdade(); //return true or false

// Calcula o valor de um boleto atrasado com 10% de acréscimo

function valorComJuros(valorDoBoleto){
    return valorDoBoleto * 1.1
};

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
  };
```
