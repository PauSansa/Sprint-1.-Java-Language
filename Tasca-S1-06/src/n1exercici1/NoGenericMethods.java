package n1exercici1;

public class NoGenericMethods {
    private String s1;
    private String s2;
    private String s3;

    NoGenericMethods(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String[] getValors() {
        String[] valors = new String[]{s1,s2,s3};
        return valors;

    }
}
