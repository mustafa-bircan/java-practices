public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers =  new int[]{1,2,3};
            System.out.println(numbers[2]);
        } catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("I'll work all the way.");
        }
        //In finally, we do the operation we want to run no matter what,
        // for example, we are doing database operation and we want to end the
        // database connection at the end of the job, even if it works even
        // if there is an error.

    }
}