package uni.aed.maxmin;

import uni.aed.model.Persona;

public class MaxMinObjectMain {
    public static void main(String[] args){
        MaxMinObjectMain maxMinObjectMain=new MaxMinObjectMain();
        maxMinObjectMain.testMaxMinInteger();  
        maxMinObjectMain.testMaxMinString();
        maxMinObjectMain.testMaxMinPersona();
    }
    private void testMaxMinInteger(){
        MaxMinObject mm=new MaxMinObject();
        //Tipo de datos simple o primitivo
        Object X[]={15,1,25,60,69,86,3,78,2,10};
        //visualizando el arreglo
        System.out.println("El contenido del arreglo es:");
        for(Object x:X)
            System.out.print(x.toString()+",");
        System.out.println("");
        //Determinando el maximo y minimo del Array
        System.out.println("El maximo valor es:"+ mm.getMaxValor(X,null));
        System.out.println("El minimo valor es:"+ mm.getMinValor(X,null));        
    }
    private void testMaxMinString(){
        MaxMinObject mm=new MaxMinObject();
        //Tipo de datos simple o primitivo
        Object X[]={"Jose","Juan","Ana","Salome","Beatriz","Mario","Ronald","Rita","Michael","Donald"};
        //visualizando el arreglo
        System.out.println("El contenido del arreglo es:");
        for(Object x:X)
            System.out.print(x.toString()+",");
        System.out.println("");
        //Determinando el maximo y minimo del Array
        System.out.println("El maximo valor es:"+ mm.getMaxValor(X,null));
        System.out.println("El minimo valor es:"+ mm.getMinValor(X,null));


        /* funciona
        Integer[] Y = {1,2,3,45,6,7};
        System.out.println(mm.getMaxValor(Y, null));
        System.out.println(mm.getMinValor(Y, null));
         */
    }
    private void testMaxMinPersona(){
        MaxMinObject mm = new MaxMinObject();

        // Datos tipo Persona
        Persona[] X = new Persona[10];
        X[0] = new Persona("Jose", 30, 'M');
        X[1] = new Persona("Juan", 25, 'M');
        X[2] = new Persona("Ana", 22, 'F');
        X[3] = new Persona("Salome", 28, 'F');
        X[4] = new Persona("Beatriz", 35, 'F');
        X[5] = new Persona("Mario", 27, 'M');
        X[6] = new Persona("Ronald", 33, 'M');
        X[7] = new Persona("Rita", 24, 'F');
        X[8] = new Persona("Michael", 29, 'M');
        X[9] = new Persona("Donald", 40, 'M');

        // Visualizacion del array
        System.out.println("El contenido del arreglo es:");
        for(Persona p: X) {
            System.out.print(p + "; ");
        }
        System.out.println();

        // Determinando max y min del array
        System.out.println("Por nombre:");
        System.out.println("El maximo valor es: "+ mm.getMaxValor(X,null));
        System.out.println("El minimo valor es: "+ mm.getMinValor(X,null));
        System.out.println("Por edad:");
        System.out.println("El maximo valor es: "+ mm.getMaxValor(X, Persona.POR_EDAD));
        System.out.println("El minimo valor es: "+ mm.getMinValor(X,Persona.POR_EDAD));
    }
}
