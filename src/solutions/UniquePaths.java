package solutions;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int array[] = new int[n+1];
        array[0]=0;
        for (int j=1;j<n+1;j++)
            array[j]=1;
        for (int i=1;i<m;i++)
            for (int j=0;j<n;j++)
                array[j+1]+=array[j];
        return array[n];
    }
}
