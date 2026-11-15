package by.itacademy.kornevanatallia;

public class Box {
    double weight;
    double height;
    double depth;

    double volume() {
        return weight * height * depth;
    }

    void setDim(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }
}
