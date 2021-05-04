package movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Tarzan";
        one.genre = "Infantil";
        one.rating = 10;
        Movie two = new Movie();
        two.title = "Avatar";
        two.genre = "Ação";
        two.rating = 9;
        two.playIt();
    }
}
