package com.xiaopang.dao.entity.security;

//import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table(name = "xp_role_resource")
public class RoleResource {

    /** id */
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id",length = 64)
    private Long id;

    /** 角色ID */
//    @Column(name = "rid",length = 64)
    private Long rid;

    /** 资源ID */
//    @Column(name = "resourceId",length = 64)
    private Long resourceId;

    /** 更新时间 */
//    @Column(name = "updateTime",length = 32)
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
