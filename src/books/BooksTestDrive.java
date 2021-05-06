package books;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "A volta dos que não foram";
        myBooks[0].author = "Annie with and E";
        myBooks[1].title = "Minha biblioteca de dinossauros";
        myBooks[1].author = "TodoLivro";
        myBooks[2].title = "Chapeuzinho Vermelho";
        myBooks[2].author = "Irmãos Grimm";
        while (x < 3){
            System.out.println(myBooks[x].title);
            System.out.println(" by ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}
