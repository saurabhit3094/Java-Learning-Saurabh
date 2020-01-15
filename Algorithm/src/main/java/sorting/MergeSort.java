
package sorting;

public class MergeSort {

    public void sort(int[] array,int s,int e){
        if (e>s){
            int m = (s+e)/2;
            sort(array,s,m);
            sort(array,m+1,e);

            merge(array,s,m,e);

        }

    }

    private void merge(int[] array, int s, int m, int e) {

        int leftSize = m-s+1 ;
        int rightSize = e-m ;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i=0; i<leftSize;i++){
            leftArray[i] = array[i+s];
        }
        for (int i=0;i<rightSize;i++){
            rightArray[i] = array[i+m+1];
        }

        int lPoint=0;
        int rpoint=0;

        int current = s;

        while (lPoint<leftSize && rpoint<rightSize){
            if (leftArray[lPoint] <= rightArray[rpoint]){
                array[current] = leftArray[lPoint];
                lPoint++;
            }
            else
            {
                array[current] = rightArray[rpoint];
                rpoint++;
            }
            current++;
        }

        while (lPoint < leftSize){
            array[current] = leftArray[lPoint];
            lPoint++;
            current++;
        }
        while(rpoint < rightSize){
            array[current] = rightArray[rpoint];
            rpoint++;
            current++;
        }

    }

    public static void main(String[] args) {
        int[] array = {9,2,5,13,7,3,5,6,18};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array,0,array.length-1);
        mergeSort.display(array);
    }

    private void display(int[] array) {
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
