package com.jiumaojiu.datax.kafka;

import com.alibaba.datax.common.spi.ErrorCode;

/**
 * <pre>
 * KafkaWriterErrorCode
 * </pre>
 *
 * @author by liangqinghai@jiumaojiu.com
 * @since 2021/6/17 18:02
 */
public enum KafkaWriterErrorCode implements ErrorCode {

    //
    REQUIRED_VALUE("KafkaWriter-00", "您缺失了必须填写的参数值."),
    CREATE_TOPIC("KafkaWriter-01", "写入数据前检查topic或是创建topic失败.");

    private final String code;
    private final String description;

    private KafkaWriterErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return String.format("Code:[%s], Description:[%s].", this.code,
                this.description);
    }

}
