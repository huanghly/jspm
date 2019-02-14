package wsc.Class;
// 模仿无线传感的接口
public class Limit {
	private Integer id ;  // 传感器的id
	private String name; //传感器的名字
	private String limit ;  //传感器的限制
	private String value ;  //传感器的值

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
