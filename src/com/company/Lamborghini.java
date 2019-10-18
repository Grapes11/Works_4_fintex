package com.company;

public class Lamborghini extends Passenger_car {
    Lamborghini()
    {
        super();
        mark="Ламборджини";
        System.out.println("Вы выбрали ламборджини");
        Model l = new Model(2015, "Крайсный");
        System.out.println("год выпуска: "+l.year+" цвет: "+l.color);
    }

    public void honking_machine ()
    {
        System.out.println("Бип-бип-бип");
    }
    public void gear_shift (String direction)
    {
        System.out.println("У машины автомат, что ты собрался переключать?");
    }
    public void start_the_car()
    {
        System.out.println("Прекрасные звуки движка...завелась");
    }

    private class Model
    {
        private int year;
        private String  color;
        private Model (int number, String color)
        {
            this.year = number;
            this.color = color;
        }
    }
}
