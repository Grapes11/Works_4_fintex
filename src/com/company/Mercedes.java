package com.company;

public class Mercedes extends PassengerCar {
   Mercedes() {
        super();
        mark = "Мерседес";
        System.out.println("Вы выбрали мерседес");
    }

    /**
     * Гудок.
     */
    public void honkingMachine() {
        System.out.println("Бип-Бип");
    }

    /**
     * @param direction
     * Перключение передач.
     */
    public void gearShift(final String direction) {
        System.out.println("У машины автомат,"
                + " он сам переключит передачу");
    }

    /**
     * Заведение машины.
     */
    public void startTheCar() {
        System.out.println("Почти бесшумны"
                + " заводящийся движок");
    }
}
