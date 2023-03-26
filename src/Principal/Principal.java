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
        System.out.println("-------------------------------------Orden de precio de mayor a menor----------------------------");
        //lista.mostrarOrdenPrecio();
        System.out.println("-------------------------------------Descuento--------------------------------");
        lista.descuento("Cuerda", 0.5);
        System.out.println("-------------------------------------Buscar por nombre--------------------------");      
        
        System.out.println("-------------------------------------Lista por tipo--------------------------");
        //lista.tipo("Cuerda");
        //System.out.println(lista.ubicarNodo(3));
        
        System.out.println("-----------eliminarInicio---------");
//        lista.eliminarInicio();
//        lista.mostrar();
        
        lista.mostrar();
        
    }
    
}
