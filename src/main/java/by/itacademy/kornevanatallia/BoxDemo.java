package by.itacademy.kornevanatallia;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.weight = 10;
        myBox.height = 20;
        myBox.depth = 15;
        vol = myBox.weight * myBox.height * myBox.depth;

        System.out.println("Oбъeм равен " + vol);
    }
}
