/**
 * Данный класс реализует методы,
 * которые позволяют управлять
 * средствами передвижения
 */
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Manipulation {
    /**
     * Объект интерфейса Vehicle.
     * Им будем управлять через консоль.
     */
    private static Vehicle youCar;
    /**
     * Позволяет производить пренос строки.
     */
    private static String newLine = System.getProperty("line.separator");
    /**
     * Поток чтения данных из консоли.
     */
    private BufferedReader reader
            = new BufferedReader(new InputStreamReader(System.in));

    void choiceCar() throws IOException {
        System.out.println("Выберите марку машины: "
                + newLine + "1-Автоваз"
                + newLine + "2-Ламборджини"
                + newLine + "3-Мерседес"
                + newLine + "4-Камаз"
                + newLine + "5-Белаз"
                + newLine + "6-Урал"
                + newLine + "7-Yamaha"
                + newLine + "8-Honda"
                + newLine + "9-Harley-Davidson");

        label:
        while (true) {
            String number = reader.readLine();
            switch (number) {
                case "1":
                    youCar = new Autovaz();
                    break label;
                case "2":
                    youCar = new Lamborghini();
                    break label;
                case "3":
                    youCar = new Mercedes();
                    break label;
                case "4":
                    youCar = new Kamaz();
                    break label;
                case "5":
                    youCar = new Belaz();
                    break label;
                case "6":
                    youCar = new Ural();
                    break label;
                case "7":
                    youCar = new Yamaha();
                    break label;
                case "8":
                    youCar = new Honda();
                    break label;
                case "9":
                    youCar = new HarleyDavidson();
                    break label;
                default:
                    System.out.println("Попробуйте еще раз");
                    break;
            }
        }
    }

    void manipulationCar() throws IOException {
        System.out.println("Заводитесь и"
                + " погнали в путешествие."
                + " Чтобы завестись, нажмите g");
        while (true) {
            String key = reader.readLine();
            if (key.equals("g")) {
                youCar.startTheCar();
                break;
            } else {
                System.out.println("Сначала заведитесь");
            }
        }
        System.out.println("Управляйте машиной: w-вперед"
                + newLine + "s-назад"
                + newLine + "a-налево"
                + newLine + "d-направо"
                + newLine + "x-развернутся"
                + newLine + "z-остановиться"
                + newLine + "r-повысить передачу"
                + newLine + "f-понизить передачу"
                + newLine + "q-включить "
                        + "поворотник налево"
                + newLine + "e-включить "
                        + "поворотник направо"
                + newLine + "v-нажать на гудок"
                + newLine + "off-выйти из игры");
        label:
        while (true) {
            String key = reader.readLine();
            switch (key) {
                case "w":
                    youCar.moveForward();
                    break;
                case "s":
                    youCar.moveBackward();
                    break;
                case "d":
                    youCar.turnRight();
                    break;
                case "a":
                    youCar.turnLeft();
                    break;
                case "x":
                    youCar.turnAround();
                    break;
                case "z":
                    youCar.stop();
                    break;
                case "r":
                    youCar.gearShift("up");
                    break;
                case "f":
                    youCar.gearShift("down");
                    break;
                case "q":
                    youCar.includeTurnSignal("налево");
                    break;
                case "e":
                    youCar.includeTurnSignal("направо");
                    break;
                case "v":
                    youCar.honkingMachine();
                    break;
                case "off":
                    break label;
                default:
                    System.out.println("Такой команды нет");
                    break;
            }

        }
    }
}
