package com.yicj.study.conversionservice;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

/**
 * ClassName: String2DateConverter
 * Description: TODO(描述)
 * Date: 2020/8/8 15:47
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class String2DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        try {
            return DateUtils.parseDate(source, "yyyy-MM-dd HH:mm:ss") ;
        } catch (ParseException e) {
            log.info("convert str {} to date error :{}", source, e.getMessage());
            return null ;
        }
    }
}