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
    
    public static void main(String[]args){
        Tools.imprimir("La suma de los numeros es: "+SumDosNum(Tools.LeerInt("Ingresa un numero"),Tools.LeerInt("Ingresa otro numero")));
    }
}
