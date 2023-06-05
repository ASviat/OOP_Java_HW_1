// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина
// (width) и высота (height). Класс должен обладать следующими методами:

// Конструктор без параметров, который создает прямоугольник с шириной и высотой
// по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает
// прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь
// прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр
// прямоугольника (2 * (ширина + высота)).

package Task02;

public class program {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(8, 3);

        System.out.printf("Площадь равна: %d\n", calculateArea(rectangle1.getWidth(), rectangle1.getHeight()));
        System.out.printf("Периметр равен: %d", calculatePerimeter(rectangle2.getWidth(), rectangle2.getHeight()));

    }

    public static int calculateArea(int width, int height) {
        return width * height;
    }

    public static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
}