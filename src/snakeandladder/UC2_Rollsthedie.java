package snakeandladder;
    import java.util.Random;
public class UC2_Rollsthedie {

        public static void main(String[] args) {
            int pos = 0;
            System.out.println("Welcome to Snake And Ladder program");
            System.out.println("Single player at start position "+ pos);
            RollDice();
        }
        public static void RollDice(){
            Random random = new Random();
            int dice = random.nextInt(6);
            dice = dice+1;
            System.out.println("Dice Num : "+ dice);

        }
    }

