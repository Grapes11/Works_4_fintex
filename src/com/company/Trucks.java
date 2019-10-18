package com.company;

public abstract class Trucks implements Vehicle {
    int gear;
    String mark;
    Trucks()
    {
        gear=0;
    }

    public void move_forward ()
    {
        System.out.println("Грузовик едет вперед");
    }
    public void move_backward ()
    {
        System.out.println("Грузовик едет назад");
    }
    public void turn_left ()
    {
        System.out.println("Грузовик повернула налево");
    }
    public void turn_right ()
    {
        System.out.println("Грузовик повернула направо");
    }
    public void turn_around ()
    {
        System.out.println("Грузовик развернулась");
    }
    public void stop ()
    {
        System.out.println("Грузовик остановилась");
    }
    public void include_turn_signal(String direction)
    {
        if (direction.equals("налево"))
            System.out.println("Грузовик соберается повернуть налево");
        if (direction.equals("направо"))
            System.out.println("Грузовик соберается повернуть направо");
    }
    public abstract void honking_machine ();
    public abstract void gear_shift (String direction);
    public abstract void start_the_car();
}
