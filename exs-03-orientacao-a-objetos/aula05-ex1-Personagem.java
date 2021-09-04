package AulasMario;

public class Personagem {
    public static void main(String[] args) {
        Mario pl1 = new Mario();
        pl1.imprimeCaracteristicas();
        pl1.imprimeSuperPoderes();
        System.out.println("---");
        pl1.perdeEstamina();
        pl1.imprimeCaracteristicas();
        System.out.println("---");
        pl1.ganhaEstamina();
        pl1.cresce();
        pl1.imprimeCaracteristicas();
        System.out.println("---");
    }
}


Nome: Mario Bros
Altura: 1.5m.
Idade: 40 anos.
Cor dos Olhos: null
Cor da camiseta:  null
Ele tem bigode?: false
Ele usa costeletas? false
Está de boné? false
Ele tem 100 de energia.
Super salto, respirar em baixo d'água, manipulação de tamanho
---
Nome: Mario Bros
Altura: 1.5m.
Idade: 40 anos.
Cor dos Olhos: null
Cor da camiseta:  null
Ele tem bigode?: false
Ele usa costeletas? false
Está de boné? false
Ele tem 90 de energia.
---
Nome: Mario Bros
Altura: 3.0m.
Idade: 40 anos.
Cor dos Olhos: null
Cor da camiseta:  null
Ele tem bigode?: false
Ele usa costeletas? false
Está de boné? false
Ele tem 95 de energia.
---
