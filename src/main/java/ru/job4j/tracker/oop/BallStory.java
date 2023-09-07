package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Ball ball = new Ball();
        hare.tryEat(ball);
        fox.tryEat(ball);
        wolf.tryEat(ball);
    }
}
