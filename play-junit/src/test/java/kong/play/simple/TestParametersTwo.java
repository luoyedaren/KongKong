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
public class TestParametersTwo {

	@Parameterized.Parameter
	public int input;
	@Parameterized.Parameter(1)
	public int result;

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{{0, 0}, {1, 1}, {1, 1}, {3, 3}, {4, 3}, {5, 5}, {6, 8}});
	}


	@Test
	public void test() {
		Assert.assertThat(result, is(input));
	}

}
