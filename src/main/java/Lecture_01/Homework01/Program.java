package Lecture_01.Homework01;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2, 2, 2, 2, 2);

//        System.out.println(a.getCoord(1));
//        System.out.println(a.getCoord(1));
//        System.out.println(a.getCoord(2));
        System.out.println("Координаты точки a:\n" + a);
        Point2D b = new Point2D(0, 0, 0, 0, 0, 0);
        System.out.println("Координаты точки b:\n" + b);

        var dis = Point2D.distance(a, b);
        System.out.println("Расстояние между a и b = " + dis);
    }
}
