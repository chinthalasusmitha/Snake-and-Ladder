package snakeandladder;
    import java.util.Random;
public class UC3_Checkforoption {

            public static void main(String[] args) {
            int pos = 0;
            int dice = 0;
            System.out.println("Welcome to Snake And Ladder program");
            System.out.println("Single player at start position "+ pos);
            dice = rollDice();
            mapTo(dice, pos);
        }
        public static int rollDice(){
            Random random = new Random();
            int dice = random.nextInt(6);
            dice = dice+1;
            System.out.println("Dice Num : "+ dice);
            return dice;
        }
        public static void mapTo(int dice, int pos){
            Random random = new Random();
            int map = random.nextInt(2);
            map = map +1;
            System.out.println("Maping Method : "+ map);

            switch (map){
                case 1:
                    System.out.println("No Play You are in the same position");
                    break;
                case 2:
                    pos = pos + dice;
                    System.out.println("your position after ladder is : "+ pos);
                    break;
                case 3:
                    pos = pos - dice;
                    System.out.println("your position after snake is : "+ pos);
                    break;
            }
        }
    }
