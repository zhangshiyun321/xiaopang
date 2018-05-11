package com.xiaopang.service.security.entity;

import javax.persistence.*;

@Entity
@Table(name = "xp_role")
public class Role {

    /** 角色ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",length = 64)
    private Long id;

    /** 角色名 */
    @Column(name = "name",length = 128)
    private String name;

    /** 角色对应的用户实体类 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid",nullable = false)
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
