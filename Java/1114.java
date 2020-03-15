/**
 * @no 1114
 * @name Print in Order
 */
class Foo {
    private CountDownLatch secondReadyToGo = new CountDownLatch(1);
    private CountDownLatch thirdReadyToGo = new CountDownLatch(1);

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        secondReadyToGo.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        secondReadyToGo.await();
        printSecond.run();
        thirdReadyToGo.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        thirdReadyToGo.await();
        printThird.run();
    }
}