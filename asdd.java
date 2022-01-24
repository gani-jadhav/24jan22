import org.testng.Assert;
import org.testng.annotations.Test;

public class asdd {
   private String emp_name;
   private int emp_salary=1200;
   private String emp_dept;

   public int getemp_salary()
   {
       return emp_salary;
   }
   public void setemp_salary(int emp_salary)
   {
       this.emp_salary=emp_salary;
   }
   public void setemp_name(String emp_name )
   {
       this.emp_name=emp_name;
   }
   public String getemp_name()
   {
       return emp_name;
   }


    public static void main(String[] args) {
        asdd hide=new asdd();
        hide.emp_name="santunana";
        hide.emp_salary=120000;
        System.out.println("name of employee is"+" "+hide.getemp_name());
    }

}
