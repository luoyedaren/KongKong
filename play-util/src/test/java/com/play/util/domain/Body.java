package com.play.util.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/5 0005. - 星期日
 * nickName louyedaren
 */
@XStreamAlias("Body")
@Data
public class Body {
	private String NoticeSeq;
	private String EAcNo;
	private String TransTime;
	@XStreamConverter(SelfDateConverter.class)
	private Date AccountDate;
}
