public abstract int hit(int batSpeed);

public abstract class Ball
{
 public abstract int hit(int batSpeed);
}

public class BaseBall extends Ball
{
 public int hit(int batSpeed)
 {
 // code that implementclass BallFactoryInstance
{
 public static Ball getBall(String t)
 {
 if (s.equalsIgnoreCase("BaseBall"))
 return new BaseBall();
 if (s.equalsIgnoreCase("SoftBall"))
 return new SoftBall();
 return null;
 }
}s the hit method goes here
 }
}

Playable game = getGame();
game.play();

public interface Dealable
{
 void deal(int cards);
}






