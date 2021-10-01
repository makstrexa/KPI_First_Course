package com.BasicsOfTheProgramming.LAB9String.Task3;

public class OctNumChanger implements ChangerNumSys {
    @Override
    public String changer(int num) {
        return Integer.toOctalString(num);
    }
}
