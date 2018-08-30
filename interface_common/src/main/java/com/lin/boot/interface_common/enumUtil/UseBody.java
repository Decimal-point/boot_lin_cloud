package com.lin.boot.interface_common.enumUtil;

public enum UseBody {
    SPEAKE(1),
    HAND(2),
    MOUSE(3);

    public Integer type;
    //枚举的构造方法必须是私有的
    private UseBody (Integer type){
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
