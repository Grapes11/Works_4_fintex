package com.company;

public class Yamaha extends Motorcycles {
    /**
     * Максимальная передача.
     */
    private static final int MAX_GEAR = 5;
    Yamaha() {
        super();
        mark = "Yamaha";
        System.out.println("Вы выбрали"
                + " Yamaha, хороший выбор");
    }

    /**
     * Гудок.
     */
    public void honkingMachine() {
        System.out.println("Пип");
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
                System.out.println("Ниже некуда,"
                        + " ты и так на нейтралке,"
                        + " советую включить первую");
            }
        }

        System.out.println("Передача " + gear);
    }

    /**
     * Заведение мотоцикла.
     */
    public void startTheCar() {
        System.out.println("Врум");
    }
}
