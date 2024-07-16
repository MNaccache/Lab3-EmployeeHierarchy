package Lab3;

public class Employee {
    private static String firstName; //establishing the class-level variables
    private static String lastName;
    private static String socialSecurityNumber;

    protected Employee (String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName; //turns the class-level variables into the given ones when establishing Employee
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }//method end

    protected static String getFirstName () {
        return firstName; //accessor method for firstname
    }

    protected static String getLastName () {
        return lastName; //accessor method for lastname
    }

    protected static String getSocialSecurityNumber () {
        return socialSecurityNumber; //accessor method for the ssn
    }

    public String toString () {
        return String.format("%s: %s %s\n%s: %s", 
                            "commission employee", getFirstName(), getLastName(), 
                            "social security number", getSocialSecurityNumber()); //makes a string like "commission employee: John Smith\nsocial security number: 123456789"
    }
}
