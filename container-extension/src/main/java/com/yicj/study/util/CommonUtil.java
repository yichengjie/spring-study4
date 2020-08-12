package com.yicj.study.util;

import org.springframework.cglib.core.DebuggingClassWriter;

import java.io.File;

/**
 * ClassName: CommonUtil
 * Description: TODO(描述)
 * Date: 2020/8/12 20:05
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class CommonUtil {

    public static void displayDynamicClass(){
        String path = System.getProperty("user.dir") + File.separator + "classes" ;
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, path);
    }
}