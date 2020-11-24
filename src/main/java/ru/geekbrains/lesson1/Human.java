package ru.geekbrains.lesson1;

public class Human implements Deistvie {
    private String name;
    private final int runDistance;
    private int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void run() {
        System.out.println("Человек " + this.name + " пробежал " + this.getRunDistance());
    }
    @Override
    public void jump() {
        System.out.println("Человек " + this.name + " пропрыгал " + this.getJumpHeight());
    }
    @Override
    public int getRunDistance() {
        return this.runDistance;
    }
    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}