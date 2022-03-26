
package tareaguía2;

public class Material {
    
    private String descripcion;
    private int codigo;
    private float valor;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Material(String descripcion, int codigo, float valor) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valor = valor;
    }
    
}
