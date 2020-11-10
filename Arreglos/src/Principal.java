public class Principal {
    public static void main(String[] args) {
        int[] arreglo1={1,3,8,7,5};
        int[][] array2=new int[3][5];
        array2[0][0]=2;
        array2[0][1]=4;
        array2[0][2]=6;
        array2[0][3]=8;

        int[][] arreglo2={
                {1,5,8,9,3},
                {2,3,4,6,7},
                {1,3,5,7,8}
        };
        int suma=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor1=sumaHor1+arregloMagico[0][x]; }
        System.out.println(sumaHor1);
        int sumaHor2=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor2=sumaHor2+arregloMagico[1][x]; }
        System.out.println(sumaHor2);
        int sumaHor3=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor3=sumaHor3+arregloMagico[2][x]; }
        System.out.println(sumaHor3);
        int sumaHor4=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaHor4=sumaHor4+arregloMagico[3][x]; }
        System.out.println(sumaHor4);
        int sumaVer1=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaVer1=sumaVer1+arregloMagico[x][0]; }
        System.out.println(sumaVer1);
        int sumaVer2=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaVer2=sumaVer2+arregloMagico[x][1]; }
        System.out.println(sumaVer2);
        int sumaVer3=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaVer3=sumaVer3+arregloMagico[x][2]; }
        System.out.println(sumaVer3);
        int sumaVer4=0;
        for(int x=0;x<arregloMagico.length;x++){
            sumaVer4=sumaVer4+arregloMagico[x][3]; }
        System.out.println(sumaVer4);
        int sumaDiagonal1=0;
        for(int x =0;x<arregloMagico.length;x++){
            sumaDiagonal1=sumaDiagonal1+arregloMagico[x][x]; }
        System.out.println(sumaDiagonal1);
        int sumaDiagonal2=0;
        int y=3;
        for(int x =0;x<arregloMagico.length;x++){
            sumaDiagonal2=sumaDiagonal2+arregloMagico[y][x];
            y=y-1; }
        System.out.println(sumaDiagonal2); }
}
