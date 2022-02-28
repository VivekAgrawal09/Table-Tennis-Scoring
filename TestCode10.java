package demo.test;

public class TestCode10 {

    public static void main(String[] args) {
        int min = 1;
        int max = 2;
        int player1=0,player2=0;
        boolean flag=false;
        boolean flag2=false;

        while(true)
        {
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

                switch(random_int)
                {
                    case 2:
                        player1++;
                        break;
                    case 1:
                        player2++;
                        break;
                }
                if(!flag) {
                    if (player1 == 10 && player2 == 10)
                        flag = true;
                    else if (player1 == 11 && player2 < 11 && !flag) {
                        System.out.println("Player1 WINS");
                        System.out.println("player1 Score is " + player1);
                        System.out.println("Player2 Score is " + player2);
                        break;
                    }
                    else if (player2 == 11 && player1 < 11 && !flag) {
                        System.out.println("Player2 WINS");
                        System.out.println("player1 Score is " + player1);
                        System.out.println("player2 Score is " + player2);
                        break;
                    }
                }
                else if(flag)
                {
                    if(player1 == 20 && player2 == 20)
                        flag2=true;
                    else if(player1-player2 >= 2 && !flag2) {
                        System.out.println("Player1 WINS");
                        System.out.println("player1 Score is " + player1);
                        System.out.println("Player2 Score is " + player2);
                        break;
                    }
                    else if(player2-player1 >= 2 && !flag2) {
                        System.out.println("Player2 WINS");
                        System.out.println("player1 Score is " + player1);
                        System.out.println("player2 Score is " + player2);
                        break;
                    }
                    if(flag2) {
                        if(player1-player2 >= 1) {
                            System.out.println("Player1 WINS");
                            System.out.println("player1 Score is " + player1);
                            System.out.println("Player2 Score is " + player2);
                            break;
                        }
                        else if(player2-player1 >= 1) {
                            System.out.println("Player2 WINS");
                            System.out.println("player1 Score is " + player1);
                            System.out.println("player2 Score is " + player2);
                            break;
                        }
                    }
                }

        }
    }
}
