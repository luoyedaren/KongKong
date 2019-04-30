package com.play.multithreading;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/28 0028. - 星期日
 * nickName louyedaren
 */
public class Yield {
	private static int anInt;
	private static boolean ready;


	public static void main(String[] args) {
		new Thread(() -> {
			while (!ready) {
				Thread.yield();
			}
			System.out.println(anInt);
		});

		anInt = 10;
		ready = true;
	}
}
