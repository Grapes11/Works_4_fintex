package com.company;

public class Ural extends Trucks {
    /**
     * Максимальная передача.
     */
    private static final int MAX_GEAR = 5;
    Ural() {
        super();
        mark = "Урал";
        System.out.println("Вы выбрали Урал");
    }

    /**
     * Гудок.
     */
    public void honkingMachine() {
        System.out.println("Бии-Биип");
    }

    /**
     * @param direction
     * Переключение передачи.
     */
    public void gearShift(final String direction) {
        if (direction.equals("up")) {
            if (gear < MAX_GEAR) {
                gear = gear + 1;
            } else {
                System.out.println("Больше передач нет");
            }
        } else if (direction.equals("down")) {
            if (gear >= 1) {
                gear = gear - 1;
            } else {
                System.out.println("Ниже некуда, ты и так"
                        + " на нейтралке, советую"
                        + " включить первую");
            }
        }

        System.out.println("Передача " + gear);
    }

    /**
     * Заведение грузовика.
     */
    public void startTheCar() {
        System.out.println("Трр-Трр");
    }
}
