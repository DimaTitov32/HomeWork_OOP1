package task1;

public class Owner {
    private static String name;


    public Owner(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Имя: " + this.name);

    }
}