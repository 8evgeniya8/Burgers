package Tsukanova;

public class MainBurgers {
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
    public static void main(String[]args){
        Burger burgers=new Burger("булочка","м'ясо","сир","зелень","майонез");
        Burger noMayonnaise=new Burger("булочка","м'ясо","сир","зелень");
        Burger doubleMeat=new Burger("булочка","м'ясо","сир","зелень","майонез","добавка м'яса");
    }
}
