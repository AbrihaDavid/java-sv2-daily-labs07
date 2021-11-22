package day01;

import java.time.Year;

public class Human {

    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {

        if (Year.now().getValue() - yearOfBirth > 120){
            throw new IllegalArgumentException("Too old!");
        }
        else {
            this.yearOfBirth = yearOfBirth;
        }

        if (!name.contains(" ")){
            throw new IllegalArgumentException("Name is too short!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
