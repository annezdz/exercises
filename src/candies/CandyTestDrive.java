package candies;

public class CandyTestDrive {
    public static void main(String[] args) {
        Candy[] candies = new Candy[4];
        candies[0] = new Candy();
        candies[1] = new Candy();
        candies[2] = new Candy();
        candies[3] = new Candy();
        candies[0].tipo = "Pirulito";
        candies[1].tipo = "Bala";
        candies[2].tipo = "Marshmallow";
        candies[3].tipo = "Pipoca Doce";
        candies[0].sabor = "Morango";
        candies[1].sabor = "Tuti Fruti";
        candies[2].sabor = "Framboesa";
        candies[3].sabor = "Abacaxi";
        int x = 0;
        while(x < candies.length){
            System.out.println("O doce é " + candies[x].tipo + " e o sabor é " + candies[x].sabor);
            x++;
        }












    }
}
