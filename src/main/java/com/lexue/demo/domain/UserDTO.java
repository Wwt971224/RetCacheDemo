package com.lexue.demo.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    /**
     * 主键用户id
     */
    private Long userId;

    /**
     * 用户真实姓名
     */
    private String realName;

    /**
     * 乐学id
     */
    private String leId;

    /**
     * 用户手机号
     */
    private Long userMobile;
}
