public class Personagem{

    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem(String nome, int energia, int fome, int sono){
        this(energia, fome, sono);
        this.nome = nome;
        
    }

    public Personagem(int energia, int fome, int sono){
        if(energia >= 0 && energia <= 10)
        this.energia = energia;
        if(fome >= 0 && fome <= 10)
        this.fome = fome;
        if(sono <= 0 && sono <= 10)
        this.sono = sono;
    }

    public void cacar(){
        if(energia>=2){
            System.out.printf("%s cacando \n", nome);
            energia -= 2;
        }
        else{
            System.out.printf("%s sem energia para cacar \n", nome);
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        exibir();
    }

    public void comer(){
        if (fome >= 1){
            System.out.printf("%s comendo \n", nome);
            energia = Math.min(energia + 1, 10);
            fome -= 1;
        }
        else {
            System.out.printf("%s sem fome \n", nome);
        }
        exibir();
    }

    public void dormir(){
        if (sono >= 1){
        System.out.printf("%s dormindo \n", nome);
        sono--;
        energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else {
            System.out.printf("%s sem sono \n", nome);
        }
        exibir();
    }

    public void exibir(){
        System.out.println("Personagem: "+ nome+"\nEnergia: " + energia + "\tFome:  " + fome + "\tSono: " + sono);
    }

}