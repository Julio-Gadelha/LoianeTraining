package Exercicios6.Tests;

import Exercicios6.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person gabriel = new Person();
        gabriel.setName("Gabriel");
        gabriel.setAge(18);

        System.out.println("HI, my name is  " + gabriel.getName() + " and, i have " + gabriel.getAge() + " years old ");
    }
}
