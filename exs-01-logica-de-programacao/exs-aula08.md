# Exercício Aula 06

### 1-)
```javascript
titulos = ["Libertadores", "Copa do Brasil", "Brasileirão", "Sulamiranda", "Gauchão"];
for(t = 0; t < titulos.length; t++){
    console.log(titulos[t])
}
```
  
### 2-)
```javascript
numbers = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55]
values = 0
sum = 0

while(values < numbers.length) {
    sum += numbers[values]
    values++
}
console.log(sum/numbers.length)
```

### 3-)
```javascript
nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinicius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

meuNome = "Vinicius"
nomeComum = false

for(n = 0; n < nomesComuns.length; n++){
    if(nomesComuns[n] === meuNome)
    nomeComum = true
}

if(nomeComum) {
    console.log("É, nome comum ;P")
} else {
    console.log("Diferentão, hein? xD")
}
```
