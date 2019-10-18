package com.company;

public class Belaz extends Trucks {
    Belaz()
    {
        super();
        mark="Белаз";
        System.out.println("Вы выбрали Белаз, ток не раздавите никого)");
    }

    public void honking_machine ()
    {
        System.out.println("БИИИИИП-БИИИИИП");
    }
    public void gear_shift (String direction)
    {
        System.out.println("Езжай на первой");
    }
    public void start_the_car()
    {
        System.out.println("ТРРРРР-ВРРРР");
    }
}
