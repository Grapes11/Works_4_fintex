package com.company;

public class Honda extends Motorcycles {
    Honda() {
        super();
        mark = "Honda";
        System.out.println("Вы выбрали Honda,"
                + " смотрю любите погонять?)");
    }

    /**
     * Гудок.
     */
    public void honkingMachine() {
        System.out.println("Пип-пип");
    }

    /**
     * @param direction
     * Переключение передачи.
     */
    public void gearShift(final String direction) {
        System.out.println("АКПП все сделает за тебя");
    }

    /**
     * Заведение мотоцикла.
     */
    public void startTheCar() {
        System.out.println("Вруум-вруум");
    }
}
