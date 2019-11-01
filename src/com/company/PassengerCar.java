package com.company;

public abstract class PassengerCar implements Vehicle {
    /**
     * Включенная передача.
     */
    int gear;
    /**
     * Марка машины.
     */
    String mark;
    PassengerCar() {
        gear = 0;
    }

    /**
     * Движение вперед.
     */
    public void moveForward() {
        System.out.println("Машина едет вперед");
    }

    /**
     * Движение назад.
     */
    public void moveBackward() {
        System.out.println("Машина едет назад");
    }

    /**
     * Поворот налево.
     */
    public void turnLeft() {
        System.out.println("Машина повернула налево");
    }

    /**
     * Поворот направо.
     */
    public void turnRight() {
        System.out.println("Машина повернула направо");
    }

    /**
     * Разворот.
     */
    public void turnAround() {
        System.out.println("Машина развернулась");
    }

    /**
     * Остановка.
     */
    public void stop() {
        System.out.println("Машина остановилась");
    }

    /**
     * @param direction
     * Включить поворотник.
     */
    public void includeTurnSignal(final String direction) {
        if (direction.equals("налево")) {
            System.out.println("Машина соберается"
                    + " повернуть налево");
        }
        if (direction.equals("направо")) {
            System.out.println("Машина соберается"
                    + " повернуть направо");
        }
    }

    /**
     * Гудок.
     */
    public abstract void honkingMachine();

    /**
     * @param direction
     * Перключение передач.
     */
    public abstract void gearShift(String direction);

    /**
     * Заведение машины.
     */
    public abstract void startTheCar();

}

