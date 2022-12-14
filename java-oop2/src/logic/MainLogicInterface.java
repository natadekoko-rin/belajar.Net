package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.Logic01Soal01Impl;
import logic.logicInterface.logic02Impl.Logic02Soal01Impl;
import logic.logicInterface.logic02Impl.Logic02Soal02Impl;

public class MainLogicInterface {
    public static void main(String[] args) {
        // soal 01
        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(9));
        logic01Soal01.cetakArray();

        System.out.println("\n\nLogic 01 Soal 01");
        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogic(5));
        logic02Soal01.cetakArray();

        System.out.println("\n\nLogic 01 Soal 01");
        LogicInterface logic02Soal02 = new Logic02Soal02Impl(new BasicLogic(13));
        logic02Soal02.cetakArray();
    }
}
