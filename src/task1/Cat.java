package task1;

public class Cat extends Owner {
    private int age;
    private String name;


    public Cat(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя: " + this.name + "\n" + "Возвраст: " + this.age);
        System.out.println();
    }

    public void greet() {
        System.out.println("Мяу! Меня зовут" + " " + this.name + "." + " " + "Мне" + " " + age + " года(лет)." + " " + "Мой владелец: " + Owner.getName());
    }

    public void greetCat() {
        System.out.println("Мяу! Меня зовут" + " " + this.name + "." + " " + "Мне" + " " + age + " года(лет).");
    }


}
