package abstractfactory.factory;

public class HighUniversityfactory extends UniversityFactory{
    @Override
    public String getAdmitCard(String course) {
        return "Welcome to High University for course : " + course;
    }
}
