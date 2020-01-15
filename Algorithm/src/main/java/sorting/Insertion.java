package sorting;

public class Insertion {

    public void sort(int[] array){
        //loop from i=1 to length-1
        for (int i=1;i<array.length;i++){
            //loop from j=0 to j=i-1
            int key= array[i];
            for (int j=0; j<i; j++){
                if (array[j]>key){
                    key = array[j];
                    array[j] = array[i];
                    array[i] = key;
                }
            }
        }
    }

    private void display(int[] array) {
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] array = {9,2,5,13,7,3,5,6,18};
        Insertion ins = new Insertion();
        ins.sort(array);
        ins.display(array);
    }
}
