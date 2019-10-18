package com.company;

public abstract class Motorcycles implements Vehicle {
    int gear;
    String mark;
    Motorcycles()
    {
        gear=0;
    }

    public void move_forward ()
    {
        System.out.println("Мотоцикл едет вперед");
    }
    public void move_backward ()
    {
        System.out.println("Мотоцикл едет назад");
    }
    public void turn_left ()
    {
        System.out.println("Мотоцикл повернула налево");
    }
    public void turn_right ()
    {
        System.out.println("Мотоцикл повернула направо");
    }
    public void turn_around ()
    {
        System.out.println("Мотоцикл развернулась");
    }
    public void stop ()
    {
        System.out.println("Мотоцикл остановилась");
    }
    public void include_turn_signal(String direction)
    {
        if (direction.equals("налево"))
            System.out.println("Мотоцикл соберается повернуть налево");
        if (direction.equals("направо"))
            System.out.println("Мотоцикл соберается повернуть направо");
    }
    public abstract void honking_machine ();
    public abstract void gear_shift (String direction);
    public abstract void start_the_car();
}
