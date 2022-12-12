public class Solve2 {
    public static void main(String[] args) {
        int in = 9;
        System.out.println("Logic 2 no 1");
        logic2_1(in);
        System.out.println("Logic 2 no 2");
        logic2_2(in);
        System.out.println("Logic 2 no 3");
        logic2_3(in);
    }
    public static void logic2_1(int n){
        int[][] deret = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                deret[i][j] = j+2;
            }
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(k==l || k+l == n-1){
                    System.out.print(deret[k][l]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void logic2_2(int n){
        int[][] deret = new int[n][n];
        int num =-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                deret[i][j] = num+2;
                num+=2;
            }
            num=-1;
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(k==0 || l==0 || k==n-1 || l==n-1){
                    System.out.print(deret[k][l]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void logic2_3(int n){
        int[][] deret = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                deret[i][j] = j*2;
            }
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(k==l || k+l == n-1 || k==0 || l==0 || k==n-1 || l==n-1){
                    System.out.print(deret[k][l]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }
}
