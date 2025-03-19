
package poocontador;


public class PooContador {

        private int cuenta;
        
        public PooContador(){
            this.cuenta =0;
        }
        
        public void incrementarYMostrar(){
            cuenta++;
            System.out.println("Valor actual de la cuenta: "+cuenta);
        }
    
}
