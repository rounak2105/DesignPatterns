package abstractfactory.factory;


public abstract class UniversityFactory {
    public static UniversityFactory findUniversity(int marks) {
        if(80 < marks)
            return new HighUniversityfactory();
        else
            return new LowUniversityFactory();
    }
    public abstract String getAdmitCard(String course);
}
