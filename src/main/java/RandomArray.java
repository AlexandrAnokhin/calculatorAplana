public class RandomArray {

    public void rArray () {

        int[] array = new int[20];
        int minNumber = 0;
        int maxNumber = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
            }
            if (array[i] < minNumber) {
                minNumber = array[i];
                minIndex = i;
            }

            int temp = maxIndex;
            maxIndex = minIndex;
            minIndex = temp;
        }
        for (int element : array)
            System.out.println(element);
    }
}


