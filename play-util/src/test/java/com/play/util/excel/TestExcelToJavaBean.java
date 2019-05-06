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
import static com.play.util.excel.ExceltUtils.stringToJavaPropertyWithJsonAnnotation;
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

	String str2 = "APPLY_NO\t申请单号/第三方申请流水号\n" +
			"PRODUCT_NO\t产品编号\n" +
			"CHANNEL_TYPE\t\"是否为外部渠道\n" +
			"（渠道类型）\"\n" +
			"CHANNEL_CODE\t渠道编号（合作/外部）\n" +
			"CHANNEL_VERSION\t子渠道编号\n" +
			"PARTNER_FLAG\t合作方标识\n" +
			"PARTNER_NO\t合作方编号\n" +
			"HANDLE_BRANCH\t经办分行\n" +
			"HANDLE_SUBBRANCH\t经办支行\n" +
			"CUST_ID\t客户号\n" +
			"CUST_NAME\t客户姓名\n" +
			"CERT_TYPE\t证件类型\n" +
			"CERT_NO\t证件号码\n" +
			"CERT_DUE_DATE\t证件有效期/证件到期日\n" +
			"LOAN_NO\t贷款账号\n" +
			"PAY_TYPE\t支付方式\n" +
			"PEDPAY_MERCHANT_NO\t收款商户编号\n" +
			"MARKETER_NO\t营销人员工号\n";

	/**
	 * 字符转java 属性 驼峰
	 */
	@Test
	public void toJava() {
		assertThat("creditLimtSno", is(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CREDIT_LIMT_SNO")));
		String sb = stringToJavaProperty(demoStr, false);
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

	@Test
	public void splitPropertyAndComment() {
		System.out.println(stringToJavaPropertyWithJsonAnnotation(str2));
		;
	}
}
