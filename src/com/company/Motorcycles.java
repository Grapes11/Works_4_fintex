package com.company;

public abstract class Motorcycles implements Vehicle {
    /**
     * включенная передача.
     */
    int gear;
    /**
     * Марка мотоцикла.
     */
    String mark;
    Motorcycles() {
        gear = 0;
    }

    /**
     * Движение вперед.
     */
    public void moveForward() {
        System.out.println("Мотоцикл едет вперед");
    }

    /**
     * Движение назад.
     */
    public void moveBackward() {
        System.out.println("Мотоцикл едет назад");
    }

    /**
     * Поврот налево.
     */
    public void turnLeft() {
        System.out.println("Мотоцикл повернула налево");
    }

    /**
     * Поворот направо.
     */
    public void turnRight() {
        System.out.println("Мотоцикл"
                + " повернула направо");
    }

    /**
     * Разворот.
     */
    public void turnAround() {
        System.out.println("Мотоцикл развернулась");
    }

    /**
     * Остановка.
     */
    public void stop() {
        System.out.println("Мотоцикл остановилась");
    }

    /**
     * @param direction
     * Включение поворотника.
     */
    public void includeTurnSignal(final String direction) {
        if (direction.equals("налево")) {
            System.out.println("Мотоцикл соберается"
                    + " повернуть налево");
        }
        if (direction.equals("направо")) {
            System.out.println("Мотоцикл соберается"
                    + " повернуть направо");
        }
    }

    /**
     * Гудок.
     */
    public abstract void honkingMachine();

    /**
     * @param direction
     * Перключение передачи.
     */
    public abstract void gearShift(String direction);

    /**
     * Заведение мотоцикла.
     */
    public abstract void startTheCar();
}
