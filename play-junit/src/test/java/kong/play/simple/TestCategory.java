package kong.play.simple;

import kong.play.simple.tag.SlowTest;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/25 0025. - 星期四
 * nickName louyedaren
 * 使用 category进行分类测试
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTest.class)
@Suite.SuiteClasses(BaseUseTest.class)
public class TestCategory {
}
