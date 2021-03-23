import java.util.*;

public class snakeladder
{
 static int die_roll(int pos,int playr)
 {
  int position = pos;
  int player = playr;
  Random rand = new Random();
  int roll = rand.nextInt(5)+1;
  int check = rand.nextInt(3);
   switch(check)
   {
    case 0 : System.out.println("Ladder for player" + player);
             position += roll;
             if(position>100)
             {
              position -= roll;
             }
             System.out.println("Current position : " + position);
             position = die_roll(position,player);
             return position;
    case 1 : System.out.println("Snake for player" + player);
             position -= roll;
             if(position<0)
             {
               position = 0;
             }
             System.out.println("Current position : " + position);
             return position;
    default : System.out.println("No Play for player" + player);
              System.out.println("Current position : " + position);
              return position;
   }
 }
 public static void main(String[] args)
 {
  int position_player1 = 0, position_player2 = 0;
  Random random = new Random();
  while(position_player1<100 && position_player2<100)
  {
   int roll_player1 = random.nextInt(5)+1;
   int check_player1 = random.nextInt(3);
   switch(check_player1)
   {
    case 0 : System.out.println("Ladder for player1");
             position_player1 += roll_player1;
             if(position_player1>100)
             {
              position_player1 -= roll_player1;
             }
             position_player1 = die_roll(position_player1,1);
             break;
    case 1 : System.out.println("Snake for player1");
             position_player1 -= roll_player1;
             if(position_player1<0)
             {
               position_player1 = 0;
             }
             break;
    default : System.out.println("No Play for player1");
   }
   int roll_player2 = random.nextInt(5)+1;
   int check_player2 = random.nextInt(3);
   switch(check_player2)
   {
    case 0 : System.out.println("Ladder for player2");
             position_player2 += roll_player2;
             if(position_player2>100)
             {
              position_player2 -= roll_player2;
             }
             position_player2 = die_roll(position_player2,2);
             break;
    case 1 : System.out.println("Snake for player2");
             position_player2 -= roll_player2;
             if(position_player2<0)
             {
               position_player2 = 0;
             }
             break;
    default : System.out.println("No Play for player2");
   }
  }
  if(position_player1==100)
  {
   System.out.println("Player1 Wins");
  }
  else
  {
   System.out.println("Player2 Wins");
  }
 }
}
