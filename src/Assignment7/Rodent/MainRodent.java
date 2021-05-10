package Assignment7.Rodent;

import Assignment7.Rodent.*;

public class MainRodent {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];

        rodents[0] = new Mouse();
        rodents[1] = new Hamster();
        rodents[2] = new Gerbil();

        for (int i = 0; i < 3; i++)
            rodents[i].describeEars();
    }
}
