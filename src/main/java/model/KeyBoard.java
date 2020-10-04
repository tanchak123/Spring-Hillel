package model;

import enums.KeyBoardType;

public abstract class KeyBoard {
    private static int counter = 0;
    private String model;
    private int id = ++counter;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public abstract KeyBoardType getKeyBoardType();

    public void type(String text) {
        System.out.println(text);
    }
}
