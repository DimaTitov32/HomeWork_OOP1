package task1;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 4);

        Owner owner = new Owner("Дима");

        barsik.greet();//ДОП Задание c общим выводом
        barsik.greetCat();// основной вывод

    }

}
