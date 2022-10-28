
import javax.lang.model.SourceVersion;

/**
 *
 * @author magni
 */
public class BaseBall
{
 private double weight;
 protected double getWeight()
 {
 return this.weight;
 }
 protected void setWeight(double weight)
 {
 this.weight = weight;
 }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
public class BaseBall extends Ball
{
 public BaseBall()
 {
 setWeight(5.125);
 }
}