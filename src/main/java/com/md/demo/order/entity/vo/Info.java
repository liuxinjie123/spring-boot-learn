package com.md.demo.order.entity.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jack
 * @since 2020-09-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_info")
@ApiModel(value="Info对象", description="")
public class Info implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String acttype;

    private String alertkey;

    private String devtype;

    private String fixalarmlevel;

    private LocalDateTime issuedate;

    private String liabilitycity;

    private String location;

    private String networklevel;

    private String operationtype;

    private String returnresult;

    private String stickevent;

    private String suspectfaultreasonclass;

    private String suspectfaultreasonsection;

    private String tasktitle;

    private String tempstr3;

    private String tolllevel;

    private String worktip;

    private String wsid;


}
