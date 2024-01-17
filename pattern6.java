public class pattern6 {
    public static void main(String[] args) {
        int n= 10;
        for (int r=0;r<n;r++)
        {
            for (int c =0;c<n;c++)
            {
                if (r==0 && c>0 && c<(n-1)/2 || c==0 || c==(n-1)/2 && r>0 && r<(n-1)/2 || r==(n-1)/2 && c<(n-1)/2 || c==r && c>(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }
    }
}