package com.play.util;

import com.play.util.domain.RootXml;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.junit.Test;
import lombok.NoArgsConstructor;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.beans.HasPropertyWithValue;
import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.text.IsEqualIgnoringWhiteSpace;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/5 0005. - 星期日
 * nickName louyedaren
 */
public class TestStreamXml {

	String xmlDemo = "<Message>\n" +
			"\t<Head>\n" +
			"\t\t<ReqJnlNo>t1523235365256s8</ReqJnlNo>\n" +
			"\t\t<ReqId>AgMerchantNotice</ReqId>\n" +
			"\t\t<ReqTime>2018-04-09 09:10:28</ReqTime>\n" +
			"          <Channel>bop</Channel>\n" +
			"\t\t<Signature>NzUDq9mZnvq6xVcDp%2FjPHBhUEH%2B02mL</Signature>\n" +
			"\t</Head>\n" +
			"\t<Body>\n" +
			"\t\t<NoticeSeq>10001</NoticeSeq>\n" +
			"          <EAcNo>6225xxxxxx</EAcNo>\n" +
			"\t\t<TransTime>13:48</TransTime>\n" +
			"\t\t<DCFlag>0</DCFlag>\n" +
			"\t\t<Currency>CNY</Currency>\n" +
			"\t\t<Amount>1000.50</Amount>\n" +
			"          <Balance>1000.50</Balance>\n" +
			"\t\t<AccountDate>20180302</AccountDate>\n" +
			"\t</Body>\n" +
			"</Message>";

	@Test
	public void testXml() {
		System.out.println(xmlDemo);
		XStream xStream = new XStream(new DomDriver());
		xStream.ignoreUnknownElements();
		xStream.setupDefaultSecurity(xStream);
//		允许多层级访问
		xStream.allowTypesByRegExp(new String[]{".*"});
		xStream.processAnnotations(RootXml.class);
		RootXml rootXml = (RootXml) xStream.fromXML(xmlDemo);
		System.out.println(rootXml);
		assertThat(rootXml.getBody().getAccountDate(), notNullValue());
	}


}
