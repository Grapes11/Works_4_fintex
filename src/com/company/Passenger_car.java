package com.company;
//абстрактный класс легковой автомобиль
public abstract class Passenger_car implements Vehicle {
    int gear;
    String mark;
    Passenger_car()
    {
        gear=0;
    }

    public void move_forward ()
    {
        System.out.println("Машина едет вперед");
    }
    public void move_backward ()
    {
        System.out.println("Машина едет назад");
    }
    public void turn_left ()
    {
        System.out.println("Машина повернула налево");
    }
    public void turn_right ()
    {
        System.out.println("Машина повернула направо");
    }
    public void turn_around ()
    {
        System.out.println("Машина развернулась");
    }
    public void stop ()
    {
        System.out.println("Машина остановилась");
    }
    public void include_turn_signal(String direction)
    {
        if (direction.equals("налево"))
            System.out.println("Машина соберается повернуть налево");
        if (direction.equals("направо"))
            System.out.println("Машина соберается повернуть направо");
    }
    public abstract void honking_machine ();
    public abstract void gear_shift (String direction);
    public abstract void start_the_car();

}

