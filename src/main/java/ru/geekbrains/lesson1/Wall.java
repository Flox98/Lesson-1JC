package ru.geekbrains.lesson1;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Deistvie deistvie) {
        System.out.println("Ходьба " + super.getName() + "длина: " + this.heigth);

        deistvie.jump();

        if (getHeigth() <= deistvie.getJumpHeight()) {
            System.out.println("прыжок успешный");

            return true;
        } else {
            System.out.println("прыжок неуспешный");

            return false;
        }
    }
}
