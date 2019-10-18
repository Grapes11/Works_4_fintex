package com.company;

public class Honda extends Motorcycles {
    Honda()
    {
        super();
        mark="Honda";
        System.out.println("Вы выбрали Honda, смотрю любите погонять?)");
    }

    public void honking_machine ()
    {
        System.out.println("Пип-пип");
    }
    public void gear_shift (String direction)
    {
        System.out.println("АКПП все сделает за тебя");
    }
    public void start_the_car()
    {
        System.out.println("Вруум-вруум");
    }
}
