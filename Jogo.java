public class Jogo{
    public static void main (String [] args) throws Exception {
        Personagem soneca = new Personagem("Soneca", 5, 5, 5);
        Personagem cacador = new Personagem("John", 10, 0, 0);
        Personagem player3 = new Personagem("Hunter", 8, 4, 3);
        while (true){
        soneca.cacar();
        soneca.cacar();
        cacador.cacar();
        player3.cacar();
        soneca.comer();
        soneca.dormir();
        player3.cacar();
        player3.comer();
        cacador.comer();
        player3.dormir();
        cacador.dormir();
        System.out.println("===================");
        Thread.sleep(5000);
        }
    }
}