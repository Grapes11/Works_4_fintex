/**
 * Данный интерфейс реализует
 * средство передвижения.
 *
 * @version 18.10.2019
 *
 * @author Никита Виноградов
 */
package com.company;

public interface Vehicle {
    /**
     * Движение вперед.
     */
    void moveForward();

    /**
     * Движение назад.
     */
    void moveBackward();

    /**
     * Поворот налево.
     */
    void turnLeft();

    /**
     * Поворот направо.
     */
    void turnRight();

    /**
     * Разворот.
     */
    void turnAround();

    /**
     * Остановка.
     */
    void stop();

    /**
     * @param direction
     * Перключение передачи.
     */
    void gearShift(String direction);

    /**
     * @param direction
     * Включение поворотника.
     */
    void includeTurnSignal(String direction);

    /**
     * Гудок.
     */
    void honkingMachine();

    /**
     * Заведение средства передвижения.
     */
    void startTheCar();
}
