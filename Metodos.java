import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public Stack<EditorObj> RegistrarTextoNuevo(){
        Stack<EditorObj> Edit = new Stack<>();
        boolean continuar = true;
        while (continuar) {
            String TextoAnterior = "";
            String TextoNuevo = "";
            String Fecha = "";
            String Usuario = "";
            System.out.println("Ingrese el texto: ");
            TextoNuevo = sc.nextLine();
            System.out.println("Ingresa la fecha: (dd/mm/aaaa)");
            Fecha = sc.nextLine();
            System.out.println("Ingrese el usuario: ");
            Usuario = sc.nextLine();
            EditorObj o = new EditorObj(TextoAnterior, TextoNuevo, Fecha, Usuario);
            Edit.push(o);

            System.out.println("Desea registrar otro texto? (s/n)");
            String opt = sc.nextLine();
            if (opt.equalsIgnoreCase("n")) {
                continuar = false;
            } 
            System.out.println();
        }
        return Edit;
    }

    public Stack<EditorObj> DeshacerCambio(Stack<EditorObj> Edit, Scanner sc) {

    if (!Edit.isEmpty()) {

        EditorObj eliminado = Edit.pop();

        // Verificamos que haya quedado otro registro
        if (!Edit.isEmpty()) {
         // Obtenemos el registro que quedó de último
            EditorObj actual = Edit.peek();
            // TextoNuevo del eliminado -> TextoAnterior del que quedó
            actual.setTextoAnterior(eliminado.getTextoNuevo());
        }

        System.out.println("Cambio exitoso");

    } else {
        System.out.println("No hay textos disponibles");
    }

    System.out.println("--------------------------------");
    return Edit;
}

    public Stack<EditorObj> ConsultarUltimoTexto(Stack<EditorObj> Edit, Scanner sc){
        if (!Edit.isEmpty()) {
            EditorObj o = Edit.peek();
            System.out.println("Ultimo texto registrado: ");
            System.out.println("Texto: " + o.getTextoNuevo());
            System.out.println("Fecha: " + o.getFecha());
            System.out.println("Usuario: " + o.getUsuario());
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("No hay textos disponibles");
        }
        return Edit;
    }

    public void MostrarTextos(Stack<EditorObj> Edit){
        System.out.println("Historial de cambios");
        System.out.println();
        for (EditorObj o : Edit) {
            System.out.println("Usuario: " + o.getUsuario());
            System.out.println("Fecha: " + o.getFecha());
            System.out.println("Texto anterior: " + o.getTextoAnterior());
            System.out.println("Texto nuevo: " + o.getTextoNuevo());
            System.out.println("--------------------------------------------------");
        }
    }

}
