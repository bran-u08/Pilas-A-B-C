/*
Solorzano Trejo Brandon Uriel
3S11
Pila A + B = C
 */
package pilatress;

import java.util.Random;

public class pila {
int pila[] = new int[100];
int cima = 0;
int pi1, pi2, pi3;  
    
        public pila(int tamaño){
        pila = new int[tamaño];
        cima=0;
        }
    
      //Metodo insertar
      public void  llenar(){
      Random numaleatorio = new Random();
      pi1 = 1 + numaleatorio.nextInt(100);
      pila[cima]=pi1;
      pi1++;
      cima++;
      
      pi2 = 101 + numaleatorio.nextInt(200);
      pila[cima]=pi2;
      pi2++;
      cima++;
     }
    
        public void mostrar(){
        for(int i=cima-1; i>=0; i--){
        System.out.print("\n El numero de la pila: "+pila[i]);
     
        }
        }
        
        public void Eliminar(){
        cima--;
        System.out.println("Datos eliminado");
        }
    
        public boolean vacio(){
        if (cima==0){
        System.out.println("La pila esta vacia?");
        return true;
        }else{
        return false;
        }
        }
        
        public int Tamaño(){
        return pila.length ;
        }

        public void  SumarAyB(){
        pi3= pi1 + pi2;
        System.out.println("Resultado de la pila C es:\n"+pi3);
        }
}
                
            
        
    


