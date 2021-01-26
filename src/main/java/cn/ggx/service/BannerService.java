package cn.ggx.service;

import cn.ggx.dao.BannerDao;
import cn.ggx.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BannerService {
    @Autowired
    BannerDao bannerDao ;

    public List<Banner> findBannerAll(){
        List<Banner> bannerAll = bannerDao.findBannerAll();
        return bannerAll ;
    }
}
