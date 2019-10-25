public class Test {
    
    static int SumDosNum(int n1, int n2){
        return n1+n2;
    }
    
    static void NumPer(int n, int div, int c){
        while(div!=n){
            if(n%div==0){
                c=c+div;
                div++;
            }
            else{
                div++;
            }   
        }
        if(c==n)
            Tools.imprimir(n+" es perfecto");
        else
            Tools.imprimir(n+ " no es perfecto");
    }
    
    static String TabMul(int NumTab){
        String res="";
        for (int i = 1; i < 11; i++) {
            res+= NumTab +" * "+ i +" = "+ (NumTab*i)+"\n";
        }
        return "Tabla del "+NumTab+"\n"+res;
    }
    
    public static void main(String[]args){
        //Tools.imprimir("La suma de los numeros es: "+SumDosNum(Tools.LeerInt("Ingresa un numero"),Tools.LeerInt("Ingresa otro numero")));
        Tools.imprimir(TabMul(Tools.LeerInt("Ingresa el numero de la tabla que quieras")));
    }
}
