class StopWatch extends Thread {
    private volatile boolean stop = false;

    public void run() {
        int tid = 0;
        while (!stop) {
            System.out.println(tid++);
            try{
                Thread.sleep(1 * 1000);
            }catch (InterruptedException e) {return;}
        }
    }

}