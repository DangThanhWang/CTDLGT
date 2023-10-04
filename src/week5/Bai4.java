package week5;

public class Bai4 {
    int x , y ;
    int [] a ;
    int n ;
    private static void swap (int a[],int x, int y) {
        int temp = a[x] ;
        a[x] = a[y] ;
        a[y]= temp ;
    }
    public void selection(int []a , int n){
        for ( int i = 0; i<n-1 ; i++)
        {
            int min = i ;
            for ( int j = i+1 ; j<n ; j++)
            {
                if (a[j]<a[min]){
                    min = j ;
                }
            }
            swap(a,min,i);
        }
    }
    public void print (int []a , int n )
    {
        for ( int i = 0 ; i<n ; i++)
            System.out.println(a[i]+" ");
    }
    public static void main (String[] args){
        int []a = {1,5,2,8,9};
        Main sx = new Main();
        sx.selection(a,5);
        sx.print(a,5);
    }
}
