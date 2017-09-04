package com.stc.ConfigItem.Controller;

import com.stc.ConfigItem.Domain.CIEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ConfigItem")
public class CIController
{
    @RequestMapping(method = RequestMethod.POST)
    public long addConfigItem(@RequestBody CIEntity ci)
    {
       return new CIEntity().addConfigItem(ci);
    }

    @RequestMapping("/getAllCI")
    public long getAllCI()
    {
        return 1;
    }
}
