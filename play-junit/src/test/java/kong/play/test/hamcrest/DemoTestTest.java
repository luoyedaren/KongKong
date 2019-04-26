package kong.play.test.hamcrest;

import com.google.common.collect.Maps;
import static org.hamcrest.CoreMatchers.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import static org.hamcrest.Matcher.*;

import lombok.NoArgsConstructor;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.beans.HasPropertyWithValue;
import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.text.IsEqualIgnoringWhiteSpace;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/24 0024. - 星期三
 * nickName louyedaren
 */
public class DemoTestTest {


	@Test
	public void testMapKey() {
		Map<String, Object> map = Maps.newHashMap();
		map.put("one", 1);
		map.put("two", 2);
		assertThat(map, is(IsMapContaining.hasKey("two")));
		assertThat(map, anyOf(IsMapContaining.hasKey("two"),IsMapContaining.hasValue(4)));
		assertThat("是否全部匹配",map,allOf(IsMapContaining.hasKey("two"),IsMapContaining.hasKey("o")));
		assertThat(map,is(IsMapContaining.hasEntry("one",1)));
		assertThat(map,is(IsMapContaining.hasValue(2)));

	}

	@Test
	public void beanTest() {
		//		测试bean
		assertThat(new DemoBean(), HasProperty.hasProperty("name"));
		assertThat(new DemoBean(), HasProperty.hasProperty("age"));
	}

	@Test
	public void numberEq() {
		assertThat(3L, Matchers.greaterThan(2L));
	}

	@Test
	public void str() {
		assertThat("txt",containsString("x"));
		assertThat("t x t", IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace("txt"));
	}

	@Test
	public void notNull() {
		assertThat(new DemoBean(),notNullValue());
		assertThat(new DemoBean("1"),HasPropertyWithValue.<DemoBean>hasProperty("name",equalTo("1")));
	}

	@Test
	public void isSame() {
		assertThat(new DemoBean("one"),is(new DemoBean("one")));
	}
}

@Data
class DemoBean{
	private String name;

	public DemoBean() {
	}

	public DemoBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}