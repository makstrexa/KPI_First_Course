package com.Programming2.Lab_12_Stream_API;

public class Graduate {

    private final String surname;
    private final int points;

    public Graduate(String surname, int points) {
        try {
            if (surname.isEmpty() || points < 0 || points > 100)
                throw new IllegalArgumentException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        this.surname = surname;
        this.points = points;

    }

    public String getSurname() {
        return surname;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Graduate {" +
                " surname = '" + surname  +
                ", points = " + points +
                '}';
    }
}
