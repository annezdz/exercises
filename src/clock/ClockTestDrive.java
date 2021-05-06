package clock;

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("28/07/1985");
        String tod = c.getTime();
        System.out.println(tod);
    }
}
