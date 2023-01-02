public class ArrayList<E>
ArrayList<Employee> empList;
public boolean add(E o)
{
 // body of method omitted (thank you)
}

public Object clone()
{
 try
 {
 ArrayList<E> v = (ArrayList<E>) super.clone();
 v.elementData = (E[])new Object[size];
 System.arraycopy(elementData, 0,
 v.elementData, 0, size);
 v.modCount = 0;
 return v;
 }
 catch (CloneNotSupportedException e)
 {
 // this shouldn't happen since we're Cloneable
 throw new InternalError();
 }
}

public Object clone()
{
 try
 {
 ArrayList<E> v = (ArrayList<E>) super.clone();
 v.elementData = (E[])new Object[size];
 System.arraycopy(elementData, 0,
 v.elementData, 0, size);
 v.modCount = 0;
 return v;
 }
 catch (CloneNotSupportedException e)
 {
 // this shouldn't happen since we're Cloneable
 throw new InternalError();
 }
}

public void addItems(ArrayList<Object> list)
{
 // body of method not shown
}