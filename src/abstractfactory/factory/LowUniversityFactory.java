package abstractfactory.factory;

public class LowUniversityFactory extends UniversityFactory {
    @Override
    public String getAdmitCard(String course) {
        return "Welcome to Low University for course : " + course;
    }
}
