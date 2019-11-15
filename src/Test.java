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
    
    static int[][] CreaMatriz(){
        int [][] mat = new int[3][3];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[1][0] = 4;
        mat[1][1] = 5;
        mat[1][2] = 6;
        mat[2][0] = 7;
        mat[2][1] = 8;
        mat[2][2] = 9;
        return mat;
    }
    
    static void ImpMat(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("["+mat[i][j]+"] ");
            }
            System.out.print("\n");
        }
    }
    
    static void ImpMatWin(int mat[][]){
        String cad ="";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                cad += "["+mat[i][j]+"] ";
            }
            cad+="\n";
        }
        Tools.imprimir(cad);
    }
    
    public static void main(String[]args){
        //Tools.imprimir("La suma de los numeros es: "+SumDosNum(Tools.LeerInt("Ingresa un numero"),Tools.LeerInt("Ingresa otro numero")));
        //Tools.imprimir(TabMul(Tools.LeerInt("Ingresa el numero de la tabla que quieras")));
        //ImpMat(CreaMatriz());
        //ImpMatWin(CreaMatriz());
    }
}
