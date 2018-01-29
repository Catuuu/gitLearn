package com.test.zzh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

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
