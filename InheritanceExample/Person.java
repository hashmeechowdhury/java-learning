package InheritanceExample;

public class Person {

    // private instance data declaration
    private String ssNumber;
    private String name;
    private String dateOfBirth;

    // public getter & setter methods/properties declaration
    public String getSSNumber() {
        return ssNumber;
    }

    public void setSSNumber(String newSSNumber) {
        ssNumber = newSSNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String newBDate) {
        dateOfBirth = newBDate;
    }

    // public instance methods declaration
    public void print() {
        System.out.println("The Person Record: ");
        System.out.println("Name = " + name);
        System.out.println("Social Security Number = " + ssNumber);
        System.out.println("Date of Birth = " + dateOfBirth);
    }

    // Inheritance
    public static class Employee extends Person {
        private String hireDate;
        private double salary;

        public String getHireDate() {
            return hireDate;
        }

        public void setHireDate(String newHireDate) {
            hireDate = newHireDate;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double newSalary) {
            salary = newSalary;
        }

        public void printEmployee() {
            System.out.println("The Person Record: ");
            System.out.println("Hired date = " + hireDate);
            System.out.println("Yearly = " + salary);
        }
    }

    public static void main(String[] args) {
        Person objPerson = new Person();
        Employee objEmployee = new Employee();

        objPerson.setSSNumber("1111");
        objPerson.setName("Joe Smith");
        objPerson.setDateOfBirth("01/01/1971");

        objPerson.print();

        System.out.println();
        System.out.println();

        objEmployee.setSSNumber("4444");
        objEmployee.setName("Mary Johnson");
        objEmployee.setDateOfBirth("04/04/1974");
        objEmployee.setHireDate("03/09/2004");
        objEmployee.setSalary(45000.00);

        objEmployee.print();
        objEmployee.printEmployee();
    }

}
