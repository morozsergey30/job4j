package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * @author morozsergey30 (karandash.zapiskin@gmail.com).
 */
public class Point {

    /**
     * Это поля объекта. Они доступны только кокретному объекту.
     */
    private int x;
    private int y;
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Перегруженный онструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     * @param third координата z
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**
     * Метод вычисляет расстояние между двумя точками в двумерном пространстве.
     * @param that объект-"точка" до которой вычисляется расстояние от данной "точки".
     * @return расстояние.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод вычисляет расстояние между двумя точками в трехмерном пространстве.
     * @param that объект-"точка" до которой вычисляется расстояние от данной "точки".
     * @return расстояние.
     */
    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
        Point c = new Point(1, 1, 1);
        Point d = new Point(2, 5, 6);
        double dist3d = c.distance3d(d);
        System.out.println(dist3d);
    }
}