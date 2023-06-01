package Task01;

// Создайте класс "Кот" (Cat) со следующими свойствами:

// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. 
// Мне <возраст> года(лет).".
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот"
//и методы доступа для него. 
// Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! 
// Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

public class Cat {

    private String name;
    private int age;
    public Owner ownersName;

    public void ownerToCat(Owner ownerName) {
        ownersName = ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Cat(String name, int age, String ownersName) {
        this.name = name;
        this.age = age;
        this.ownersName = new Owner(ownersName);
    }
}