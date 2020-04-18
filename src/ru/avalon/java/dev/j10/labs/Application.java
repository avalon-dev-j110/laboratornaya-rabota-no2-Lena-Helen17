package ru.avalon.java.dev.j10.labs;


import ru.avalon.java.dev.j10.labs.shapes.*;
public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(new PointClass(2,3) , 10);
        shapes[1] = new Rectangle(6,17);
        shapes[2] = new Triangle(4, 5, 1);
        shapes[3] = new Rectangle(5,6);
        shapes[4] = new Circle(new PointClass(6,8), 4);
        shapes[5] = new Triangle(9, 4, 4);
        shapes[6] = new Rectangle(5, 6);
        shapes[7] = new Triangle(23, 8,  4);
        shapes[8] = new Circle(new PointClass(5, 8), 6);
        shapes[9] = new Triangle( 5, 52, 5);
        
        
        float max = maxArea(shapes);
    System.out.println("максимальная площадь: " + max);
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }
   
    
    
    public static float maxArea (Shape shapes[]) {
        if (shapes.length == 0) {
            return 0;
        }
     float max = shapes[0].getArea();
     for (int i = 1; shapes.length > i; i++) {
         if (max < shapes[i].getArea()) {
             max = shapes[i].getArea();
         }
          
     }
     return max;
    }
}
