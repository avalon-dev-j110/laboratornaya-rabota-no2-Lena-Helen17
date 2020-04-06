package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle extends PointClass implements Ellipse {

    public Circle(float tochka1X, float tochka1Y, float tochka2X, float tochka2Y) {
        super(tochka1X, tochka1Y, tochka2X, tochka2Y);
    }
    
   
    @Override
    public float getLength() {
    return (float) (Math.PI * getLengthLine(getX(getTochka1X(),getTochka2X()), getY(getTochka1Y(),getTochka2Y())));
    }

    @Override
    public float getArea() {
        float radius = (float) (getLengthLine(getX(getTochka1X(),getTochka2X()), getY(getTochka1Y(),getTochka2Y()))/2);
       return (float) (Math.PI * radius * radius );
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    
}
