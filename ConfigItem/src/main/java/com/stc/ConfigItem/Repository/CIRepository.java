package com.stc.ConfigItem.Repository;

import com.stc.ConfigItem.Domain.CIEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CIRepository extends JpaRepository<CIEntity,Long>
{

}
