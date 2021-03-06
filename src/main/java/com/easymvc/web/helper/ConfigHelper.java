package com.easymvc.web.helper;
/**
 * @author softwareluke
 */
import java.util.Properties;

import com.easymvc.web.Constant;
import com.easymvc.web.utils.PropsUtil;

/**
 * 获取配置文件属性
 */
public class ConfigHelper {

    private static final Properties CONFIG_PROPS = PropsUtil.loadProps("config.properties");

    /**
     * 获取应用基础包名
     *
     * @return
     */
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS, Constant.APP_BASE_PACKAGE);
    }

    /**
     * 获取JSP路径
     *
     * @return
     */
    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPS, Constant.APP_JSP_PATH, "/WEB-INF/jsp/");
    }

    /**
     * 获取应用静态资源路径
     *
     * @return
     */
    public static String getAppAssetPath() {
        return PropsUtil.getString(CONFIG_PROPS, Constant.APP_ASSET_PATH, "/asset/");
    }

}
