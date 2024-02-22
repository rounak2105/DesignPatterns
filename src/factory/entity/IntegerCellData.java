package factory.entity;

import factory.interfaces.CellData;

public class IntegerCellData implements CellData {

    @Override
    public Integer getCellValue() {
        return 100;
    }
}
