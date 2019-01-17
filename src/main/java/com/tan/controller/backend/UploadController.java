package com.tan.controller.backend;

import com.tan.common.ServerResponse;
import com.tan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/manage/product")
public class UploadController {
    @Autowired
    private IProductService iProductService;
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String upload(){
        return "upload";//逻辑视图
    }
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse upload(@RequestParam(value = "upload_file",required = false) MultipartFile multipartFile){
        String path = "/usr/tj/ftpTemp";
        /*String path ="C:/FTPfile";*/
        ServerResponse serverResponse = iProductService.upload(path,multipartFile);
        return serverResponse;
    }


}
