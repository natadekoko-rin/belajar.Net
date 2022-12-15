package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){

    }
    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
