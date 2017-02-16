package ua.itea.homeWork02Generics;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/2/17
 */
public class Department<T extends Employee> {

    private Array<T> listEmployee;
    private String nameDepartment;

    public Department(String nameDepartment){
        listEmployee = new Array<>();
        this.nameDepartment = nameDepartment;
    }

    public double averageAge(){
        double average = 0;
        for (int i = 0; i < listEmployee.size(); i++){
            average += listEmployee.get(i).getAge();
        }
        return average/listEmployee.size();
    }

    public boolean hasSameAverageAge(Department d, double epsilon){
        return d.averageAge() == epsilon;
    }

    public void addEmployee(T e){
        listEmployee.add(e);
    }




}
