package factory.entity;

import factory.interfaces.CellData;

public class StringCellData implements CellData {
    @Override
    public String getCellValue() {
        return "This is a string!";
    }
}
