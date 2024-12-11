package org.example;

/**
 * Клас, який представляє прямокутник як компонент графічного інтерфейсу.
 */
public class Rectangle extends GUIComponent {

    public Rectangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void display() {
        System.out.print("Прямокутник: ");
        renderer.render();
    }
}
