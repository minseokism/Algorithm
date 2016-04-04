package sort;

public class HeapSort 
{
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    // 부모 노드 : (index-1)/2
    // 왼쪽 노드 : index*2+1
    // 오른쪽 노드  : index*2+2;
    
    public static void buildheap(int []a){
        n=a.length-1; 
        for(int i=n/2;i>=0;i--){
            System.out.println(i);
        	maxheap(a,i);
        }
    }
    
    public static void maxheap(int[] a, int i){ 
        left=2*i;
        right=2*i+1;
        System.out.println("left = "+left+" , right = "+right);

        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        System.out.println("largest = "+largest+" __ "+a[largest]);
        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }
    
    public static void exchange(int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t; 
        }
    
    public static void sort(int []a0){
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }
    
    public static void main(String[] args) {
        int []a1={4,1,3,2,16,9,10,14,8,7};
        sort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i] + " ");
        }
    }
}
