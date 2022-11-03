Object emp = new Employee();

Object emp = new Employee();
emp.setLastName("Smith"); // error: won't compile

if (emp2.equals(emp1))
 System.out.println("These employees are the same.");
else
 System.out.println
 ("These are different employees.");

// warning -- there are several errors in this code!
public boolean equals(Employee emp)
{
 if (this.getLastName().equals(emp.getLastName())
 && this.getFirstName().equals(emp.getFirstName()))
 return true;
 else
 return false;
}

if (this == obj)
 return true;

class Employee
{
 public Address address;
 // other fields and methods omitted
}












if (this == null)
 return false;

if (this.getClass() != obj.getClass())
 return false;

Employee emp = (Employee) obj;
return this.lastName.equals(emp.getLastName())
 && this.firstname.equals(emp.getFirstName());







