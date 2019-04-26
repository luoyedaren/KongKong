package kong.play.mock;

import com.google.common.collect.Lists;
import org.hamcrest.CoreMatchers;
import org.hamcrest.collection.IsArrayContaining;
import org.hamcrest.collection.IsIn;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
/**
 * project KongKong
 *
 * @author chenghai on 2019/4/25 0025. - 星期四
 * nickName louyedaren
 */
public class TestSpy {

	@Test
	public void testSpy() {
//		部分模拟
		List<String> list = Lists.newArrayList();
		List<String> spy = spy(list);
		when(spy.size()).thenReturn(100);

		spy.add("one");
		spy.add("two");

		assertThat("one",is(spy.get(0)));
		assertThat("two",is(spy.get(1)));

		assertThat(100,is(spy.size()));

		assertThat(spy, hasItems("one"));
//		assertThat(spy, IsIterableContainingInOrder.contains("two","one"));
		assertThat(spy, IsIterableContainingInOrder.contains("one","two"));
		assertThat("one", IsIn.isIn(spy));
	}

}
