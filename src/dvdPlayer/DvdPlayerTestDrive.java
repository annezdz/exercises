package dvdPlayer;

public class DvdPlayerTestDrive {
    public static void main(String[] args) {
        DvdPlayer d = new DvdPlayer();
        d.canRecord = true;
        d.playDvd();

        if(d.canRecord == true){
            d.recordDvd();
        }
    }
}
