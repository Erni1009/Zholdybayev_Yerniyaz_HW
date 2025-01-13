package Lesson8;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee [] arrEmp = new Employee[5];
        arrEmp[0]= new Employee("Alex","QA", "alex@alex",5533,44, 44);
        arrEmp[1]= new Employee("Mike","Dev", "mike@mike",5544,55, 33);
        arrEmp[2]= new Employee("Tim","CS", "tim@tim",5522,22, 22);
        arrEmp[3]= new Employee("Sam","QC", "sam@sam",5566,11, 55);
        arrEmp[4]= new Employee("Ben","Engineer", "ben@ben",5577,66, 36);
        for(Employee employee1: arrEmp) {
            if (employee1.getAge() < 40){
                employee1.getInfo();
            }
        }

    }

}
