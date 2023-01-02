package chapter4b3;

public class Chess extends Game
{
 public void play()
 {
 System.out.println("I give up. You win.");
 }
}

class Player
{
 public int move()
 {
 for (int i = 0; i < 9; i++)
 {
 System.out.println(
 "\nThe basic player says:");
 System.out.println(s
 "I'll take the first open square!");
 return firstOpenSquare();
 }
 return -1;
 }
 private int firstOpenSquare()
 {
 int square = 0;
 // code to find the first open square goes here
 return square;
 }
}