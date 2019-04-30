package kong.play.action.one;

import org.junit.Test;
import lombok.NoArgsConstructor;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.beans.HasPropertyWithValue;
import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.text.IsEqualIgnoringWhiteSpace;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/26 0026. - 星期五
 * nickName louyedaren
 */
public class TestBaseAction {
	@Test
	public void mockServic() {
		BaseServcie baseServcie = mock(BaseServcie.class);
		BaseDao baseDao = mock(BaseDao.class);
		when(baseDao.add("one")).thenReturn(1);
		when(baseServcie.add("one")).thenReturn(1);

		assertThat(baseServcie.add("one"), is(1));
	}
}
