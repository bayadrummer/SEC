package bzh.fucktheduck.sec.persistance.bean;

public class SystemParameter {

	private Integer id = null;

	private String name;

	private String type;

	private String value;

	public SystemParameter() {
	}

	public SystemParameter(String name, String type, String value) {
		this.name = name;
		this.type = type;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SystemParameter - name : " + name + ", type : " + type + ", value : " + value;
	}
}
