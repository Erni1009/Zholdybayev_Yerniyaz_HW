package Lesson8;

public class Employee {

    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
    private String[] infoArray;

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println("Name is " + "\"" + name + "\"");
        System.out.println("Postion is " + "\"" + position + "\"");
        System.out.println("Email is " + "\"" + email + "\"");
        System.out.println("Phone is " + "\"" + phone + "\"");
        System.out.println("Salary is " + "\"" + salary + "\"");
        System.out.println("Age is " + "\"" + age + "\"");
        System.out.println("==================================");
    }


}


