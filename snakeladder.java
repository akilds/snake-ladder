import java.util.*;

public class snakeladder
{
 public static void main(String[] args)
 {
  int position = 0;
  int die_count = 0;
  System.out.println("Start Position : " + position);
  Random random = new Random();
  while(position<100)
  {
   int roll = random.nextInt(5)+1;
   int check = random.nextInt(3);
   die_count++;
   switch(check)
   {
    case 0 : System.out.println("Ladder");
             position += roll;
             if(position>100)
             {
              position -= roll;
             }
             break;
    case 1 : System.out.println("Snake");
             position -= roll;
             if(position<0)
             {
               position = 0;
             }
             break;
    default : System.out.println("No Play");
   }
   System.out.println("Current position : " + position);
  }
  System.out.println("Number of times dice rolled : " + die_count);
 }
}
