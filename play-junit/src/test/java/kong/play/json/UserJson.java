package kong.play.json;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.SortedMap;

/**
 * project KongKong
 *
 * @author chenghai on 2019/4/24 0024. - 星期三
 * nickName louyedaren
 */
@Data
@JSONType(naming = PropertyNamingStrategy.CamelCase)
class UserJson {

//	@JSONField(ordinal = 2)
	private String name;
//	@JSONField(ordinal = 1)
	private int age;
	private String address;
	@JSONField(format = "yyyyMMdd")
	@EqualsAndHashCode.Exclude
	private Date birthDay = new Date();
}
