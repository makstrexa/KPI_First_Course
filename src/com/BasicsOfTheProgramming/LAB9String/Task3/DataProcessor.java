package com.BasicsOfTheProgramming.LAB9String.Task3;

public class DataProcessor {
    private ChangerNumSys changerNumSys;

    public DataProcessor(ChangerNumSys changerNumSys) {
        this.changerNumSys = changerNumSys;
    }

    public void setChangerNumSys(int i){
        try{
            System.out.println(changerNumSys.changer(i));
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
