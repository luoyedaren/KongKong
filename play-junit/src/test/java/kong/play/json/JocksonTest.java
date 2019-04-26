package kong.play.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/24 0024. - 星期三
 * nickName louyedaren
 */
public class JocksonTest {
	String str = "{\n" +
			"  \"user-name\":\"123\",\n" +
			"  \"user-age\": 11,\n" +
			"  \"address\": null\n" +
			"}";

	ObjectMapper objectMapper = new ObjectMapper();

	@Before
	public void init(){

	}

	@Test
	public void testAnnotation() throws JsonProcessingException {
		String s = objectMapper.writeValueAsString(new User());

	}

}

@Data
class User {

	@JsonProperty("user-name")
	private String name="123";

	@JsonProperty("user-age")
	private int age=10;

	private String address;

	@EqualsAndHashCode.Exclude
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyyMMdd")
	private Date birthDay = new Date();
}