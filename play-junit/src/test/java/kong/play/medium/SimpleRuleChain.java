package kong.play.medium;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/25 0025. - 星期四
 * nickName louyedaren
 */
public class SimpleRuleChain implements TestRule {
	private final String name;

	public SimpleRuleChain(String name) {
		this.name = name;
	}

	@Override
	public Statement apply(Statement base, Description description) {
		System.out.println("rule chain is come :"+name);
		return base;
	}
}
