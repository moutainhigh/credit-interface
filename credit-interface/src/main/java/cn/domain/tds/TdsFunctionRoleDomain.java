package main.java.cn.domain.tds;

import java.io.Serializable;

/**
 * :功能与角色
 * 
 * 
 * @author Gen
 */
public class TdsFunctionRoleDomain implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -1146966684149375247L;

	// : id 	
	private Integer id; 
	
	//功能id : fun_id 	
	private Integer funId; 
	
	//角色id : role_id 	
	private Integer roleId; 
	
	
	//删除状态：0正常，1已删除 : is_deleted 	
	private String isDeleted; 
	

	/**
	 *  : id
	 * 
	 * @return 
	 */
	public Integer getId () {
		return id;
	}
	
	/**
	 *  : id
	 * 
	 * @return 
	 */
	public void setId (Integer id) {
		this.id = id;
	}
	/**
	 * 功能id : fun_id
	 * 
	 * @return 
	 */
	public Integer getFunId () {
		return funId;
	}
	
	/**
	 * 功能id : fun_id
	 * 
	 * @return 
	 */
	public void setFunId (Integer funId) {
		this.funId = funId;
	}
	/**
	 * 角色id : role_id
	 * 
	 * @return 
	 */
	public Integer getRoleId () {
		return roleId;
	}
	
	/**
	 * 角色id : role_id
	 * 
	 * @return 
	 */
	public void setRoleId (Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * 删除状态：0正常，1已删除 : is_deleted
	 * 
	 * @return 
	 */
	public String getIsDeleted () {
		return isDeleted;
	}
	
	/**
	 * 删除状态：0正常，1已删除 : is_deleted
	 * 
	 * @return 
	 */
	public void setIsDeleted (String isDeleted) {
		this.isDeleted = isDeleted;
	}


  
}
