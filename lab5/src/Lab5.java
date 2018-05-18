package lab5;

public class Lab5 implements Runnable{
    static Worker _worker;

    public static void main(String[] args) {
        _worker = new Worker(Integer.parseInt(args[0]));
        
        Runnable theWorker = new Lab5();
        Thread firstWorker = new Thread(theWorker);
        Thread secondWorker = new Thread(theWorker);
        Thread thirdWorker = new Thread(theWorker);

        firstWorker.start();
        secondWorker.start();
        thirdWorker.start();
    }

    public void run() {
        String name = Thread.currentThread().getName();
        boolean f = true;

        while (f) { 
            synchronized(this) {
                if (_worker.current > _worker.count) {
                    return;
                }
                if (_worker.worker == 1) {
                    System.out.println("\n" + "Саженец: " + _worker.current);
                    System.out.println(_worker.worker + ": " + _worker.getWork(_worker.worker));
                    _worker.worker = 2;
                } else if (_worker.worker == 2) {
                    System.out.println(_worker.worker + ": " + _worker.getWork(_worker.worker));
                    _worker.worker = 3;
                } else if (_worker.worker == 3) {
                    System.out.println(_worker.worker + ": " + _worker.getWork(_worker.worker));
                    _worker.worker = 1;
                    ++_worker.current;                    
                }
            }     
        }
    }
}