public class EditorObj {
    private String TextoAnterior;
    private String TextoNuevo;
    private String Fecha;
    private String Usuario;

    public EditorObj(String textoAnterior, String textoNuevo, String fecha, String usuario) {
        TextoAnterior = textoAnterior;
        TextoNuevo = textoNuevo;
        Fecha = fecha;
        Usuario = usuario;
    }

    public String getTextoAnterior() {
        return TextoAnterior;
    }

    public void setTextoAnterior(String textoAnterior) {
        TextoAnterior = textoAnterior;
    }

    public String getTextoNuevo() {
        return TextoNuevo;
    }

    public void setTextoNuevo(String textoNuevo) {
        TextoNuevo = textoNuevo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    
    
}