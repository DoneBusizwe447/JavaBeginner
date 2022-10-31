public interface ThrowableBall
{
 void throwBall();
 void catchBall();
}
public interface KickableBall
{
 void kickBall();
 void catchBall();
}
public interface PlayableBall
 extends ThrowableBall, KickableBall
{
 void dropBall();
}