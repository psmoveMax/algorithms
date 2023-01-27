public class Doka3 {
    static class Player {
        int rating;
        String nickName;
        public Player(int rating, String nickName) {
            this.rating = rating;
            this.nickName = nickName;
        }
    }

    static Player ratings[] = new Player[] {
            new Player(1100, "Crowbar Freeman"),
            new Player(1200, "London Mollarik"),
            new  Player(1600, "Raziel of Kain"),
             new Player(1600, "Gwinter of Rivia"),
            new Player(1600, "Slayer of Fate"),
             new Player(3000, "Jon Know"),
             new Player(4000, "Caius Cosades")
    };

    public static int findSpot(Player[] array, Player newPlayer) {
        int left = 0;
        int right = array.length;

        while(left < right) {
            int middle =  (left+right)/2;
            if(array[middle].rating <newPlayer.rating) {
                left = middle +1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int spot = findSpot(ratings, new Player(1600, "Mi3ke"));
        System.out.println(spot);
    }
}
