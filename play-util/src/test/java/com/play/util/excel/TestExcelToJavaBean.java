package com.play.util.excel;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.CaseFormat;
import com.play.util.domain.JsonPretty;
import org.junit.Test;
import lombok.NoArgsConstructor;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.beans.HasPropertyWithValue;
import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.text.IsEqualIgnoringWhiteSpace;
import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;
import org.mockito.internal.matchers.LessThan;

import static com.play.util.excel.ExceltUtils.stringToJavaProperty;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/6 0006. - 星期一
 * nickName louyedaren
 */
public class TestExcelToJavaBean {

	String demoStr = "CREDIT_LIMT_SNO\n" +
			"CHANNEL_CODE\n" +
			"CHANNEL_VERSION\n" +
			"PAY_TYPE\n" +
			"PEDPAY_MERCHANT_NO\n" +
			"DISC_APPL_TIME\n" +
			"RESERVE1\n" +
			"RESERVE2\n" +
			"RESERVE3\n";

	/**
	 * 字符转java 属性 驼峰
	 */
	@Test
	public void toJava() {
		assertThat("creditLimtSno", is(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CREDIT_LIMT_SNO")));
		String sb = stringToJavaProperty(demoStr);
		System.out.println(sb);
		assertThat(sb, anything());
	}

	@Test
	public void jsonBeaty() throws JsonProcessingException {
		JsonPretty jsonPretty = new JsonPretty();
		System.out.println(jsonPretty);
		JSONUtil.toJsonPrettyStr(jsonPretty);
		String s = new ObjectMapper().writeValueAsString(jsonPretty);
		System.out.println(s);

	}
}
