package com.xiaopang.service.security.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户实体类
 * @author zsy 2018-05-11
 */
@Entity
@Table(name="xp_user")
public class User {

    /** 用户id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    /** 用户名 */
    @Column(name = "name",length = 128)
    private String name;

    /** 登录密码 */
    @Column(name = "password",length = 256)
    private String password;

    /** 邮箱 */
    @Column(name = "email",length = 64)
    private String email;

    /** 创建时间 */
    @Column(name = "create_time",length = 32)
    private Date createTime;

    /** 角色列表 */
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "User")
    private Set<Role> roles = new HashSet<Role>(0);// 用户所对应的角色

    public User(){ }

    public User(String name,String password, String email,Date createTime,Set<Role> roles) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.createTime = createTime;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
