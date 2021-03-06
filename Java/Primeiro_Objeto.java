package aulaobjeto; 
public class AulaObjeto 
{
    public static void main(String[] args)
    {
        Caneta c1 = new Caneta();
        c1.cor = "vermelha";
        c1.carga = 100;
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.modelo = "AK-47";
        c1.status();
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
}

public class Caneta 
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status()
    {
        System.out.print("Uma caneta de cor "+this.cor);
        System.out.print(", que está com "+this.carga+"% de carga");
        System.out.print(", do modelo "+this.modelo);
        if (tampada == true)
            System.out.println(", e está tampada");
        else
            System.out.println(", e está destampada");            
    }
    
    void rabiscar()
    {
        if ( tampada == true )
            System.out.println("Destampe a caneta para escrever");
        else
        {
            System.out.println("\nEscreveu: 'Hello, world'\n");
            this.carga = this.carga - 1;
        }
    }
    void tampar()
    {
        if (tampada == true )
            System.out.println("A caneta já está tampada");
        else
        {
            tampada = true;
            System.out.println("A caneta foi tampada");
        }
    }
    void destampar()
    {
        if (tampada == false)
            System.out.println("A caneta já está destampada");
        else
        {
            tampada = false;
            System.out.println("A caneta foi destampada");
        }       
    }
}
