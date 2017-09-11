package com.stc.ConfigItem.Controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.stc.ConfigItem.Domain.CIEntity;
import com.stc.ConfigItem.Repository.CIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ConfigItem")
public class CIController
{
    @Autowired
    private CIRepository ciRepo;


    /**
     * 传统传参方式进行添加，非restful
     * @param name
     * @param code
     * @param projectId
     * @return
     */
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public CIEntity addConfigItem(@RequestParam("name") String name,@RequestParam("code") String code,@RequestParam("projectId") long projectId)
    {
       return new CIEntity(ciRepo).addConfigItem(name,code,projectId);
    }

    /**
     * 添加配置项
     * @param ci
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public CIEntity addConfigItem(@RequestBody CIEntity ci)
    {
        return  new CIEntity(ciRepo).addConfigItem(ci);
    }

    /**
     * 删除配置项
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public boolean deleteConfigItem(@PathVariable("id") long id)
    {
        return new CIEntity(ciRepo).deleteConfigItem(id);
    }

    /**
     * 根据项目id 查询配置项
     * @param projectId
     * @return
     */
    @RequestMapping(value="/query/project/{projectId}",method = RequestMethod.GET)
    public List<CIEntity> findCIByProject(@PathVariable("projectId") Long projectId)
    {
        return new CIEntity(ciRepo).findCIByProject(projectId);
    }

    /**
     * 查询所有配置项
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<CIEntity> findAllCI()
    {
        return new CIEntity(ciRepo).findAllCI();
    }

    /**
     * 更新配置项
     * @param ci
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public boolean updateCI(@RequestBody CIEntity ci)
    {
        return new CIEntity(ciRepo).updateCI(ci);
    }
}
