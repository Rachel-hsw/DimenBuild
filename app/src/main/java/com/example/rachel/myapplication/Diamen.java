package com.example.rachel.myapplication;

//import com.mango.dimen.DimensBuild;
import com.mango.dimen.DimensBuild3;

/**
 * Created by Rachel on 2019/2/15.
 */

public class Diamen {
    public static void main(String[] args){

        //下面两种方法任选其一，具体参数信息见代码
        //也可以自己写
        DimensBuild2.buildPX();
        //可以添加依赖后直接调用（或者作为jar放到libs目录下调用）这种方式不允许修改源码
//        DimensBuild.buildDP();
        //也可以源码下载下来,作为library库导入到AS当中（File->new->new model->导入之后，为主model添加对这个库的依赖->project structure->dependencies）
        DimensBuild3.buildPX();

    }
}
