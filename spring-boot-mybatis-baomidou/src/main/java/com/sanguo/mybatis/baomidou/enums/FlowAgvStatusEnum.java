package com.sanguo.mybatis.baomidou.enums;

/**
 *  agv 状态
 */
public enum FlowAgvStatusEnum {
    FREE( 0, "空闲"),
    BUSS(1, "非空闲"),
    CHARGE(2, "充电中");

    public Integer code;
    public String label;

    FlowAgvStatusEnum(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getLabel(Byte code){
        for (FlowAgvStatusEnum sku_type : FlowAgvStatusEnum.values()) {
            if (sku_type.code.equals(code)  ) {
                return sku_type.label;
            }
        }
        return null;
    }

}
