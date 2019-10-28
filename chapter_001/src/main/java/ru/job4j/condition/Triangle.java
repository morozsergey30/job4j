package ru.job4j.condition;

/**
 * @author morozsergey30 (karandash.zapiskin@gmail.com).
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b.
     * @param b расстояние между точками a c.
     * @param c расстояние между точками b c.
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return Результат проверки.
     */
    private boolean exist(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }
    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * TrgArea - ранее созданный класс для вычисления площади треугольника в этом же пакете.
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rst = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = third.distance(second);
        double p = period(a, b, c);
        if (exist(a, b, c)) {
            rst = TrgArea.area(a, b, c);
        }
        return rst;
    }
}