package loginSection;

public class MemberVo {
	private String id;
	private String pwd;
	
	public MemberVo() {
		
	}
	
	public MemberVo(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public String getid() {
		return id;
	}
	
	public String getpwd() {
		return pwd;
	}
}