public class printminmax {
    public static void main(String[] args) {

        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33

        // TODO: Initialize min and max with the first element

        // TODO: Use an enhanced for loop to find min and max

        // TODO: Print the smallest and largest numbers
        int[] arr= {45,22,89,16,90,33};
        int min=arr[0];
        int max=arr[0];
        for(int i:arr)
        {
            if(i<min)
                min=i;
            if(i>max)
                max=i;
        }
        System.out.println("Smallest: "+min);
        System.out.println("largest: "+max);

    }
}
