package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle extends PointClass implements Polygon{
    
    private float tochka3X;
    private float tochka3Y;
    float line1storona = getLengthLine(getX(getTochka1X(),getTochka2X()), getY(getTochka1Y(),getTochka2Y()));
    float line2storona = getLengthLine(getX(getTochka1X(),getTochka3X()), getY(getTochka1Y(),getTochka3Y()));
    float line3storona = getLengthLine(getX(getTochka2X(),getTochka3X()), getY(getTochka2Y(),getTochka3Y()));

    public Triangle(float tochka3X, float tochka3Y, float tochka1X, float tochka1Y, float tochka2X, float tochka2Y) {
        super(tochka1X, tochka1Y, tochka2X, tochka2Y);
        this.tochka3X = tochka3X;
        this.tochka3Y = tochka3Y;
    }

    public float getTochka3X() {
        return tochka3X;
    }

    public float getTochka3Y() {
        return tochka3Y;
    }

    @Override
    public float getPerimeter() {
        
        float perimetr = line1storona + line2storona + line3storona;
        return perimetr;
    }

    @Override
    public float getArea() {
        float polyperimetr = getPerimeter() / 2;
        float area = (float) Math.sqrt((polyperimetr * (polyperimetr - line1storona) * (polyperimetr - line2storona) * (polyperimetr - line3storona)));
        
        return area;
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
