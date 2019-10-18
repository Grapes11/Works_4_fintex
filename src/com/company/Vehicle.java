package com.company;
//интерфейс автомобиль
public interface Vehicle {
    void move_forward ();
    void move_backward ();
    void turn_left ();
    void turn_right ();
    void turn_around ();
    void stop ();
    void gear_shift (String direction);
    void include_turn_signal(String direction);
    void honking_machine ();
    void start_the_car();
}
