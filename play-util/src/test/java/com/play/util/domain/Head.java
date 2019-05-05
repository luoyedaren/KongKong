package com.play.util.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/5 0005. - 星期日
 * nickName louyedaren
 */
@XStreamAlias("Head")
@Data
public class Head {
	private String ReqJnlNo;
	private String ReqId;
	private String ReqTime;
	private String Channel;
	private String Signature;

}
