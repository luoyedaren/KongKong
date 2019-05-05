package com.play.util.domain;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterMatcher;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/5 0005. - 星期日
 * nickName louyedaren
 */
public class SelfDateConverter implements Converter {
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

	@Override
	public boolean canConvert(Class clazz) {
		return Date.class.isAssignableFrom(clazz);
	}

	public void marshal(
			Object value, HierarchicalStreamWriter writer, MarshallingContext arg2) {
		Date date = (Date) value;
		writer.setValue(formatter.format(date));
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
		String value = hierarchicalStreamReader.getValue();
		try {
			Date parse = formatter.parse(value);
			return parse;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
