package main.java.cn.domain.tds;

import java.io.Serializable;
import java.util.Date;






/**
 * 用户角色部门视图 对象
 * @author ChuangLan
 *
 */
public class UserRoleDepartmentViewDomain implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2203891393518454812L;
	

	private Integer id;
	private String contact;
	private String role_name;
	private String name;
	private String com_name;
	private String com_url;
	private Date create_time;
	private String source;
	private String is_deleted;
    private Date endtime;  //结束时间
    private Date statime;  //开始时间
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCom_name() {
		return com_name;
	}
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	public String getCom_url() {
		return com_url;
	}
	public void setCom_url(String com_url) {
		this.com_url = com_url;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(String is_deleted) {
		this.is_deleted = is_deleted;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public Date getStatime() {
		return statime;
	}
	public void setStatime(Date statime) {
		this.statime = statime;
	}
	
	
    
}
