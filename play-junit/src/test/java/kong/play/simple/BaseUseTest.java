package kong.play.simple;

import junit.framework.TestCase;
import kong.play.simple.tag.QuikTest;
import kong.play.simple.tag.SlowTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/20 0020. - 星期六
 * nickName louyedaren
 */
public class BaseUseTest{

	@Test
	@Category(SlowTest.class)
	public void testA() {
		assertThat("test a tag",1,is(1));
	}

	@Test
	@Category(QuikTest.class)
	public void testB() {
		assertThat("test b tag",1,is(2));
	}

	@Test
	public void testAdd() {
		String str = "1 2 3";
		Assert.assertEquals("1 2 3",str);
		Assert.assertEquals("1 2 3 4",str);
	}

	@Test
	public void testOne() {
		System.out.println("执行 testOne");
		Assert.assertEquals(3,1+1);
	}
}
