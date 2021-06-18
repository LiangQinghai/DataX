package com.jiumaojiu.datax.kafka;

/**
 * <pre>
 * WriteType
 * </pre>
 *
 * @author by liangqinghai@jiumaojiu.com
 * @since 2021/6/17 18:04
 */
public enum WriteType {
    //
    JSON("json"),
    TEXT("text");

    private String name;

    WriteType(String name) {
        this.name = name;
    }
}
