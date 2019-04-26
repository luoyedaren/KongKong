package kong.play.simple;

import org.junit.Test;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/20 0020. - 星期六
 * nickName louyedaren
 */
public class ExpectTest {
	@Test(expected = NumberFormatException.class)
	public void add() {
		System.out.println("hello");
	}
}
