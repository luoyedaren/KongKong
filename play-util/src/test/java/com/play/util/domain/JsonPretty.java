package com.play.util.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * project KongKong
 *
 * @author chenghai on 2019/5/6 0006. - 星期一
 * nickName louyedaren
 */
@Data
public class JsonPretty implements Serializable {

	/**
	 *
	 */
	@JsonProperty("CREDIT_LIMT_SNO")
	private String creditLimtSno = "111";
	private String channelCode;
	private String channelVersion;
	private String payType;
	private String pedpayMerchantNo;
	private String discApplTime;
	private String reserve1;
	private String reserve2;
	private String reserve3;

}
