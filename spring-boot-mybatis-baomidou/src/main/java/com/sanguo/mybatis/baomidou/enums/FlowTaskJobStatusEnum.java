package com.sanguo.mybatis.baomidou.enums;

/**
 *  任务job状态
 */
public enum FlowTaskJobStatusEnum {
    DOING(1, "执行中"),
    DONE(2, "执行完成"),
    FAIL(99, "执行失败");

    public Integer code;
    public String label;

    FlowTaskJobStatusEnum(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel(Byte code){
        for (FlowTaskJobStatusEnum sku_type : FlowTaskJobStatusEnum.values()) {
            if (sku_type.code.equals(code) ) {
                return sku_type.label;
            }
        }
        return null;
    }

}
