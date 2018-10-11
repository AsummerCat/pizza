package top.linjingc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String searchIndex() {
        return "search";
    }



}
