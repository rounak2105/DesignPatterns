package abstractfactory;

import abstractfactory.factory.UniversityFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        UniversityFactory universityFactory = UniversityFactory.findUniversity(90);
        String admitCard = universityFactory.getAdmitCard("MATH");
        System.out.println(admitCard);
        universityFactory = UniversityFactory.findUniversity(60);
        admitCard = universityFactory.getAdmitCard("SCIENCE");
        System.out.println(admitCard);
    }
}
