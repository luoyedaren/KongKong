package kong.play.mock;

import org.junit.Test;
import lombok.NoArgsConstructor;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.beans.HasPropertyWithValue;
import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.text.IsEqualIgnoringWhiteSpace;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/25 0025. - 星期四
 * 参考文档： https://segmentfault.com/a/1190000006746409
 * nickName louyedaren
 */
public class TestSimpleMock {
	@Test
	public void name() {
		List mockList = mock(List.class);
		mockList.add("one");
		mockList.removeAll();

//		验证被调用过
		verify(mockList).add("one");
		verify(mockList).removeAll();
		verify(mockList,atLeast(2)).add("one");
		verify(mockList,times(3)).add("one");
//		verify(mockList).add("two",1);
	}

	@Test
	public void operatorOne() {
		OperatorOne mockOperator = mock(OperatorOne.class);
		when(mockOperator.getOne()).thenReturn("one");
		System.out.println(mockOperator.getOne());


	}
}
