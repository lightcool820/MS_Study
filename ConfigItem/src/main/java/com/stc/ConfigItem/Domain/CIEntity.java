package com.stc.ConfigItem.Domain;

import java.util.List;

/**
 * 配置项实体类
 */
public class CIEntity {
    //id
    private long id;
    //名称
    private String name;
    //标识
    private String code;
    //当前版本
    private int currentVersion;
    //历史版本
    private List<Integer>  versions;
    //所属项目id
    private long projectId;
    //所属基线id
    private long baseLineId;

    /**
     * 添加配置项
     * @param ci 配置项
     * @return 配置项id
     */
    public long addConfigItem(CIEntity ci)
    {
        return 0;
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
