public class MatrixAddition{
    public static void main (String[]algs){
        int[][]a={{1,2},{3,4}};
        int[][]b={{5,6},{7,8}};
        int[][]sum=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        int[][]product=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                product[i][j]=0;
                for(int k=0;k<2;k++){
                    product[i][j]+=a[i][k]*b[k][k];
                }

            }
        }
    }
}