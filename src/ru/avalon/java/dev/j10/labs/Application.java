package ru.avalon.java.dev.j10.labs;


import ru.avalon.java.dev.j10.labs.shapes.*;
public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(2, 10, 6, 15);
        shapes[1] = new Rectangle(6,17);
        shapes[2] = new Triangle(4, 5, 1, 2, 1, 6);
        shapes[3] = new Circle(4, 3, 6, 8);
        shapes[4] = new Circle(7, 9, 52, 4);
        shapes[5] = new Circle(9, 4, 6, 4);
        shapes[6] = new Circle(5, 2, 4, 6);
        shapes[7] = new Circle(23, 8, 6, 4);
        shapes[8] = new Circle(5, 8, 4, 6);
        shapes[9] = new Circle(7, 5, 52, 5);
        
        
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
     float max = shapes[0].getArea();
     for (int i = 1; shapes.length > i; i++) {
         if (max < shapes[i].getArea()) {
             max = shapes[i].getArea();
         }
          
     }
     return max;
    }
}
