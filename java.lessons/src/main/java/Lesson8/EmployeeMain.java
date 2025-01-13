package Lesson8;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee [] arrEmpl = new Employee[5];
        arrEmpl[0]= new Employee("Alex","QA", "alex@alex",5533,44, 44);
        arrEmpl[1]= new Employee("Mike","Dev", "mike@mike",5544,55, 33);
        arrEmpl[2]= new Employee("Tim","CS", "tim@tim",5522,22, 22);
        arrEmpl[3]= new Employee("Sam","QC", "sam@sam",5566,11, 55);
        arrEmpl[4]= new Employee("Ben","Engineer", "ben@ben",5577,66, 36);
        for(Employee employee1: arrEmpl) {
            if (employee1.getAge() < 40){
                employee1.getInfo();
            }
        }

    }

}
