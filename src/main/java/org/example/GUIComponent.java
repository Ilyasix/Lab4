package org.example;

/**
 * Абстрактний клас для компонентів графічного інтерфейсу.
 */
public abstract class GUIComponent {
    protected Renderer renderer;

    /**
     * Конструктор для ініціалізації компонента з певною реалізацією рендерингу.
     *
     * @param renderer реалізація рендерингу
     */
    public GUIComponent(Renderer renderer) {
        this.renderer = renderer;
    }

    /**
     * Абстрактний метод для відображення компонента.
     */
    public abstract void display();
}
