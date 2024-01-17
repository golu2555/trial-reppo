public class patterns2 {
    public static void main(String[] args) {
        int n=5;
        for(int o=0;o<n;o++)
        {
            for(int i=0;i<n;i++)
            {
                if(o==0||i==0||o==n-1||i==n-1)
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
