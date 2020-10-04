package model;

import enums.KeyBoardType;

public class KeyBoardMechanics extends KeyBoard {
    private final KeyBoardType keyBoardType;

    public KeyBoardMechanics() {
        this.keyBoardType = KeyBoardType.MECHANIC;
    }

    public KeyBoardType getKeyBoardType() {
        return keyBoardType;
    }

}
