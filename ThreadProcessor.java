package aFindingAndStartingWORK;

public class ThreadProcessor extends Thread{
    public static void findAndStartThread (Thread[] threads)throws InterruptedException {

        for (int i = 0; i < threads.length; i++) {

            if ("NEW".equals(threads[i].getState().toString())){

                threads[i].start();

                System.out.println("Thread" + i + ": " +  threads[i].getState());
            }
        }


    }
}
