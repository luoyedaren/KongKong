package play.java.multithread;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * project play-java
 *
 * @author chenghai on 19-7-9. - 星期二
 * nickName louyedaren
 */
public class CountDownLatchLearn {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		TestThread testThread = new TestThread(countDownLatch);
		Runnable runnable = ()->testThread.exc();
		for (int i = 0; i <5; i++) {
			Thread t = new Thread(runnable);
			t.start();
		}

		BasicThreadFactory.Builder builder = new BasicThreadFactory.Builder();
		BasicThreadFactory build = builder.namingPattern("demo-pool-%d").build();
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>(1024),build,new ThreadPoolExecutor.AbortPolicy());
		for (int i = 0; i < 5; i++) {
			threadPoolExecutor.execute(runnable);

		}
		threadPoolExecutor.shutdown();

		System.out.println("main start");
		countDownLatch.await();
		System.out.println("main end");

	}

}

class TestThread{

	private CountDownLatch countDownLatch;
	private String name;

	public TestThread(CountDownLatch countDownLatch, String name) {
		this.countDownLatch = countDownLatch;
		this.name = name;
	}

	public TestThread(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	public void exc() {
		System.out.println("线程进入........"+Thread.currentThread().getName());
		try {
			TimeUnit.SECONDS.sleep(2);


		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			countDownLatch.countDown();

		}
		System.out.println("执行完毕线程.....");

	}
}