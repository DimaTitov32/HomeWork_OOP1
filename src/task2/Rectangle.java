package task2;

public class Rectangle {
    private int width;
    private  int height;

    // Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
    public Rectangle(){

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    //Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
    public double calculateArea(int a, int b) {
        return width * height;
    }

    //Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
    public double calculatePerimeter(int w, int h) {
        return 2 * (width + height);

    }


}
