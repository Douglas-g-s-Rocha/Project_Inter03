package Menu;

import java.util.Scanner;
import Operações.Pix;

public class Menu_transf {

    public String executarTransf(){

        Pix pix = new Pix();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de transferencia que você deseja fazer: \n" +
                "[ 1 ] Pix \n" +
                "[ 2 ] TED \n" +
                "[ 3 ] DOC");
        int esc = scanner.nextInt();

        switch (esc){
            case 1:
                pix.execultarPix();
                break;

            case 2:

                break;

            case 3:

                break;
        }



        return null;
    }

}
