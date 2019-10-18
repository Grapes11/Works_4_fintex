package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Vehicle you_car;
        String newLine = System.getProperty("line.separator");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите марку машины: " + newLine +
                "1-Автоваз" + newLine +
                "2-Ламборджини" + newLine +
                "3-Мерседес" + newLine +
                "4-Камаз" + newLine +
                "5-Белаз" + newLine +
                "6-Урал" + newLine +
                "7-Yamaha" + newLine +
                "8-Honda" + newLine +
                "9-Harley-Davidson");

        while (true) {
            String number = reader.readLine();
            if (number.equals("1")) {
                you_car = new Autovaz();
                break;
            } else if (number.equals("2")) {
                you_car = new Lamborghini();
                break;
            } else if (number.equals("3")) {
                you_car = new Mercedes();
                break;
            } else if (number.equals("4")) {
                you_car = new Kamaz();
                break;
            } else if (number.equals("5")) {
                you_car = new Belaz();
                break;
            } else if (number.equals("6")) {
                you_car = new Ural();
                break;
            } else if (number.equals("7")) {
                you_car = new Yamaha();
                break;
            } else if (number.equals("8")) {
                you_car = new Honda();
                break;
            } else if (number.equals("9")) {
                you_car = new Harley_davidson();
                break;
            } else System.out.println("Попробуйте еще раз");
        }

            System.out.println("Заводитесь и погнали в путешествие. Чтобы завестись, нажмите g");
            while (true) {
                String key = reader.readLine();
                if (key.equals("g")) {
                    you_car.start_the_car();
                    break;
                } else System.out.println("Сначала заведитсь");
            }
            System.out.println("Управляйте машиной: w-вперед" + newLine +
                    "s-назад" + newLine +
                    "a-налево" + newLine +
                    "d-направо" + newLine +
                    "x-развернутся" + newLine +
                    "z-остановиться" + newLine +
                    "r-повысить передачу" + newLine +
                    "f-понизить передачу" + newLine +
                    "q-включить поворотник налево" + newLine +
                    "e-включить поворотник направо" + newLine +
                    "v-нажать на гудок" + newLine +
                    "off-выйти из игры");
            while (true) {
                String key = reader.readLine();
                if (key.equals("w"))
                    you_car.move_forward();
                else if (key.equals("s"))
                    you_car.move_backward();
                else if (key.equals("d"))
                    you_car.turn_right();
                else if (key.equals("a"))
                    you_car.turn_left();
                else if (key.equals("x"))
                    you_car.turn_around();
                else if (key.equals("z"))
                    you_car.stop();
                else if (key.equals("r"))
                    you_car.gear_shift("up");
                else if (key.equals("f"))
                    you_car.gear_shift("down");
                else if (key.equals("q"))
                    you_car.include_turn_signal("налево");
                else if (key.equals("e"))
                    you_car.include_turn_signal("направо");
                else if (key.equals("v"))
                    you_car.honking_machine();
                else if (key.equals("off"))
                    break;
                else System.out.println("Такой команды нет");

            }
        }

    }
