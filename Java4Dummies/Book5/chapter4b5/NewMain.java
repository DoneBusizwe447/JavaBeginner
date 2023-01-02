public static void main(String[] args)
{
 System.out.println("Launching JavaFX");
 launch(args);
 System.out.println("Finished");
}
public void buttonClick()
{
 if (btn.getText() == "Click me please!")
 {
 btn.setText("You clicked me!");
 }
 else
 {
 btn.setText("Click me please!");
 }
}
