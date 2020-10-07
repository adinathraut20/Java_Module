class Checker implements Comparator<Player>{
    public int compare(Player p1,Player p2){
        // Player p1 = (Player) o1;
        // Player p2 = (Player) o2;
        if(p1.score == p2.score){
             return p1.name.compareTo(p2.name);
        }
        else{
                return -(p1.score - p2.score);
           
        }
    }
}