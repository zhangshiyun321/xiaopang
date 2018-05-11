package com.xiaopang.service.security.entity;

import javax.persistence.*;

@Entity
@Table(name = "xp_user_role")
public class UserRole {

    /** 用户角色表id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",length = 64)
    private Long id;

    /** 用户id */
    @Column(name = "uid",length = 64)
    private Long uid;

    /** 角色id */
    @Column(name = "rid",length = 64)
    private Long rid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
}
