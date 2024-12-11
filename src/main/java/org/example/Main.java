package org.example;

/**
 * Головний клас для демонстрації використання патерна "Міст".
 */
public class Main {
    public static void main(String[] args) {
        // Відображення елементів інтерфейсу, використовуючи різні бібліотеки
        GUIComponent circleWithQt = new Circle(new QtRenderer());
        circleWithQt.display();

        GUIComponent rectangleWithGtk = new Rectangle(new GtkRenderer());
        rectangleWithGtk.display();

        // Додатковий приклад
        GUIComponent circleWithGtk = new Circle(new GtkRenderer());
        circleWithGtk.display();
    }
}
