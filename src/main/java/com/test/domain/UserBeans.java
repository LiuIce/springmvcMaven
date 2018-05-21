package com.test.domain;

import java.util.Date;

public class UserBeans {

	/**
	 * 主键ID
	 */
	private Integer id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 用户类型
	 */
	private Integer type;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 手机
	 */
	private String mobile;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 注册IP
	 */
	private String registerIp;

	/**
	 * 生效时间
	 */
	private Date effectiveTime;

	/**
	 * 过期时间
	 */
	private Date expiredTime;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	private Boolean isCommonContact;

	private Integer[] roleIds;

	private String nickName;// 用户昵称

	private Integer articleCount;

	private Integer replyCount;

	private Integer sex;// 1男 2女
	private Integer level;
	private String levelName;
	private String sexName;
	private String orgName;// 单位名称
	private String imgurl;// 图像地址
	private String workUnit;// 单位
	private Integer post;
	private String postName;

	private boolean isIFollow;// 是否是我关注的（对于登录用户而言）
	private boolean isFollowMe;// 是否是关注我的（对于登录用户而言）

	private int owner;// 0 是拥有人，1授授权人，2普通关注用户

	private int pnumber;// 人数
	private String name;// 等级名称

	private String reportType;// 被举报类型
	private int reportNumber;// 举报数量
	private int index;// 用于标记v1-v8等级,查询是使用

	private Integer[] reportedArray;// 存放被举报人员的id

	public Integer[] getReportedArray() {
		return reportedArray;
	}

	public void setReportedArray(Integer[] reportedArray) {
		this.reportedArray = reportedArray;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public int getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(int reportNumber) {
		this.reportNumber = reportNumber;
	}

	public int getPnumber() {
		return pnumber;
	}

	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Integer getPost() {
		return post;
	}

	public void setPost(Integer post) {
		this.post = post;
	}

	public String getSexName() {
		return sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}

	public Integer getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	public Integer[] getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Integer[] roleIds) {
		this.roleIds = roleIds;
	}

	public Boolean getIsCommonContact() {
		return isCommonContact;
	}

	public void setIsCommonContact(Boolean isCommonContact) {
		this.isCommonContact = isCommonContact;
	}

	public Integer[] getOrgIds() {
		return orgIds;
	}

	public void setOrgIds(Integer[] orgIds) {
		this.orgIds = orgIds;
	}

	private Integer[] orgIds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public Date getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public boolean isIFollow() {
		return isIFollow;
	}

	public void setIFollow(boolean isIFollow) {
		this.isIFollow = isIFollow;
	}

	public boolean isFollowMe() {
		return isFollowMe;
	}

	public void setFollowMe(boolean isFollowMe) {
		this.isFollowMe = isFollowMe;
	}

	public String getWorkUnit() {
		return workUnit;
	}

	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}

	
	
}
