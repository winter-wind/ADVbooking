package cc.biibi.njl.setget;

public class Customers {

	private String wechat;
	private String username;
	private String mobile;
	
	//数据库中开始和结束日期在一个字段
	private String startdate;
	private String enddate;
	
	private String orderroom;
	private String repast;
	private String remarks;
	
	
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getOrderroom() {
		return orderroom;
	}
	public void setOrderroom(String orderroom) {
		this.orderroom = orderroom;
	}
	public String getRepast() {
		return repast;
	}
	public void setRepast(String repast) {
		this.repast = repast;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public Customers(String wechat, String username, String mobile, String startdate, String enddate, String orderroom,
			String repast, String remarks) {
		super();
		this.wechat = wechat;
		this.username = username;
		this.mobile = mobile;
		this.startdate = startdate;
		this.enddate = enddate;
		this.orderroom = orderroom;
		this.repast = repast;
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "Customers [wechat=" + wechat + ", username=" + username + ", mobile=" + mobile + ", startdate="
				+ startdate + ", enddate=" + enddate + ", orderroom=" + orderroom + ", repast=" + repast + ", remarks="
				+ remarks + "]";
	}

	
	
	
	
}
