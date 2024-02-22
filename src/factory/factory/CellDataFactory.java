package factory.factory;

import factory.entity.IntegerCellData;
import factory.entity.StringCellData;
import factory.interfaces.CellData;

public class CellDataFactory {
    public static CellData getCellDataFromFactory(String str) {
        if(str.equals("INT"))
            return new IntegerCellData();
        else
            return new StringCellData();
    }
}
