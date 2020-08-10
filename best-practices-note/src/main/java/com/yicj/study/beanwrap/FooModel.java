package com.yicj.study.beanwrap;

import lombok.Data;
import org.springframework.core.io.Resource;

import java.util.Date;


/**
 * ClassName: FooModel
 * Description: TODO(描述)
 * Date: 2020/8/10 20:46
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Data
public class FooModel {
    private Resource location ;
    private Date date ;
    private String surname ;
    private String age ;
}