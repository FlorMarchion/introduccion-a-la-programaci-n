
public class EstructuraSwitch {
    public static void main(String[] args) {
        // path ---> direccion de directorio
        char nota = '7';
        switch (nota) {
            case '5':
                System.out.println("Suficiente");
                break;
            case '6':
                System.out.println("Bien");
                break;
            case '7':
                System.out.println("Notable");
                break;
            case '8':
                System.out.println("Notable");
                break;
            case '9':
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Suspendido");
        }

        // if(false){
        // console.log("Suspendido");
        // }else{
        // console.log("Suspendido");
        // }

    }
}