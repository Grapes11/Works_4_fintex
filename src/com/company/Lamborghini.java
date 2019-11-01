package com.company;

public class Lamborghini extends PassengerCar {
    /**
     * Год выпуска машины.
     */
    private static final int YEAR = 2015;
    Lamborghini() {
        super();
        mark = "Ламборджини";
        System.out.println("Вы выбрали ламборджини");
        Model l = new Model(YEAR, "Красный");
        System.out.println("год выпуска: " + l.year
                + " цвет: " + l.color);
    }

    /**
     * Гудок.
     */
    public void honkingMachine() {
        System.out.println("Бип-бип-бип");
    }

    /**
     * @param direction
     * Переключение передач.
     */
    public void gearShift(final String direction) {
        System.out.println("У машины автомат,"
                + " что ты собрался переключать?");
    }

    /**
     * Заведение машины.
     */
    public void startTheCar() {
        System.out.println("Прекрасные звуки"
                + " движка...завелась");
    }

    private final class Model {
        /**
         * год выпуска.
         */
        private int year;
        /**
         * цвет машины.
         */
        private String color;
        private Model(final int number, final String colorr) {
            this.year = number;
            this.color = colorr;
        }
    }
}
