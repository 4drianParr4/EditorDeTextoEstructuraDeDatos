import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<EditorObj> Edit = new Stack<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("EDITOR DE TEXTO");
            System.out.println("Que desesa realizar?");
            System.out.println("1) Ingresar un texto ");
            System.out.println("2) Deshacer cambio ");
            System.out.println("3) Mostrar ultimo texto ");
            System.out.println("4) Mostrar historial de cambios ");
            System.out.println("5) Salir");
            int opt = sc.nextInt();
            sc.nextLine();

        switch (opt) {
            case 1:
                Edit = m.RegistrarTextoNuevo();
                break;
            case 2:
                Edit = m.DeshacerCambio(Edit, sc);
                break;
            case 3:
                m.ConsultarUltimoTexto(Edit, sc);
                break;
            case 4:
                m.MostrarTextos(Edit);
                break;
            case 5:
                System.out.println("Vuelva pronto!!");
                continuar = false;
                break;
        
            default:
                System.out.println("Opcion inavlida, seleccione de nuevo");
                break;
        }
        }
    }
}
