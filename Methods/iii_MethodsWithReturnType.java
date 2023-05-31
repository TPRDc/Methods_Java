public class iii_MethodsWithReturnType {

    public static void main(String[] args) {
        iii_MethodsWithReturnType Mwrt =new iii_MethodsWithReturnType();
        Mwrt.Welcome();

        String Employee1Name= "Prince Tiko" , Employee2Name= "Richard David";

        int Employee1Salary= Mwrt.employeeSalary(Employee1Name,234,2444,2433);
        int Employee2Salary= Mwrt.employeeSalary(Employee2Name,64,64,65);

        int totalSalaryPaid= Employee1Salary + Employee2Salary;

        // with the help of the jump statement (return) we can store our out put in a variable (Employee1Salary)
        // and also get/know the total amount of salary that was paid out (totalSalaryPaid)
        System.out.println("Total Employee's Salary Paid Out: N"+ totalSalaryPaid);
    }

    // 1st example of methods with return type
    public int employeeSalary(String name, int basicSalary, int hra, int bouns){
        int netSalary = basicSalary + hra + bouns;
        System.out.println("Employee Name: "+name+"\nTotal Employee Salary: N"+ netSalary);
        return netSalary;
    }

    // 2nd example of methods with return type
    public String Welcome(){
        System.out.println("WELCOME TO OUR COMPANY");
        return "";
    }
}
