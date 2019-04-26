package kong.play.medium;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
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
 * @author chenghai on 2019/4/25 0025. - 星期四
 * nickName louyedaren
 */
public class TestRuleChain {

	@Rule
	public TestRule chain = RuleChain.outerRule(new SimpleRuleChain("step one")).around(new SimpleRuleChain("step two"))
			.around(new SimpleRuleChain("step three"));

	@Test
	public void example() {
		System.out.println("test start");
		assertThat(1,anything());

	}
}
