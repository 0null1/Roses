package com.stylefeng.roses.core.utils;

import com.alibaba.fastjson.JSON;
import com.stylefeng.roses.core.exception.BizException;
import com.stylefeng.roses.core.exception.BizExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 *
 * @author fengshuonan
 * @date 2017-08-25 14:13
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new BizException(BizExceptionEnum.WRITE_ERROR);
        }
    }
}
