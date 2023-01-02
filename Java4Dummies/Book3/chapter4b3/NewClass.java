Ball b = new BaseBall();
public void hit(Ball b)
BaseBall b1 = new BaseBall();
hit(b1);
Ball b2 = b1;
hit(b2);
Ball b = new SoftBall();
toss((BaseBall) b); // error: b isn't a 
Ball b = new SoftBall();
SoftBall s = (SoftBall)b; // cast the Ball to a
 // SoftBall
s.riseBall();Softball
        Employee emp = new SalariedEmployee();
      Employee emp = getEmployee();

Employee emp = getEmployee();
String msg;
if (emp instanceof SalariedEmployee)
{
 msg = "The employee's salary is ";
 msg += ((SalariedEmployee) emp).getFormattedSalary();
}
else
{
 msg = "The employee's hourly rate is ";
 msg += ((HourlyEmployee) emp).getFormattedRate();
}
System.out.println(msg);
public class ProductDataException extends Exception
{
 public ProductDataException
 {
 }
 public ProductDataException(String message)
 {
 super(message);
 }
}