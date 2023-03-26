package Principal;

public class Principal {

    public static void main(String[] args) {
        
        listaIM lista=new listaIM();
        
        lista.agregar(new IM("Viola","Cuerda",150000));
        lista.agregar(new IM("Fagot","Viento",740000));
        lista.agregar(new IM("Bombo","Percusion",187000));
        lista.agregar(new IM("Guitarra","Cuerda",256000));
        lista.agregar(new IM("Bajo","Cuerda",94000));
        
        lista.mostrar();
        
        System.out.println("-------------------------------------Orden alfabetico descendente--------------------------------"); 
        lista.mostrarOrdenAlfabetico();
        System.out.println("-------------------------------------Orden alfabetico Ascendente--------------------------------");
        lista.mostrarOdenAlfabeticoAsce();
        System.out.println("-----------------------------------Agregar Inicio--------------------");
        lista.agregarInicio(new IM("Flauta","Viento",89000));
        System.out.println("-----------------------------------Agregar Final-------------------------------");
        lista.agregarFinal(new IM("Maraca","Percusion",25000));
        System.out.println("-------------------------------------Orden de precio de mayor a menor----------------------------");
        
        System.out.println("-------------------------------------Descuento--------------------------------");
        lista.descuento("Cuerda", 0.5);
        System.out.println("-------------------------------------Buscar por nombre--------------------------");
        lista.buscar("Bombo");
        
        System.out.println("-----------------------------------------Eliminar inicio-----------------------------");
        lista.eliminarInicio();
        System.out.println("-----------------------------------------Eliminar Final-------------------------------");
        lista.eliminarFinal();
        System.out.println("-----------------------------------------Eliminar------------------------------------");
        //lista.eliminar(0);
        
       

    }
    
}
