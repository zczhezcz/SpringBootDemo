package com.sanguo.mybatis.baomidou.enums;

/**
 *  任务状态
 */
public enum FlowTaskStatusEnum {
    INIT(0, "初始化"),
    DOING(1, "执行中"),
    DONE(2, "执行完成");

    public Integer code;
    public String label;

    FlowTaskStatusEnum(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel(Byte code){
        for (FlowTaskStatusEnum sku_type : FlowTaskStatusEnum.values()) {
            if (sku_type.code.equals(code)) {
                return sku_type.label;
            }
        }
        return null;
    }

}
