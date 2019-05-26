package com.xiaopang.dao.entity.security;

//import javax.persistence.*;

//@Entity
//@Table(name = "xp_resource")
public class Resource {

    /** ID */
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id",length = 64)
    private Long id;

    /** url */
//    @Column(name = "url",length = 1024)
    private String url;

    /** 资源ID */
//    @Column(name = "resourceId",length = 128)
    private String resourceId;

    /** 资源名 */
//    @Column(name = "resourceName",length = 128)
    private String resourceName;

    /** 资源所对应的方法名 */
//    @Column(name = "methodName",length = 128)
    private String methodName;

    /** 资源所对应的包路径 */
//    @Column(name = "methodPath",length = 1024)
    private String methodPath;

    /** 备注 */
//    @Column(name = "remark",length = 1024)
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodPath() {
        return methodPath;
    }

    public void setMethodPath(String methodPath) {
        this.methodPath = methodPath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
