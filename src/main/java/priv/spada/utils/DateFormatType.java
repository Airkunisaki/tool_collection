package priv.spada.utils;

public enum DateFormatType {
	/**yyyy-MM-dd hh:mm:ss*/
	NORMAL_PRECISION_SS("正常类型_精度(秒)","yyyy-MM-dd hh:mm:ss"),
	/**yyyy-MM-dd hh:mm:ss:ms*/
	NORMAL_PRECISION_MS("正常类型_精度(毫秒)","yyyy-MM-dd hh:mm:ss:ms");
	
	private String tag;
	
	private String value;
	
	private DateFormatType(String tag, String Value){
		this.tag = tag;
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public String getTag(){
		return tag;
	}
}
