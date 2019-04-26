package kong.play.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/24 0024. - 星期三
 * nickName louyedaren
 */
public class TestFastJson {
	String jsonUser = "{\"address\":\"地址\",\"age\":10,\"birthDay\":\"20190424\",\"name\":\"one\"}";

	String PascalCaseStr = "{\"Address\":\"地址\",\"Age\":10,\"BirthDay\":\"20190424\",\"Name\":\"one\"}";

	UserJson userBean = null;

	@Before
	public void init(){
		userBean= new UserJson();
		userBean.setName("one");
		userBean.setAddress("地址");
		userBean.setAge(10);

	}

	@Test
	public void simple() {
		System.out.println(JSONObject.toJSONString(userBean));
		Assert.assertNotEquals(jsonUser,JSONObject.toJSONString(userBean));
	}

	@Test
	public void moreAnnotation() {
		Object o = JSON.parseObject(PascalCaseStr, UserJson.class);
		Assert.assertEquals(userBean,o);

	}

	@Test
	public void toJson() {
		Object o = JSON.toJSON(userBean);
		Assert.assertTrue(o instanceof JSONObject);
	}

	@Test
	public void errorMake() {
		JSON.toJSONString("\u0001\u0080\u0002");
	}
}
