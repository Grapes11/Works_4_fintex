package com.company;

public final class Main {
    private Main() { }

    /**
     * @param args
     * Гланый метод, в нм пишется основной код.
     */
    public static void main(final String[] args) {
        try {
            Manipulation car = new Manipulation();
            car.choiceCar();
            car.manipulationCar();
        } catch (Exception e) {
            e.getStackTrace();
        }
        }

    }
