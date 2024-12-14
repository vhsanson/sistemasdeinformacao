
package controlecomandas;

import java.util.ArrayList;
import java.util.Scanner;


public class ControleComandas {
    //int - Integer
    //double - Double
    //boolean - Boolean
    //long - Long
    //String

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Restaurante restAvenida = new Restaurante("marisa sunset");
        
        while(true){
            System.out.println("1 - Cadastrar Comanda\n"
                    + "2 - realizar pedido\n"
                    + "3 - fechar comanda\n"
                    + "4 - encerrar o dia\n\n");
            
            int opcao = entrada.nextInt();
            
            switch(opcao){
                case 1: restAvenida.realCadastraComanda();break;
                case 2: restAvenida.realizarPedido(); break;
                case 3: //restAvenida.fecharComanda(); break
                case 4: return;
            }
        }
        
        
        //restAvenida.realCadastraComanda();
        
        
        
        
        
        //simulando o gar. atendendo 10 pedidos
        /*for(int i = 0; i < 10;i++){
            restAvenida.realizarPedido();
        }*/
        
        
                
    }
    
}
