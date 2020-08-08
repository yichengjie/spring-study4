package com.yicj.study.conversionservice;

import com.yicj.study.foo.model.PhoneNumberModel;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/8 15:52
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {
        DefaultConversionService conversionService = new DefaultConversionService() ;
        conversionService.addConverter(new String2PhoneNumberConverter());
        String phoneNumberStr = "010-12345678" ;
        PhoneNumberModel phoneNumber = conversionService.convert(phoneNumberStr, PhoneNumberModel.class) ;
        System.out.println(phoneNumber);
    }
}