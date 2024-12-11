package org.example;

/**
 * Реалізація рендерингу для бібліотеки Qt.
 */
public class QtRenderer implements Renderer {

    @Override
    public void render() {
        System.out.println("зображено за допомогою Qt.");
    }
}
