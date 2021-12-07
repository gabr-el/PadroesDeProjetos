package Atividade03;

public class main {
    public static void main(String[] args) {
     foguete Foguete1 =
       new fogueteBuilder()
               .Assentos(5)
               .Modelo("Falcon")
               .Motores("6 motores ")
               .createFoguete();
        
      
        foguete Foguete2 =
        new fogueteBuilder()
              .Assentos(7)
              .Modelo("Athena")
              .Motores("8 motores")
              .createFoguete();

              System.out.println(Foguete1);
              System.out.println(Foguete2);

    }
}
