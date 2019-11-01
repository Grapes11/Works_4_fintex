package com.company;

public class Autovaz extends PassengerCar {
    /**
     *
     * максимальное уоличество
     * передач у Автоваза
     */
    private static final int MAX_GEAR = 5;

    Autovaz() {
        super();
        mark = "Автоваз";
        System.out.println("Вы выбрали автоваз");
    }

    /**
     * Гудок.
     */
    public void honkingMachine() {
        System.out.println("Бип");
    }

    /**
     * @param direction
     * Перключение передач.
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
     * Заведение машины.
     */
    public void startTheCar() {
        System.out.println("Тр-тр-тр, не заводится,"
                + " попробуем снова..."
                + " Тр-тр-тр, фух, завелась");
    }
}
