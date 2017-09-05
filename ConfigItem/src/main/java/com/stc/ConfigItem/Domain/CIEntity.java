package com.stc.ConfigItem.Domain;

import com.stc.ConfigItem.Repository.CIRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

/**
 * 配置项实体类
 */
@Entity
public class CIEntity {
    //id
    @Id
    @GeneratedValue
    private long id;
    //名称
    private String name;
    //标识
    private String code;
    //当前版本
    private int currentVersion;
    @Transient
    //历史版本
    private List<Integer>  versions;
    //所属项目id
    private long projectId;
    //所属基线id
    private long baseLineId;
    @Transient
    @Autowired
    private CIRepository ciRepo;

    /**
     * 添加配置项
     * @param ci 配置项
     * @return 配置项id
     */
    public CIEntity addConfigItem(String name,String code,long projectId)
    {
        CIEntity ci = new CIEntity();
        ci.setName(name);
        ci.setCode(code);
        ci.setProjectId(projectId);
        return ciRepo.save(ci);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(int currentVersion) {
        this.currentVersion = currentVersion;
    }

    public List<Integer> getVersions() {
        return versions;
    }

    public void setVersions(List<Integer> versions) {
        this.versions = versions;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public long getBaseLineId() {
        return baseLineId;
    }

    public void setBaseLineId(long baseLineId) {
        this.baseLineId = baseLineId;
    }
}
