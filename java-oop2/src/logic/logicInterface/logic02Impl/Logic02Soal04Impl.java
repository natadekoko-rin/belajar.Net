package logic.logicInterface.logic02Impl;

import logic.logic01.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal04Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal04Impl(BasicLogic logic){this.logic=logic;}

    public void isiArray(){
        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if (i==this.logic.n-1 || i==0 || j==this.logic.n-1 || j==0){
                    this.logic.array[0][i] = String.valueOf(Integer.valueOf(this.logic.array[0][i - 1]) + Integer.valueOf(this.logic.array[0][i - 2]));
                }else{
                    this.logic.array[0][i] = String.valueOf(Integer.valueOf(1));
                }
            }

        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
