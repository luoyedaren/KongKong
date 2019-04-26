package kong.play.simple;

import org.junit.Test;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/20 0020. - 星期六
 * nickName louyedaren
 */
public class TimeOoutUnit {

	@Test(timeout = 1000)
	public void testTime() {
		while(true){
			System.out.println("超时");
		}
	}
}
