package com.example.baselibrary.helper;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

public class ARouterHelper {

    private static volatile ARouterHelper mInstance = null;

    private ARouterHelper() {
    }

    public static ARouterHelper getInstance() {
        if (mInstance == null) {
            synchronized (ARouterHelper.class) {
                if (mInstance == null) {
                    mInstance = new ARouterHelper();
                }
            }
        }
        return mInstance;
    }

    //-------------------------M1_Module-------------------------
    public static final String PATH_M1_RUN = "/Home_library/M1_Activity";

    //-------------------------M2_Module-------------------------
    public static final String PATH_M2_RUN = "/M_library/M2_Activity";

    //-------------------------M3_Module-------------------------
    public static final String PATH_M3_RUN = "/Friends_library/M3Activity";

    //-------------------------m4_Module-------------------------
    public static final String PATH_M4_RUN = "/L_library/M4Activity";

    /**
     * 直接跳转
     *
     * @param path
     */
    public void build(String path) {
        ARouter.getInstance().build(path).navigation();
    }

    /**
     * 跳转有回调
     *
     * @param path
     * @param mActivity
     * @param requestCode
     */
    public void build(String path, Activity mActivity, int requestCode) {
        ARouter.getInstance().build(path).navigation(mActivity, requestCode);
    }

    /**
     * 跳转传递参数
     *
     * @param path
     * @param key
     * @param values
     */
    public void build(String path, String key, String values) {
        ARouter.getInstance().build(path)
                .withString(key, values)
                .navigation();
    }

    /**
     * 跳转传递参数
     *
     * @param path
     * @param bundle
     */
    public void build(String path, Bundle bundle) {
        ARouter.getInstance().build(path)
                .with(bundle)
                .navigation();
    }

}
