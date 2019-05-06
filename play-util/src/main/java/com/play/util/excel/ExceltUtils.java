package com.play.util.excel;

import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.ExcelUtil;
import com.google.common.base.CaseFormat;
import com.google.common.base.Strings;
import org.mockito.internal.matchers.GreaterThan;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

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

	public static String stringToJavaPropertyWithJsonAnnotation(String demoStr) {
		return stringToJavaProperty(demoStr, true);
	}

	public static String stringToJavaProperty(String str, boolean addAnnotation) {
		if (StrUtil.isEmpty(str)) {
			return "";
		}
		String[] split = str.split("\\n");
		StringBuilder sb = new StringBuilder();
		for (String p : split) {
			boolean contains = compile("\\t").matcher(p).find();
			String property = "";
			String comment = "";
			if (contains) {
				property = p.split("\\t")[0];
				comment = p.split("\\t")[1];
				sb.append("/** ").append("\n")
						.append(" * ").append(comment).append("\n")
						.append(" */ ").append("\n");
			} else {
				property = p;
			}
			if (addAnnotation) {
				sb.append("@JsonProperty(\"").append(property).append("\")").append(StrUtil.LF);
			}
			sb.append("private String ").append(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, property)).append(";").append(StrUtil.LF).append("\n");
		}
		return sb.toString();
	}

}
