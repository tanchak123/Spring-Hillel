package model;

import enums.KeyBoardType;

public class KeyBoardMembrane extends KeyBoard {

    private final KeyBoardType keyBoardType;

    public KeyBoardMembrane() {
        this.keyBoardType = KeyBoardType.MEMBRANE;
    }

    public KeyBoardType getKeyBoardType() {
        return keyBoardType;
    }

}
