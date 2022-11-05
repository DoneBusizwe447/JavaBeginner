package chapter6b3;

class Employee implements Cloneable
{
 // Fields and methods omitted...
 @Override
 public Object clone() throws CloneNotSupportedException
 {
 Employee emp;
 try
 {
emp = (Employee) super.clone();
 }
 catch (CloneNotSupportedException e)
 {
 return null; // will never happen
 }
 return emp;
 }
}