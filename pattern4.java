public class pattern4 {
    public static void main(String[] args) {
        int n= 10;
        for (int r=0;r<n;r++)
        {
            for(int i=0;i<n;i++)
            {
                if(r==0||r==n-1||i==n-1||r==(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
