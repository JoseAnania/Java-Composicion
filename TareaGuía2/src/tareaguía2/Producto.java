
package tareaguía2;

public class Producto {
    
    private String descripcion;
    private Material[]materiales;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(String descripcion, int cantMateriales) {
        this.descripcion = descripcion;
        this.materiales = new Material[cantMateriales];
    }
    
    public void agregarMaterial(Material nuevoMaterial)
    {
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]==null)
            {
                materiales[i]=nuevoMaterial;
                break;
            }
        }
    }
    
    public float costoTotal()
    {
        float costo=0;
        
        for (int i = 0; i < materiales.length; i++) {
            
            costo+=materiales[i].getValor();
            
        }
        return costo;
    }
    
    public boolean contieneMaterial(int codigo)
    {
        boolean contiene=false;
        
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i].getCodigo()==codigo)
            {
                contiene=true;
            }
        }
        return contiene;
    }
    
    public String materialesMenores(float valor)
    {
        String material="\n";
        
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i].getValor()>valor)
            {
                material+=materiales[i].getDescripcion()+"\n";
            }
            
        }
        return material;
    }
    
    public int cantidadMateriales(float precioMin, float precioMax)
    {
        int contMaterial=0;
        
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i].getValor()>precioMin && materiales[i].getValor()<=precioMax)
            {
                contMaterial++;
            }
            
        }
        return contMaterial;
    }
}
