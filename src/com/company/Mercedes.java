package com.company;

public class Mercedes extends Passenger_car {
   Mercedes()
    {
        super();
        mark="Мерседес";
        System.out.println("Вы выбрали мерседес");
    }

    public void honking_machine ()
    {
        System.out.println("Бип-Бип");
    }
    public void gear_shift (String direction)
    {
        System.out.println("У машины автомат, он сам переключит передачу");
    }
    public void start_the_car()
    {
        System.out.println("Почти бесшумный заводящийся движок");
    }
}
