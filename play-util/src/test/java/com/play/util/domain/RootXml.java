package com.play.util.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/5 0005. - 星期日
 * nickName louyedaren
 */
@XStreamAlias("Message")
@Data
public class RootXml {
	@XStreamAlias("Head")
	private Head head;
	@XStreamAlias("Body")
	private Body body;

}
