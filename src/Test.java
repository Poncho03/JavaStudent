public class Test {
    
    static int SumDosNum(int n1, int n2){
        return n1+n2;
    }
    public static void main(String[]args){
        Tools.imprimir("La suma de los numeros es: "+SumDosNum(Tools.LeerInt("Ingresa un numero"),Tools.LeerInt("Ingresa otro numero")));
    }
}
