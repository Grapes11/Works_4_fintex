package com.company;

public class Ural extends Trucks {
    Ural()
    {
        super();
        mark="Урал";
        System.out.println("Вы выбрали Урал");
    }

    public void honking_machine ()
    {
        System.out.println("Бии-Биип");
    }
    public void gear_shift (String direction)
    {
        if (direction.equals("up"))
        {
            if (gear<5)
                gear=gear+1;
            else System.out.println("Больше передач нет");
        }
        else if (direction.equals("down"))
        {
            if (gear>=1)
                gear=gear-1;
            else System.out.println("Ниже некуда, ты и так на нейтралке, советую включить первую");
        }

        System.out.println("Передача "+gear);
    }
    public void start_the_car()
    {
        System.out.println("Трр-Трр");
    }
}
