package com.yicj.mybatis.model;

import lombok.Data;

/**
 * ClassName: User
 * Description: TODO(描述)
 * Date: 2020/8/9 17:16
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Data
public class User {
    private String id ;
    private String username ;
    private String password ;
    private String roles ;
}