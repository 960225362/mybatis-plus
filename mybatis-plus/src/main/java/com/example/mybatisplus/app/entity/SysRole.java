package com.example.mybatisplus.app.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author shanshanlaichi
 * @since 2020-02-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     */
    private String role;

    /**
     * 插入时间
     */
    private LocalDateTime createdTime;

    /**
     * 插入人
     */
    private String createdBy;

    /**
     * 修改时间
     */
    private LocalDateTime modifiedTime;

    /**
     * 修改人
     */
    private String modifiedBy;

    /**
     * 逻辑删除标识，1:正常状态，0:删除状态
     */
    private Integer deleteFlag;


}
