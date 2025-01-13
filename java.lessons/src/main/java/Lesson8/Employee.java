package Lesson8;

public class Employee {

    public static String name;
    public static String position;
    public static String email;
    public Integer phone;
    public Integer salary;
    public Integer age;
    public String[] infoArray;

    public static void main(String[] args) {
        //Employee employee = new Employee("Ivan", "QA", "sdad", 123, 23, 23 );
        printInfo(new Employee("Ivan", "QA", "sdad", 123, 23, 23, new String[]{"info", "info"}));
    }


    public Employee(String name, String position, String email, Integer phone, Integer salary, Integer age, String[] infoArray) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.infoArray = infoArray;


    }

    public String getName() {
        return name;
    }

    public static void printInfo(Employee employee) {
        System.out.println("name: " + name + ", " + "pos: " + position + " " + "email: " + " " + email + " " + employee.infoArray);

    }


}


