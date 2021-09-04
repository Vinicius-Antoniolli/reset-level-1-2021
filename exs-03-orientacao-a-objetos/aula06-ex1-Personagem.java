package AulasMario;

public class Personagem {
    public static void main(String[] args) {
        Mario pl1 = new Mario();
        System.out.println("Teste caracteristicas iniciais");
        pl1.imprimeCaracteristicas();
        
        System.out.println("---");
        
        pl1.perdeEstamina();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        pl1.coletarMoedas();
        System.out.println("Teste 10 moedas ganha vida e perder estamina");
        pl1.imprimeCaracteristicas();
        
        System.out.println("---");
        
        pl1.revigorar();
        System.out.println("Teste do revigorar");
        pl1.imprimeCaracteristicas();
        
        System.out.println("---");
        
        pl1.morrer();
        System.out.println("Teste morrer ainda com vidas sobrando (estamina volta a 100)");
        pl1.imprimeCaracteristicas();
        
        System.out.println("---");
        
        pl1.cresce();
        pl1.morrer();
        pl1.morrer();
        System.out.println("Teste de GAME OVER");
        pl1.imprimeCaracteristicas();
    }
}

Teste caracteristicas iniciais
Nome: Mario Bros
Altura: 1.5m.
Idade: 40 anos.
Você tem 1 vida(s)
Possui 0 moedas.
Ele tem 100 de energia.
---
Teste 10 moedas ganha vida e perder estamina
Nome: Mario Bros
Altura: 1.5m.
Idade: 40 anos.
Você tem 2 vida(s)
Possui 10 moedas.
Ele tem 90 de energia.
---
Teste do revigorar
Nome: Mario Bros
Altura: 1.5m.
Idade: 40 anos.
Você tem 2 vida(s)
Possui 10 moedas.
Ele tem 100 de energia.
---
Teste morrer ainda com vidas sobrando (estamina volta a 100)
Nome: Mario Bros
Altura: 1.5m.
Idade: 40 anos.
Você tem 1 vida(s)
Possui 10 moedas.
Ele tem 100 de energia.
---
GAME OVER
Teste de GAME OVER e do crescer
Nome: Mario Bros
Altura: 3.0m.
Idade: 40 anos.
Você tem 0 vida(s)
Possui 10 moedas.
Ele tem 0 de energia.
