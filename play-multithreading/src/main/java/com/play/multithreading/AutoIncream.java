package com.play.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/28 0028. - 星期日
 * nickName louyedaren
 */
public class AutoIncream {
	private Integer anInt = 0;

	public static void main(String[] args) {
		new AutoIncream().oneThread();


	}

	private void oneThread() {
		Runnable task1 = () -> {
			AtomicInteger atomicInteger = new AtomicInteger();
			int i = atomicInteger.incrementAndGet();
			System.out.println(Thread.currentThread().getName() + " i is " + i);
			synchronized (anInt) {
				System.out.println(Thread.currentThread().getName() + " anInt is " + anInt++);
			}
		};
		for (int i = 0; i < 1000; i++) {
			new Thread(task1).start();
			new Thread(task1).start();

		}
	}

}
