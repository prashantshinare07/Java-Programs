import java.io.*;

class Employee
{
  int E_id;
  String name;
  float sal;
  
  public static void main(String[] args)
  throws IOException
  {
      BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
      
      Employee emp=new Employee();
      System.out.println("Enter employee id:");
      emp.E_id=Integer.parseInt (br.readLine());
      
      System.out.println("Enter employee name:");
      emp.name=br.readLine();
      
      System.out.println("Enter employee salary:");
      emp.sal=Float.parseFloat (br.readLine());
      
      System.out.println("Enter employee id:"+emp.E_id);
      System.out.println("Enter employee name:"+emp.name);
      System.out.println("Enter employee salary:"+emp.sal);
      
  }
  
}
