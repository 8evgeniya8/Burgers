package Tsukanova;

public class Burger {
//    Зробити клас Burger, який матиме поля:
//    булочка, м'ясо, сир, зелень, майонез
//
//    Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
//    звичайний бургер (усі компоненти)
//    дієтичний бургер (без майонезу)
//    з подвійним м'ясом
//    У кожен конструктор додати виведення в консоль складу даного варіанту бургера (при створенні екземпляра бургера, який використовує даний конструктор - буде виводитися в консоль його склад).
//    Зробити клас BurgerMain, в якому створити три різні бургери. Їхній склад буде автоматично виводитися на екран під час запуску програми.
//
// bun, meat, cheese, greens, mayonnaise, doubleMeat
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;


    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Бургер без майонезу: " +this.bun +", "+this.meat+", "+this.cheese+", "+this.greens+"; ");
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер: " +this.bun+", "+this.meat+", "+this.cheese+", "+this.greens+", "+this.mayonnaise+"; ");
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println("Бургер Double Meat: " +this.bun+", "+this.meat+", "+this.cheese+", "+this.greens+", "+this.mayonnaise+", "+this.doubleMeat+"; ");
    }
    }


