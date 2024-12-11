package org.example;

/**
 * Клас, який представляє коло як компонент графічного інтерфейсу.
 */
public class Circle extends GUIComponent {

    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void display() {
        System.out.print("Коло: ");
        renderer.render();
    }
}
