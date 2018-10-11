package top.linjingc.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.linjingc.dao.freezerDao;
import top.linjingc.vo.freezer;

import javax.annotation.Resource;
import java.util.List;


@Service
public class freezerServer {
    private static Logger loger = LoggerFactory.getLogger(freezerServer.class);
    @Resource
    private freezerDao freezerDao;

    /**
     * 查询定制化的pizza 必胜客
     */
    @Transactional(rollbackFor=Exception.class)
    public List<freezer> list(){
        loger.info("没有缓存所有列表");
         return freezerDao.list();
    }







    @Cacheable(value ="pizza" ,key="#name+#type")  //查看Eheache缓存
   // @CachePut(key = "#p0")  //更新缓存
   // @CacheEvict(key = "#p0")    //移除缓存
    @Transactional()
    public List<freezer> findName(String name,Long type){
        loger.info("****************数据库进行查询****************");
        return freezerDao.findName(name,type);
    }

}
