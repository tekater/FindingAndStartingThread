package aFindingAndStartingWORK;

public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread builder = new Thread();
        Thread medic = new Thread();
        Thread police = new Thread();
        Thread editor = new Thread();

        Threader threader = new Threader();

        Thread[] thread = {
                builder,medic,threader,police,editor
        };
        threader.start();

        ThreadProcessor.findAndStartThread(thread);


    }
}
