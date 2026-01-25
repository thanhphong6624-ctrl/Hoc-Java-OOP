package model;

public class VIPMember extends Member {

	private int vipId;

	public VIPMember(int no, String name, int vipId) {
		super(no, name);
		this.vipId = vipId;
	}

}
