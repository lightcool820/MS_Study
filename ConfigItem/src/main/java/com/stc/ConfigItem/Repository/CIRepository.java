package com.stc.ConfigItem.Repository;

import com.stc.ConfigItem.Domain.CIEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CIRepository extends JpaRepository<CIEntity,Long>
{
    /**
     * 根据项目id查找配置项
     * @param projectId
     * @return
     */
    List<CIEntity> findCIEntitiesByProjectId(Long projectId);

}
