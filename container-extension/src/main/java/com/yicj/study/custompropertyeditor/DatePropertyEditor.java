package com.yicj.study.custompropertyeditor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: DatePropertyEditor
 * Description: TODO(描述)
 * Date: 2020/8/8 17:29
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Data
@Slf4j
public class DatePropertyEditor extends PropertyEditorSupport {
    private String format = "yyyy-MM-dd";

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        log.info("text :{}" , text);
        SimpleDateFormat format = new SimpleDateFormat(getFormat()) ;
        try {
            Date date = format.parse(text);
            this.setValue(date);
        } catch (ParseException e) {
            log.error("error : ", e);
        }
    }

}