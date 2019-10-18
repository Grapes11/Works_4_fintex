package com.company;

public class Kamaz extends Trucks {
    Kamaz()
    {
        super();
        mark="Камаз";
        System.out.println("Вы выбрали Камаз");
    }

    public void honking_machine ()
    {
        System.out.println("Биииииип");
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
        System.out.println("Трррррр-Тррррр");
    }
}
