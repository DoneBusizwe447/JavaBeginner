public class RandomNumber
{
 public static void main(String[] args)
 {
 int number = getRandomNumber();
 System.out.println("The number is " + number);
 }
 /*public static int getRandomNumber()
 {
 int num = (int)(Math.random() * 10) + 1;
return num;
 }
}

/*
public static int RandomNumber()
{
 int num = (int)(Math.random() * 20) + 1;
 if (num != 12)
 return num;
 else
 return 11;
}
*/


public static int getRandomNumber()
{
 int num;
 while (true)
 {
 num = (int)(Math.random() * 20) + 1;
 if (num != 12)
 return num;
 }
}
}





