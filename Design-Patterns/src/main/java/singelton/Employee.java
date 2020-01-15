package singelton;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable {

        private static Employee employee;

        private Employee(){
            if (Employee.employee != null){
                throw new InstantiationError("Can't instantiate singleton twice ... ");
            }
        }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return employee;
    }

    public static Employee getEmployee(){

            if(employee == null) {
                synchronized (Employee.class) {
                    if (employee == null) {
                        employee = new Employee();
                    }
                }
            }
            return employee;
        }

        //to prevent new Object during deserialization.
        private Object readResolve(){
            return employee;
        }

    public static void main(String[] args) throws Exception{
        Employee obj = Employee.getEmployee();

        Employee objUsingReflection = Employee.class.newInstance();

        System.out.println("original object : " + obj.hashCode());
        System.out.println("Object using reflection :" + objUsingReflection.hashCode());

    }

}
