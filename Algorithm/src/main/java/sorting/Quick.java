package sorting;

public class Quick{


    public static void main(String[] args) {
        int[] array = {9,2,5,13,7,3,5,6,18};

        Quick q= new Quick();
        q.sort(array,0,array.length-1);
        q.display(array);
    }




    public void sort(int[] array, int start, int end) {

        if (end>start){

            int pivot = end;

            for (int i= 0; i <= end;i++){
                if (array[i] > array[pivot]){
                    //swap both
                    int temp = array[i];
                    array[i] = array[pivot];
                    array[pivot] = temp;
                }

            }
            sort(array,start,pivot-1);
            sort(array,pivot,end);

        }

    }

    private void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

