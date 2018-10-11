package top.linjingc.Controller;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.linjingc.server.freezerServer;
import top.linjingc.utils.JacksonUitl;
import top.linjingc.utils.JsonResult;
import top.linjingc.utils.RedisDao;
import top.linjingc.vo.freezer;

import java.util.List;

@RequestMapping("freezer")
@Controller
public class freezerController {
@Autowired
private freezerServer freezerServer;
@Autowired
private RedisDao redisDao;

    @Autowired
    private StringRedisTemplate template;

    /**
     * 显示所有的冷冻库材料
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list() {
        //测试redis 缓存
        redisDao.setKey("test","1");
        return redisDao.getValue("test");
    }






    @RequestMapping(value={"/goFrzzer"},method= RequestMethod.POST, produces="application/json;charset=UTF-8")
    @ResponseBody
    public JsonResult goFrzzer(@RequestBody freezer freezer){
        //根据type区分
        List free;
      if(StringUtils.isNotBlank(redisDao.getValue(freezer.getName()+freezer.getType()))){
          //todo 缓存到redis中了
                  System.out.println("###################################");
                  System.out.println( "redis已经缓存了数据"+"------"+redisDao.getValue(freezer.getName()+freezer.getType()));
                  System.out.println("###################################");
          //整合JackSon工具类
          free= JacksonUitl.JsonToArray(freezer.class,redisDao.getValue(freezer.getName()+freezer.getType()));
          return JsonResult.success(free);

      }else{

          //todo 没缓存
          free=freezerServer.findName(freezer.getName(),freezer.getType());
          //添加redis缓存
          //整合JackSon工具类
          String Json= JacksonUitl.ObjectToJson(free);
          redisDao.setKey(freezer.getName()+freezer.getType(),Json);
      }

        return JsonResult.success(free);
    }

}
