package org.example;

/**
 * Реалізація рендерингу для бібліотеки GTK.
 */
public class GtkRenderer implements Renderer {

    @Override
    public void render() {
        System.out.println("зображено за допомогою GTK.");
    }
}
