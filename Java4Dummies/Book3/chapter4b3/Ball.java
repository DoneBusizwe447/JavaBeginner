public class Ball
{
 public void hit()
 {
 System.out.println("You hit it a mile!");
 }
}
class BaseBall extends Ball
{
 public void hit()
 {
 System.out.println("You tore the cover off!");
 super.hit();
 }


public class Ball
{
 private int velocity;
 public void setVelocity(int velocity)
 {
 this.velocity = velocity;
 }
}

public class Ball
{
 public Ball()
 {
 System.out.println(
 "Hello from the Ball constructor");
 }
}
public class BaseBall extends Ball
{
 public BaseBall()
 {
 System.out.println(
 "Hello from the BaseBall constructor");
 }
}