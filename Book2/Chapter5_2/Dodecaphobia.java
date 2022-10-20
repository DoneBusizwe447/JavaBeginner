public class Dodecaphobia
{
 /*public static void main(String[] args)
 {
 int number = 2;
 while (number <= 20)
 {
 if (number == 12)
 break;
 System.out.print(number + "        ");
 number += 2;
 }
 System.out.println();
 }
}*/



/*public class Dodecaphobia
{
 public static void main(String[] args)
 {
 int number = 2;
 while (true)
 {
 System.out.print(number + " ");
 number += 2;
 }
 }
}*/

public static void main(String[] args)
 {
 int number = 0;
 while (number < 20)
 {
 number += 2;
 if (number == 12)
 continue;
 System.out.print(number + " ");
 }
 System.out.println();
 }
}