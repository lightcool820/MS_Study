package com.stc.ConfigItem.Controller;

import com.stc.ConfigItem.Domain.CIEntity;
import com.stc.ConfigItem.Repository.CIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ConfigItem")
public class CIController
{
    @Autowired
    private CIRepository ciRepo;
    
    @RequestMapping("/add")
    public CIEntity addConfigItem(@RequestParam("name") String name,@RequestParam("code") String code,@RequestParam("projectId") long projectId)
    {
       return new CIEntity().addConfigItem(name,code,projectId);
    }

    @RequestMapping("/getAllCI")
    public long getAllCI()
    {
        return 1;
    }
}
