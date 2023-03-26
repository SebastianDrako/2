package Principal;

public class listaIM {
    DobleNodo inicio;
    DobleNodo fin;
    int tamano;
    
    public listaIM(){
        this.inicio = null;
        this.fin = null;
        this.tamano = 0;
    }
    
    public boolean listaVacia(){
        return this.inicio == null;
    }
    
    public void mostrar(){
        DobleNodo Aux=null;
        String datos="";
        if (listaVacia()){
            this.inicio = Aux;
            this.fin = Aux;
        }else{
            Aux=this.inicio;   
            while(Aux!=null){
                datos+="["+Aux.getDato()+']';
                Aux=Aux.getNodoSiguiente();   
            }          
        }
        System.out.println(datos); 
    }
    
    public void agregar(IM dato){
        DobleNodo Aux=new DobleNodo(dato);
        
        if (listaVacia()){
            this.inicio=Aux;
            this.fin=Aux;
        }else{
            this.fin.setNodoSiguiente(Aux);
            this.fin=Aux;
        }
        this.tamano ++;
    }

    

//Metodos propios del taller
    
    
    
    public void mostrarOrdenAlfabetico(){ 
        
        if(listaVacia()){
            System.out.println("La lista está vacia");
        }else{
            // Definimos las array para simular un maping
            double keys[] = new double[this.size()];
            IM objetos[] = new IM[this.size()];
            
            //iniciamos las variables necesarias para recorrer la lista
            DobleNodo Aux=this.inicio;
            int counter = 0;
            
            //recorremos la lista , por cada nodo extraemos nombre y numero
            while(Aux!=null){
            
                keys[counter] = this.autoid(Aux.getDato().getNombre());
                objetos[counter] = Aux.getDato();
                
                Aux=Aux.getNodoSiguiente();
            
                counter ++;
            
            }
           
            // Clonamos la lista con las llaves para organizarla
            double sorting[] = keys.clone();
            
            //organizamos la lista sorting
            for (int i = 0; i < sorting.length; i++){  
                for (int j = i + 1; j < sorting.length; j++){
                    double tmp = 0;  
                    if (sorting[i] > sorting[j]){
                        tmp = sorting[i];
                        sorting[i] = sorting[j];
                        sorting[j] = tmp;}}}
           
            
            // Por cada uno de los valores de la lista ordenada
            for (int i = 0; i < sorting.length; i++) {
                int index = 0;
            // Busca el indice del valor en la lista de llaves
                for(int ii = 0; ii < keys.length; ii++) {
                    if(keys[ii] == sorting[i]) {
                        index = ii;
                    break;}}

            // Encuentra el valor en la lista de objetos y lo imprime
            System.out.println(objetos[index].toString());
                                                        }
            
            }
            
            
        }
    
    public void mostrarOdenAlfabeticoAsce(){
        if(listaVacia()){
            System.out.println("La lista está vacia");
        }else{
            // Definimos las array para simular un maping
            double keys[] = new double[this.size()];
            IM objetos[] = new IM[this.size()];
            
            //iniciamos las variables necesarias para recorrer la lista
            DobleNodo Aux=this.inicio;
            int counter = 0;
            
            //recorremos la lista , por cada nodo extraemos nombre y numero
            while(Aux!=null){
            
                keys[counter] = this.autoid(Aux.getDato().getNombre());
                objetos[counter] = Aux.getDato();
                
                Aux=Aux.getNodoSiguiente();
            
                counter ++;
            
            }
           
            // Clonamos la lista con las llaves para organizarla
            double sorting[] = keys.clone();
            
            //organizamos la lista sorting
            for (int i = 0; i < sorting.length; i++){  
                for (int j = i + 1; j < sorting.length; j++){
                    double tmp = 0;  
                    if (sorting[i] < sorting[j]){
                        tmp = sorting[i];
                        sorting[i] = sorting[j];
                        sorting[j] = tmp;}}}
           
            
            // Por cada uno de los valores de la lista ordenada
            for (int i = 0; i < sorting.length; i++) {
                int index = 0;
            // Busca el indice del valor en la lista de llaves
                for(int ii = 0; ii < keys.length; ii++) {
                    if(keys[ii] == sorting[i]) {
                        index = ii;
                    break;}}

            // Encuentra el valor en la lista de objetos y lo imprime
            System.out.println(objetos[index].toString());
            }
        }     
    }
    
    public void mostrarOrdenPrecio(){
        listaIM listaAux=new listaIM();
        DobleNodo Aux=this.inicio;
        
        while(Aux!=null){
            if(Aux.getDato().getPrecio()<Aux.getNodoSiguiente().getDato().getPrecio()){   
                listaAux.agregar(Aux.getNodoSiguiente().getDato());
            }
            Aux=Aux.getNodoSiguiente();
        }
        listaAux.mostrar();
    }
    
    
    public void agregarInicio(IM dato){
        DobleNodo Aux = new DobleNodo(dato);
        if (listaVacia()){
            this.inicio = Aux;
            this.fin = Aux;
        }else{
            Aux.setNodoSiguiente(this.inicio);
            this.inicio.setNodoAnterior(Aux);
            this.inicio=Aux;         
        }
        this.tamano ++;
    }
    
