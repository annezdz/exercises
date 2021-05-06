package island;

public class IslandTestDrive {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int y = 0;
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;


        islands[0] = "Bermudas";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        int ref;
        while(y < 4){
            ref = index[y];
            System.out.println("island = ");
            System.out.println(index[y]);
            y++;
        }







    }
}
