//  Ejercicios de estructuras de control (Tema 4)

public class Main {
    
    public static void main(String[] args) {
      
      int numeroIf = 0;
      int bucleWhile = 0;
      String estacion = "Verano";

//  Condicionales: Ejercicio con sentencia (imperativa) if
      
      if (numeroIf > 0) {
        
          System.out.println("Es positivo");
          
      } else if (numeroIf < 0) {
        
        System.out.println("Es negativo");
        
      } else {
        
        System.out.println("Es cero");
        
      }

//  Bucles: Ejercicio con sentencia while      

      while (bucleWhile < 3) {
      
        System.out.println(bucleWhile);
        bucleWhile = bucleWhile + 1;
        
      }

//  Bucles: Ejercicio con sentencia do while      

      do {
        
        System.out.println(bucleWhile);
        bucleWhile = bucleWhile + 1;
        
      } while (bucleWhile < 3);
      
//  Bucles: Ejercicio con sentencia for      

      for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
        System.out.println(numeroFor);
      }
      
//  Interruptores: ejercicio con sentencia case       

      switch(estacion){    
          
        case "Primavera":    
            System.out.println("Es Primavera");
            break;
        
        case "Verano":    
            System.out.println("Es Verano");
            break;
        
        case "Otoño":    
            System.out.println("Es Otoño");
            break;
        
        case "Invierno":    
            System.out.println("Es Invierno");
            break;
        
        default:     
            System.out.println("Es otra cosa");
    }
  
    }
}