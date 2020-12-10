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

    //-------------------------N_Module-------------------------
    public static final String PATH_N_RUN = "/N_library/N_Activity";

    //-------------------------M_Module-------------------------
    public static final String PATH_M_RUN = "/M_library/M_Activity";

    //-------------------------S_Module-------------------------
    public static final String PATH_S_RUN = "/S_library/S_Activity";

    //-------------------------L_Module-------------------------
    public static final String PATH_L_RUN = "/L_library/L_Activity";

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
