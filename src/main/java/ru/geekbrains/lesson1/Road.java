package ru.geekbrains.lesson1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Deistvie deistvie) {
        System.out.println("Дорожка " + super.getName() + " длина: " + this.length);

        deistvie.run();

        if (getLength() <= deistvie.getRunDistance()) {
            System.out.println("бег успешный");

            return true;
        } else {
            System.out.println("пробежка неуспешная");

            return false;
        }
    }
}
