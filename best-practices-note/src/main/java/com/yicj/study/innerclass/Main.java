package com.yicj.study.innerclass;

/**
 * ClassName: Main
 * Description: TODO(描述)
 * Date: 2020/8/13 17:00
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Main {

    public static void main(String[] args) {

        OuterClassA.InnerClassB innerClassB = new OuterClassA.InnerClassB(){
            @Override
            public void execute() {

            }
        };
    }
}