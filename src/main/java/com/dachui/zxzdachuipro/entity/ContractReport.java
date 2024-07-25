package com.dachui.zxzdachuipro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 主合同跟踪报表
 * </p>
 *
 * @author Baomidou
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("contract_report")
public class ContractReport implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 合同类型00全部；01供零合同；02联营合同
     */
    private String contractBizType;

    /**
     * 课组类型00全部；01食百；02生鲜
     */
    private String contractTypeCode;

    /**
     * 报表日期yyyy-MM-dd
     */
    private LocalDate reportDate;

    /**
     * 采购组织编码
     */
    private String purchaseOrgCode;

    /**
     * 采购组织名称
     */
    private String purchaseOrgName;

    /**
     * 部类编码
     */
    private String rootCategoryCode;

    /**
     * 部类名称
     */
    private String rootCategoryName;

    /**
     * 统计汇总信息JSON字符串
     */
    private String subtotalInfo;

    /**
     * 0:正常 1:删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;

    /**
     * 更新人
     */
    private String updatedBy;
}
