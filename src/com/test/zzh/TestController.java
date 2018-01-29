package com.test.zzh;

import com.utiles.CreateImageCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 二狗子 on 2018/1/16 0016.
 */
@Controller
@RequestMapping(value = "hello",method = RequestMethod.GET)
public class TestController {

    @RequestMapping("hello")
    public String helloWorld(){
        return "test/hello";
    }

    @RequestMapping("hello2")
    @ResponseBody
    public String helloWorld2(){
        String str ="ddsddddddddddddddddddddd";
        return str;
    }

    @RequestMapping("image")
    public void getImage(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{

//        设置响应的类型格式为图片格式
        response.setContentType("image/jpeg");
        //禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);


        CreateImageCode vCode = new CreateImageCode(130,40,4,5);
        session.setAttribute("code", vCode.getCode());
        vCode.write(response.getOutputStream());
    }

    public static void main(String[] args) {
//        System.out.println("打印main方法中的输入参数！");
//        for(int i=0;i<args.length;i++){
//            System.out.println(args[i]);
//        }
        //下面是完整的程序,代码如下。(选择排序)
        int[] Interray={12,1145,68,43,40,57,3,20};
        int keyValue;
        int index;
        int temp;
        System.out.println("排序前的数组");
        for(int i=0; i<Interray.length; i++){
            System.out.println(Interray[i]+"");
            System.out.println("");
        }
        for (int i = 0; i <Interray.length; i++) {
            index = i;
            keyValue = Interray[i];
            for (int j = i; j <Interray.length ; j++) {
                if (keyValue>Interray[j]){
                    index = j;
                    keyValue = Interray[j];
                }
            }
            temp = Interray[i];
            Interray[i]=keyValue;
            Interray[index] = temp;
        }
        System.out.println("排序后的数组");
        for (int i = 0; i < Interray.length; i++) {
            System.out.println(Interray[i]);
        }

        //冒泡排序
        for (int i = 0; i <Interray.length ; i++) {
            for (int j = i; j <Interray.length ; j++) {
                if (Interray[j]<Interray[i]){
                    temp = Interray[i];
                    Interray[i] = Interray[j];
                    Interray[j] = temp;
                }
            }
        }
        System.out.println("冒泡排序后的数组");
        for (int i = 0; i <Interray.length ; i++) {
            System.out.println(Interray[i]);
        }

    }
}
