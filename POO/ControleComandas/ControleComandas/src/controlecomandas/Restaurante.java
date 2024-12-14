
package controlecomandas;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    private String nome;
    
    private Comanda[] mesas = new Comanda[10];
    
    private ArrayList<Produto> menu = new ArrayList<>();

    public Restaurante(String nome) {
        this.nome = nome;
        
        carregaProdutos();
    }
    
    private void carregaProdutos(){
        this.menu.add(new Porcao(350.0, 1, 12.0, "Tropeiro"));
        this.menu.add(new Porcao(500.0, 3, 15.0, "Fritas"));
        this.menu.add(new Porcao(500.0, 2, 36.0, "Filé"));
        this.menu.add(new Bebida(380.0,true, 10.0,"Bebida da massa"));
        this.menu.add(new Bebida(500.0,false, 12.0,"Suco de Laranja"));
    }
    
    public void realCadastraComanda(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do cliente:");
        String nomeCli = entrada.nextLine();
        
        System.out.println("Informe o núm de tel. do cliente:");
        String telCli = entrada.nextLine();
        
        Cliente novoCli = new Cliente(nomeCli, telCli);
        
        
        //aqui seria necessário validar o intervalo do num da mesa [1..10]
        System.out.println("Informe o número da mesa do cliente:");
        int numMesa = entrada.nextInt();
        
        Comanda novaComanda = new Comanda(numMesa, novoCli);
        
        mesas[numMesa] = novaComanda;
        
        
    }
    
    public boolean realizarPedido(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe o núm da mesa:");
        int numMesa = entrada.nextInt();
        
        //será que existe alguem ocupand. a mesa
        if(numMesa < 0 || numMesa > 9 || mesas[numMesa] == null){
            return false;
        }else{
            //imprimir o MENU
            for(int i = 0; i < this.menu.size();i++){
                System.out.println((i+1)+ " - " +  this.menu.get(i));
            }
            
            System.out.println("Informe o produto do pedido:");
            int numProduto = entrada.nextInt();
            numProduto--;
            
            this.mesas[numMesa].anotaPedido(this.menu.get(numProduto));
            
            return true;
        }
        
    }
    
    
    
}
