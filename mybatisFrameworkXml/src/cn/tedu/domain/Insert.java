package cn.tedu.domain;

public class Insert {
	private String id;
	private String parameterType;
	private String parameterMap;
	private String keyProperty;  
	private String useGeneratedKeys;
	private String text;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getParameterMap() {
		return parameterMap;
	}
	public void setParameterMap(String parameterMap) {
		this.parameterMap = parameterMap;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParameterType() {
		return parameterType;
	}
	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	public String getKeyProperty() {
		return keyProperty;
	}
	public void setKeyProperty(String keyProperty) {
		this.keyProperty = keyProperty;
	}
	public String getUseGeneratedKeys() {
		return useGeneratedKeys;
	}
	public void setUseGeneratedKeys(String useGeneratedKeys) {
		this.useGeneratedKeys = useGeneratedKeys;
	}	
	
}
