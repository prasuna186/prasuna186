public class Numbers {
    public static void main(String[] args) {
        for(int i=1;i<4+1;i++)
        {
            for(int j=i;j<4+1;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
