import javax.swing.JOptionPane;
public class Tools {
		
    public static String LeerCadena (String c) {
        String R;
        do {
            R=JOptionPane.showInputDialog(c);
            if(R.length()==0)
                    imprimir("Minimo captura un caracter");
        }while(R.length()==0);
        return R;
    }

    public static void imprimir(String M) {
        JOptionPane.showMessageDialog(null, M);
    }

    public static int LeerInt(String c) {
        boolean x=false;
        int r=0;
        do {
            try {
                r=Integer.parseInt(LeerCadena(c));
                x=true;
            }
            catch(Exception X1) {
                imprimir("Error, no es entero");
            }
        }while(!x);
        return r;
    }
    
    public static long LeerLong(String c) {
        boolean x=false;
        long r=0;
        do {
            try {
                r=Long.parseLong(LeerCadena(c));
                x=true;
            }
            catch(Exception X1) {
                imprimir("Error, no es entero");
            }
        }while(!x);
        return r;
    }
    
    public static double LeerDouble(String c) {
        boolean x=false;
        double r=0;
        do {
            try {
                r=Double.parseDouble(LeerCadena(c));
                x=true;
            }
            catch(Exception X1) {
                imprimir("Error, no es entero");
            }
        }while(!x);
        return r;
    }
}


