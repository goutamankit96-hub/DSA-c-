class MergeSortTempArrayList{
    static void mergesort(int[] arr,int t,int r) {
        if (l >= r) return;

        int mid = (l+r)/2;
        mergesort(arr, l, mid)
        mergesort(arr, mid+1, r);
        system.out.println(arr);
    }

    static void merge(int[] arr, int l,int mid, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = mid + l;
        while (i <= mid && j <= r){
            if (arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i <= mid){
            temp.add(arr[i]);
            i++;
        }
            }
            public static void main(String[] args){
                
                int arr[]={4,8,2,6,4};
                mergesort(arr, l:0,arr.length-1);

            }
}