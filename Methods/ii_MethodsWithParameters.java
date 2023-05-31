public class ii_MethodsWithParameters {

    public void StudentMarks(int sudject1, int sudject2, int sudject3){
       int totalMarks= sudject1 + sudject2 + sudject3;
       System.out.println("Total Marks: "+totalMarks);
    }
    public static void main(String[] args){
        ii_MethodsWithParameters Mwp =new ii_MethodsWithParameters();
        Mwp.StudentMarks(23,23,12); // First way of passing in parameters

        int a=13 , b=23 , c=10;
        Mwp.StudentMarks(a,b,c); // Second way of passing in parameters
    }
}
