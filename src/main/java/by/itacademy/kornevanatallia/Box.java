package by.itacademy.kornevanatallia;

public class Box {
    double weight;
    double height;
    double depth;

    Box() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        weight = 10;
        height = 16;
        depth = 20;
    }

    double volume() {
        return weight * height * depth;
    }
}
