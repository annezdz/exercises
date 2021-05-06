package dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 70;
        d.bark();

        //Cria matriz de dog
        Dog[] myDogs = new Dog[3];
        int x = 0;

        //and put some dogs in it
        while(x < myDogs.length){
            myDogs[x] = new Dog();
            x++;
        }

        //agora acessa objetos dogs usando as referências de matriz
        myDogs[0].name = "Susy";
        myDogs[1].name = "Ted";
        myDogs[1].size = 9;
        while(x < myDogs.length){
            myDogs[x].bark();
            x ++;
        }

    }
}
