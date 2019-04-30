package play.java.base.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RegExUtils;
import org.hamcrest.collection.IsIn;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.regex.Pattern;

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

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/30 0030. - 星期二
 * nickName louyedaren
 */
@Slf4j
public class T1Test {


	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void indexBoundsException() {
		T1.indexBoundsException();
	}

	@Test
	public void testlog() {
		log.info("hello worl");
		assertThat(RegExUtils.removeAll(systemOutRule.getLog(), Pattern.compile("\r|\n")), containsString("hello world"));

	}
}