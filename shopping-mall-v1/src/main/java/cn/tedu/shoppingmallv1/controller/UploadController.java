package cn.tedu.shoppingmallv1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {
    // application.properties 配置文件中读取saveDir赋值给成员变量
    @Value("${saveDir}")
    private String saveRoot;

    /**
     * 上传和 delete方法
     * /upload/avatar
     * /upload/comment/imgs
     * /upload/product/imgs
     * /upload/product/cover
     */
    private String getSaveName(MultipartFile picFile){
        String originName = picFile.getOriginalFilename();
        // 获取后缀
        String suffix = originName.substring(originName.lastIndexOf("."));
        // 转换成hash名的存储名
        return UUID.randomUUID()+suffix;
    }

    @RequestMapping("/upload/avatar")
    public String uploadAvatar(MultipartFile avatar) throws IOException{
        File saveDir = new File(saveRoot,"avatar");
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        // 保存到 mall/public/avatar;
        avatar.transferTo(saveDir);
        // 返回这个 hash文件名 给前端显示
        String saveName = getSaveName(avatar);
        return saveName;
    }

    @RequestMapping("/delete/avatar")
    public void deleteAvatar(String name){
        String savePath = saveRoot+"/avatar/"+name;
        new File(savePath).delete();
    }


    @RequestMapping("/upload/product/cover")
    public String uploadProductCover(MultipartFile cover) throws IOException{
        File saveDir = new File(saveRoot+"/product/cover");
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        // 保存到 mall/public/avatar;
        cover.transferTo(saveDir);
        // 返回这个 hash文件名 给前端显示
        String saveName = getSaveName(cover);
        return saveName;
    }

    @RequestMapping("/delete/product/cover")
    public void deleteProductCover(String name){
        String savePath = saveRoot+"/product/cover/"+name;
        new File(savePath).delete();
    }

    @RequestMapping("/upload/product/imgs")
    public String uploadProductImg(MultipartFile productImg) throws IOException{
        File saveDir = new File(saveRoot+"/product/imgs");
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        // 保存到 mall/public/avatar;
        productImg.transferTo(saveDir);
        // 返回这个 hash文件名 给前端显示
        String saveName = getSaveName(productImg);
        return saveName;
    }

    @RequestMapping("/delete/product/imgs")
    public void deleteProductImg(String name){
        String savePath = saveRoot+"/product/imgs/"+name;
        new File(savePath).delete();
    }

    @RequestMapping("/upload/comment/imgs")
    public String uploadCommentImg(MultipartFile commentImg) throws IOException{
        File saveDir = new File(saveRoot+"/comment/imgs");
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        // 保存到 mall/public/avatar;
        commentImg.transferTo(saveDir);
        // 返回这个 hash文件名 给前端显示
        String saveName = getSaveName(commentImg);
        return saveName;
    }

    @RequestMapping("/delete/product/imgs")
    public void deleteCommentImg(String name){
        String savePath = saveRoot+"/comment/imgs/"+name;
        new File(savePath).delete();
    }

    // 以下是修改方法是在UserController和ProductController中进行===========================================================================
    /**
     * /upload/avatar/update
     * /upload/product/cover/update
     * /upload/product/imgs/update
     * "修改头像逻辑流程 :
     * 1.展示原头像: 前端根据用户id，GET请求用户头像数据(图片hash名)-img标签根据图片名找到图片地址展示
     * 2.上传新图片时，uploadController保存新图片并返回前端新hash名，并在前端展示。此时前端user变量里的avatar的值是新hash名，oldAvatar值存就头像的hash名。
     * 3.前端点击保存时，post请求UserController的upload的路径，对数据库中进行保存修改，通过把oldAvatar发送给UploadController。在磁盘中删除旧图片。
     * 4.前端点击取消时，UserController不作修改。调用UploadController中delete的方法，oldAvatar的值归还给avatar
     */

}
