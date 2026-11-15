package by.itacademy.kornevanatallia;

public class Box {
    double weight;
    double height;
    double depth;

    Box() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        weight = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return weight * height * depth;
    }
}
