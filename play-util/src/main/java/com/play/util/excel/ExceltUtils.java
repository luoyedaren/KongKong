package com.play.util.excel;

import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.ExcelUtil;
import com.google.common.base.CaseFormat;
import org.mockito.internal.matchers.GreaterThan;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/6 0006. - 星期一
 * nickName louyedaren
 * 字符串生成对应字段属性
 */
public class ExceltUtils {
	public Object readExcelToJavaBean() {
		return null;
	}

	public static String stringToJavaPropertyWithJsonAnnotation(String demoStr, boolean addAnnotation) {
		if (StrUtil.isEmpty(demoStr)) {
			return "";
		}
		String[] split = demoStr.split("\\n");
		StringBuilder sb = new StringBuilder();
		for (String p : split) {
			if (addAnnotation) {
				sb.append("@JsonProperty(\"").append(p).append("\")").append(StrUtil.LF);
			}
			sb.append("private String ").append(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, p)).append(";").append(StrUtil.LF);
		}
		return sb.toString();
	}

	public static String stringToJavaProperty(String str) {
		return stringToJavaPropertyWithJsonAnnotation(str, false);
	}

}
