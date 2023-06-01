package Task01;

public class program {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Рар", 1, "Василий");

        greet(cat1);
    }

    public static void greet(Cat x) {
        System.out.printf("Мяу! Меня зовут %s. Мне %d год(-а)/(лет).\nМой владелец - %s.", x.getName(), x.getAge(),
                x.ownersName.giveName());
    }
}