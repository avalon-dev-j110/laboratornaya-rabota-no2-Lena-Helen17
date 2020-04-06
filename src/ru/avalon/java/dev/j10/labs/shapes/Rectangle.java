package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    private float lineStorona1;
    private float lineStorona2;

    public Rectangle(float lineStorona1, float lineStorona2) {
        this.lineStorona1 = lineStorona1;
        this.lineStorona2 = lineStorona2;
    }

    public float getLineStorona1() {
        return lineStorona1;
    }

    public float getLineStorona2() {
        return lineStorona2;
    }
    

    @Override
    public float getPerimeter() {
        return 2 * (lineStorona1 + lineStorona2);
    }

    @Override
    public float getArea() {
        return lineStorona1 * lineStorona2;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
}
