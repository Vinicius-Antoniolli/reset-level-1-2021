package AulasMario;

public class Players {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario", 1.5, 50);
        Luigi luigi = new Luigi("Luigi", 1.8, 35);
        Yoshi yoshi = new Yoshi("Yoshi", 0.3,3);

        mario.imprimeCaracteristicas();
        mario.cresce();
        mario.saltar(2);
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        mario.imprimeCaracteristicas();
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        luigi.imprimeCaracteristicas();
        luigi.cresce();
        luigi.saltar(4);
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        luigi.imprimeCaracteristicas();
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        yoshi.imprimeCaracteristicas();
        yoshi.cresce();
        yoshi.saltar(6);
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        yoshi.imprimeCaracteristicas();
    }
}


Nome: Mario
Altura: 1.5m.
Idade: 50 anos.
1 vida(s)
Possui 0 moedas.
Você tem 100 de energia.
Mario saltou um objeto a sua frente a uma altura de 3.0 metros!!

---

Nome: Mario
Altura: 2.25m.
Idade: 50 anos.
1 vida(s)
Possui 0 moedas.
Você tem 100 de energia.

---

Nome: Luigi
Altura: 1.8m.
Idade: 35 anos.
1 vida(s)
Possui 0 moedas.
Você tem 100 de energia.
Luigi saltou um objeto a sua frente a uma altura de 6.0 metros!!

---

Nome: Luigi
Altura: 3.15m.
Idade: 35 anos.
1 vida(s)
Possui 0 moedas.
Você tem 100 de energia.

---

Nome: Yoshi
Altura: 0.3m.
Idade: 3 anos.
1 vida(s)
Possui 0 moedas.
Você tem 100 de energia.
Yoshi saltou um objeto a sua frente a uma altura de 9.0 metros!!

---

Nome: Yoshi
Altura: 0.33m.
Idade: 3 anos.
1 vida(s)
Possui 0 moedas.
Você tem 100 de energia.
