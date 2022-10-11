package snakeandladder;
//UC-3 The Player then checks for a Option. They are No Play,Ladder or Snake.
//        - Use ((RANDOM)) to check for Options
//        - In Case of No Play the player stays in the same position
//        - In Case of Ladder the player moves ahead by the number of position received in the die
//        - In Case of Snake the player moves behind by the
    import java.util.Random;
    import java.util.Scanner;
public class Checkforoption {

//            public static void main(String[] args) {
//            int pos = 0;
//            int dice = 0;
//            System.out.println("Welcome to Snake And Ladder program");
//            System.out.println("Single player at start position "+ pos);
//            dice = rollDice();
//            mapTo(dice, pos);
//        }
//        public static int rollDice(){
//            Random random = new Random();
//            int dice = random.nextInt(6);
//            dice = dice+1;
//            System.out.println("Dice Num : "+ dice);
//            return dice;
//        }
//        public static void mapTo(int dice, int pos){
//            Random random = new Random();
//            int map = random.nextInt(2);
//            map = map +1;
//            System.out.println("Maping Method : "+ map);
//
//            switch (map){
//                case 1:
//                    System.out.println("No Play You are in the same position");
//                    break;
//                case 2:
//                    pos = pos + dice;
//                    System.out.println("your position after ladder is : "+ pos);
//                    break;
//                case 3:
//                    pos = pos - dice;
//                    System.out.println("your position after snake is : "+ pos);
//                    break;
//            }
//        }
//    }

//import java.util.Scanner;

//    public class CheckOption {
        public static void main (String [] args) {
            double Random = Math.floor(Math.random()*10)%3;
            System.out.println("Check Options:" +Random);

            int Dice=(int) Math.floor(Math.random()*10)%6+1;
            int NoPlay=0;
            int ladder=1;
            int sanke=-1;
            int Stay=0;
            int Position=0;
            int MovesAhead=1;
            int MovesBehind=-1;

            double TotalMovesAhead=0;
            double TotalMovesBehind=0;

            double Check =Math.floor(Math.random()*10)%3;
            if (Check == NoPlay)
            {
                Stay=0;

            }

            //System.out.println("Stays:"  +Stay);

            else if (Check == ladder)
            {
                Position= Position+Dice;
            }
            TotalMovesAhead = MovesAhead+Random;

            System.out.println("Ladder MovesAhead:" +TotalMovesAhead );

            if (Check == sanke)
            {
                MovesBehind=-1;
            }
            TotalMovesBehind=MovesBehind+Random;

            System.out.println("Snake MovesBehind:" +TotalMovesBehind );

            //Repeat till the Player reaches the winning position 100.position 100. - Note In case the player position moves
            // below 0, then the player restarts from 0

            Scanner roll = new Scanner(System.in);
            int Roll = roll.nextInt();

            double Random1 = Math.floor(Math.random()*100)%100;

            if (Roll >0 && Roll == 100 )
            {
                System.out.println ("Repeat position above to 0:" +Random1 );
            }
            System.out.println (Roll) ;
            System.out.println();

            if (Roll <0) {

                System.out.println ("Repeat position below to 0:" +Random1 );
            }

            System.out.println (Roll );
        }
    }