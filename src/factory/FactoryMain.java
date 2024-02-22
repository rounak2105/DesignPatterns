package factory;

import factory.factory.CellDataFactory;
import factory.interfaces.CellData;

public class FactoryMain {
    public static void main(String[] args) {
        CellData cellData1 = CellDataFactory.getCellDataFromFactory("INT");
        System.out.println("value from INT is " + cellData1.getCellValue());

        CellData cellData2 = CellDataFactory.getCellDataFromFactory("STR");
        System.out.println("value from STR is " + cellData2.getCellValue());
    }
}
