package AulasMario;

public class Personagem {
    public static void main(String[] args) {
        Mario pl1 = new Mario();
        pl1.imprimeCaracteristicas();
        pl1.imprimeSuperPoderes();
        
        System.out.println("---");
        System.out.println("---");
        
        Mario pl2 = new Mario("Mario Gigante,", 1.9, 28);
        pl2.imprimeCaracteristicas();
        pl2.imprimeSuperPoderes();
    }
}




Nome: Mario Bros
Altura: 1.5
Idade: 40
Cor dos Olhos: null
Cor da camiseta:  null
Ele tem bigode?: false
Ele usa costeletas? false
Está de boné? false
Ele tem 100 de energia.
Super salto, respirar em baixo d'água, manipulação de tamanho
---
---
Nome: Mario Gigante,
Altura: 1.9
Idade: 28
Cor dos Olhos: null
Cor da camiseta:  null
Ele tem bigode?: false
Ele usa costeletas? false
Está de boné? false
Ele tem 100 de energia.
Super salto, respirar em baixo d'água, manipulação de tamanho
