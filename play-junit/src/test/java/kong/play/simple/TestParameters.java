package kong.play.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/25 0025. - 星期四
 * nickName louyedaren
 */
@RunWith(Parameterized.class)
public class TestParameters {

	private int input;
	private int result;

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{{0, 0}, {1, 1}, {1, 1}, {3, 3}, {4, 3}, {5, 5}, {6, 8}});
	}

	public TestParameters(int input, int result) {
		this.input = input;
		this.result = result;
	}

	@Test
	public void test() {
		Assert.assertThat(result, is(input));
	}

}
