package com.company;

public class Autovaz extends Passenger_car {

    Autovaz()
    {
        super();
        mark="Автоваз";
        System.out.println("Вы выбрали автоваз");
    }

    public void honking_machine ()
    {
        System.out.println("Бип");
    }


    public void gear_shift (String direction)
    {
        if (direction.equals("up"))
        {
            if (gear<6)
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
        System.out.println("Тр-тр-тр, не заводится, попробуем снова... Тр-тр-тр, фух, завелась");
    }
}
