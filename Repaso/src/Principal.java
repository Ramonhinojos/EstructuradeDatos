public class Principal {


    public static void main(String[] args) {
        int[] arreglo={1,3,5,7,9};
        int[][] array2=new int[3][5];
        array2[0][0]=1;
        array2[0][1]=5;
        array2[0][2]=7;
        array2[0][3]=9;

        int[][] arreglo2={
                {1,3,5,7,9},
                {2,3,1,9,8},
                {8,7,6,5,4}
        };
        int suma=0;
boolean encontro=false;
        for(int x=arreglo.length-1;x>=0;x--){
            suma=suma+arreglo[x];
            if(arreglo[x]==10){
                encontro=true;
            }
        }
       for(int x=0;x<arreglo2.length;x++){
           for(int y=0;y<array2[x].length;y++) {
               System.out.print(arreglo2[x][y]);
           }
           System.out.println("");
       }
    }
}
