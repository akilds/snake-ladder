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
 }
}
