import java.util.*;

// Write your Checker class here
class Checker implements Comparator{
    public int compare(Object l1,Object l2){
        Player o1 = (Player)l1;
        Player o2 = (Player)l2;
        int s1 = o1.score;
        int s2 = o2.score;
        if(s1==s2){

            return o1.name.compareTo(o2.name);
        }
        else if(s1>s2){
            return -1;
        }
        else{
            return 1;
        }

    }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
