package Lecture_01.Homework01;


/**
 * Это точка 2D
 */
public class Point2D {
    private int[] d_coords; // Массив координат измерений (x, y, z...)

    /**
     * Это конструктор ...
     *
     * @param k это переменное число координат в разных измерениях (x, y, z...)
     */
    public Point2D(int... k) {
        this.d_coords = k;
    }

    public Point2D() {
        this(0);
    }


    /**
     * Получение координат определённого измерения
     *
     * @param dimension_number номер измерения (1-x, 2-y, 3-z...)
     */
    public int getCoord(int dimension_number) {
        return d_coords[dimension_number - 1];
    }

    /**
     * Назначение координаты определённого измерения
     *
     * @param dimension_number номер измерения (1-x, 2-y, 3-z...)
     * @param value            значение
     */
    public void setCoord(int dimension_number, int value) {
        this.d_coords[dimension_number - 1] = value;
    }

    @Override
    public String toString() {

        StringBuilder info = new StringBuilder();
        for (int i = 0; i < d_coords.length; i++) {
            if (i > 2) info.append("d").append(i + 1).append(": ").append(d_coords[i]).append(" ");
            else if (i == 0) info.append("x: ").append(d_coords[0]).append(" ");
            else if (i == 1) info.append("y: ").append(d_coords[1]).append(" ");
            else info.append("z: ").append(d_coords[2]).append(" ");
        }
        return info.toString();
    }

    /**
     * Определение дистанции между точками. Кол-во измерений у точек должно быть одинаковое.
     *
     * @param a первая точка
     * @param b вторая точка
     */
    public static double distance(Point2D a, Point2D b) {
        if (a.d_coords.length != b.d_coords.length) throw new IndexOutOfBoundsException();
        int sum = 0;
        for (int i = 0; i < a.d_coords.length; i++) {
            sum += Math.pow(a.d_coords[i] - b.d_coords[i], 2);
        }
        return Math.sqrt(sum);
    }
}
