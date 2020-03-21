package com.cheng.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author NianCheng
 * @Date 2020/3/17 12:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult {
    private boolean success;
    private String message;
    private Object obj;
}
