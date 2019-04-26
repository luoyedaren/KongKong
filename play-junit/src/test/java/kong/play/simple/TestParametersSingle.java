package kong.play.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/25 0025. - 星期四
 * 参考 https://blog.csdn.net/fanxiaobin577328725/article/details/78407167
 * nickName louyedaren
 */
@RunWith(Parameterized.class)
public class TestParametersSingle {

	@Parameterized.Parameter
	public String result;

	@Parameterized.Parameters
	public static Object[] data() {
		return new Object[]{"one", "two"};
	}

	@Test
	public void test() {
		Assert.assertThat(result, is("one"));
	}

}
