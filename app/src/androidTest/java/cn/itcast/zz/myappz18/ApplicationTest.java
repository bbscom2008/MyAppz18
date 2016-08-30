package cn.itcast.zz.myappz18;

import android.app.Application;
import android.test.ApplicationTestCase;

import cn.itcast.zz.mylibrary.MyUtils;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }


    public void test(){

        Test.test();

    }

    public void myttt(){

        MyUtils.logleo("hello test");

    }


}