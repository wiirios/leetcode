class ZeroEvenOdd {
    private int n;
    private Semaphore zeroSemaphore = new Semaphore(1);
    private Semaphore evenSemaphore = new Semaphore(0);
    private Semaphore oddSemaphore = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            zeroSemaphore.acquire();
            printNumber.accept(0);
            if (i %2 == 0) {
                oddSemaphore.release();
            } else {
                evenSemaphore.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException { // par
        for (int i = 2; i <= n; i = i + 2) {
            evenSemaphore.acquire(1);
            printNumber.accept(i);
            zeroSemaphore.release(1);
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException { // impar
        for (int i = 1; i <= n; i = i + 2) {
            oddSemaphore.acquire(1);
            printNumber.accept(i);
            zeroSemaphore.release(1);   
        }
    }
}