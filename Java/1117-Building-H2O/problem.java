class H2O {
    private Semaphore semaphoreH = new Semaphore(2);
    private Semaphore semaphoreO = new Semaphore(0);

    public H2O() {
        
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.

            semaphoreH.acquire();
            releaseHydrogen.run();
            semaphoreO.release();

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        // releaseOxygen.run() outputs "O". Do not change or remove this line.

            semaphoreO.acquire(2);
            releaseOxygen.run();
            semaphoreH.release(2);
        
    }
}