    public void agregarFinal(IM dato){
        DobleNodo aux=new DobleNodo(dato);
        if (listaVacia()){
            this.inicio=aux;
            this.fin=aux;
        }else{
            aux.setNodoAnterior(this.fin);
            this.fin.setNodoSiguiente(aux);
            this.fin=aux;
        }
    }
    
    public void agregarPosicion(IM dato,int index){
        DobleNodo Aux = new DobleNodo(dato);
        DobleNodo Aux2=this.inicio;
        if (listaVacia()){
            this.inicio = Aux;
            this.fin = Aux;
        }else{
            for(int i=0;i<this.size();i++){
                if(i=index)){
                    Aux.setNodoSiguiente(Aux);
                    Aux.getNodoSiguiente().setNodoAnterior(Aux);
                    Aux.setNodoAnterior(Aux);
                    Aux.getNodoAnterior().setNodoSiguiente(Aux);
                }
            Aux2=Aux.getNodoSiguiente();
        }
                     
        }
        this.tamano ++;
    }
    
    public void encontrarNodo(int index){
        DobleNodo Aux=this.inicio;
        int cont=0;
        while(cont!=index){
            Aux=Aux.getNodoSiguiente();
            cont++;
        }
    }
    
    public void descuento(String entrada,double descuento){
        DobleNodo Aux=this.inicio;
        String tipo="";
        if (listaVacia()){
            this.inicio=Aux;
            this.fin=Aux;
        }else{
            while(Aux!=null){
                tipo=Aux.getDato().getTipo();
                if(entrada.equals(tipo)){
                    Aux.getDato().setPrecio(Aux.getDato().getPrecio()*descuento);
                }
                Aux=Aux.getNodoSiguiente();
            }
        }this.mostrar();
    }
    
    public int size(){
        return this.tamano;
    }

    
    public double autoid (String evstring){
    
        byte[] evaluating = evstring.toLowerCase().getBytes();
        
        int maxleng = 8;
        
        double sum = 0;
        
        for(int i=0;i < evstring.length();i+=1){
            sum += evaluating[i]* Math.pow(10 , (maxleng-i)) ;
        }
        System.out.println(sum);
        return sum;
    }
    
    public int ordenarNumeros(){
        DobleNodo Aux=this.inicio;
        DobleNodo Aux2=Aux.getNodoSiguiente();
        int num=0;
        for (int i=0;i<this.size();i++){
            if (this.autoid(Aux.getDato().getNombre())<this.autoid(Aux2.getDato().getNombre())){
                Aux.setNodoSiguiente(Aux);
                Aux2.getNodoSiguiente().setNodoAnterior(Aux2);
                this.inicio=Aux2;
            }
            Aux=Aux.getNodoAnterior();
        }
        
        return num;
    }
    
    
    public listaIM listaPorTipo(String tipo){
    
        DobleNodo Aux=this.inicio;
        listaIM datos = new listaIM();
        if(!this.listaVacia()){
        
        while(Aux!=null){
            
                String evalTipo = Aux.getDato().getTipo();
                if (evalTipo == tipo){ datos.agregar(Aux.getDato()); }
                Aux=Aux.getNodoSiguiente();
            
            }   
            
        }
        return datos;
        
    }
    
    
    public void buscar(String entrada){
        DobleNodo Aux=this.inicio;
        IM Aux2=null;
        while(Aux!=null){
            if((entrada.equals(Aux.getDato().getNombre()))){
                Aux2=Aux.getDato();
            }
            Aux=Aux.getNodoSiguiente();     
        }
        System.out.println(Aux2);
    }
    
    
    
    public void eliminarInicio(){
        DobleNodo Aux=this.inicio;
        if(listaVacia()){
            System.out.println("Lista Vacia");
        }else{
            this.inicio=Aux.getNodoSiguiente();
        }
        this.mostrar();
        this.tamano--;
    }
    
    public void eliminarFinal(){
        DobleNodo Aux=this.fin;
        if(listaVacia()){
            System.out.println("Lista Vacia");
        }else{
            Aux.getNodoAnterior().setNodoSiguiente(null);
            this.fin=Aux.getNodoAnterior();
        }
        this.mostrar();
        this.tamano--;
        
    }
    
    
    
    public void eliminar(int index){
 
    }
    
    
    //Implementación matematica que nos permita que mientras mas grande el número su indexación sea menor
    
    
    @Override
    public String toString() {
        return "[" + inicio + "," + fin + ']';
    }

}

