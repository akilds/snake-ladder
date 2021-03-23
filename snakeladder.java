import java.util.*;

public class snakeladder
{
 public static void main(String[] args)
 {
  int position = 0;
  System.out.println("Start Position : " + position);
  Random random = new Random();
  int roll = random.nextInt(5)+1;
  System.out.println("Number on the Die : " + roll);
  int check = random.nextInt(3);
  switch(check)
  {
   case 0 : System.out.println("Ladder");
            position += roll;
            break;
   case 1 : System.out.println("Snake");
            position -= roll;
            break;
   default : System.out.println("No Play");
  }
  System.out.println("Current position : " + position);
 }
}
