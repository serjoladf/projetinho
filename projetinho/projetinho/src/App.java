
public class App {
    public static void main(String[] args) throws Exception {
      
        // Create instances of Carro and Moto
        Carro c = new Carro();
        Moto m = new Moto();

            System.out.println("****Moto****");
        // Call methods on the Moto instance
        m.ligar();       // Turn on the motorcycle
        m.ligarFarol();       // Turn on the motorcycle
        m.desligar();    // Turn off the motorcycle

            System.out.println("****Carro****");
        // Call methods on the Carro instance
        c.ligar();              // Turn on the car
        c.ligarDesembacador();  // Turn on the defogger in the car (assuming this method exists)
        c.desligar();           // Turn off the car
        m.setCor("Vermelho");
        System.out.println("Minha moto é de cor "+m.getCor());
        m.setAno(2013);
        System.out.println(m.getAno());
    }
}