package com.company;

public class Belaz extends Trucks {
    Belaz() {
        super();
        mark = "Белаз";
        System.out.println("Вы выбрали Белаз,"
                + " ток не раздавите никого)");
    }

    /**
     * Гудок.
     */
    public void honkingMachine() {
        System.out.println("БИИИИИП-БИИИИИП");
    }

    /**
     * @param direction
     * Перключение передач.
     */
    public void gearShift(final String direction) {
        System.out.println("Езжай на первой");
    }

    /**
     * Заведение грузовика.
     */
    public void startTheCar() {
        System.out.println("ТРРРРР-ВРРРР");
    }
}
