package com.company;

public abstract class Trucks implements Vehicle {
    /**
     * включенная передача.
     */
    int gear;
    /**
     * марка грузовика.
     */
    String mark;
    Trucks() {
        gear = 0;
    }

    /**
     * Движение вперед.
     */
    public void moveForward() {
        System.out.println("Грузовик едет вперед");
    }

    /**
     * Движение назад.
     */
    public void moveBackward() {
        System.out.println("Грузовик едет назад");
    }

    /**
     * Поворот налево.
     */
    public void turnLeft() {
        System.out.println("Грузовик повернула налево");
    }

    /**
     * Поворот направо.
     */
    public void turnRight() {
        System.out.println("Грузовик повернула"
                + " направо");
    }

    /**
     * Разворот.
     */
    public void turnAround() {
        System.out.println("Грузовик развернулась");
    }

    /**
     * Остановка.
     */
    public void stop() {
        System.out.println("Грузовик остановилась");
    }

    /**
     * @param direction
     * Включение поворотника.
     */
    public void includeTurnSignal(final String direction) {
        if (direction.equals("налево")) {
            System.out.println("Грузовик соберается"
                    + " повернуть налево");
        }
        if (direction.equals("направо")) {
            System.out.println("Грузовик соберается"
                    + " повернуть направо");
        }
    }

    /**
     * Гудок.
     */
    public abstract void honkingMachine();

    /**
     * @param direction
     * Переключение передачи.
     */
    public abstract void gearShift(String direction);

    /**
     * Заведение грузовика.
     */
    public abstract void startTheCar();
}
