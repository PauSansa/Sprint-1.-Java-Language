package n3exercici1;

public class Redactor {
    private String name;
    private final String dni;
    private static int salary = 1500;

    public Redactor(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public static int getSalary() {
        return salary;
    }


}
