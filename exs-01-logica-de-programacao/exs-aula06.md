# Exercício Aula 06

```javascript
let peso = 70;
let altura = 1.75;
let IMC = (peso/(altura**2));
let classificacao = "";
let grau = 0

if(IMC < 18.5){
    classificacao = "Magreza"
}
else if(IMC < 25){
    classificacao = "Normal"
}
else if(IMC < 30){
    classificacao = "Sobrepeso"
    grau = 1
}
else if(IMC < 40){
    classificacao = "Obesidade"
    grau = 2
}
else if(IMC >= 40){
    classificacao = "Obesidade grave"
    grau = 3
}

console.log("Sua IMC é de", IMC);
console.log("Sua condição é", classificacao);

switch(grau){
    case 1:
        console.log("Cuidado! Você está acima do peso recomendado pela OMS.")
        break;
    case 2:
        console.log("Cuidado! Você está acima do peso recomendado pela OMS.")
        break;
    case 3:
        console.log("É importante procurar um médico para avaliar sua saúde.")
        break;
}
```
