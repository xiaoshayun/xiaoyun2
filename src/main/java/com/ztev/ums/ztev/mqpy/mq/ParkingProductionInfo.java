package com.ztev.ums.ztev.mqpy.mq;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import com.alibaba.fastjson.annotation.JSONField;
public class ParkingProductionInfo implements Serializable{
	/** 交易号  transactionNo **/
    private String transactionNo;

    /** 车牌号  licenseNo **/
    private String licenseNo;

    /** 姓名  useName **/
    private String useName;

    /** 停车场  parkingProduction **/
    private String parkingProduction;

    /** 操作员  operater **/
    private String operater;

    /** 入场时间  enterTime **/
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date enterTime;

    /** 入口通道名称  entranceName **/
    private String entranceName;

    /** 离场时间  leaveTime **/
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date leaveTime;

    /** 离场通道名称  departureChannel **/
    private String departureChannel;

    /** "1"表示线下已结算，"2"表示申请线上结算,"3"表示两者都有  settlementFlag **/
    private String settlementFlag;

    /** parkTime	停车时长,单位分钟  parkTime **/
    private Integer parkTime;

    /** 实收  totalFee **/
    private BigDecimal totalFee;

    /** 应收  paidTotal **/
    private BigDecimal paidTotal;

    /** "0"表示没有修改,"1"表示有修改  isChange **/
    private String isChange;

    /** 车牌更改时间  changeTime **/
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date changeTime;

    /** 图片名称  inImage **/
    private String inImage;

    /** 原始车牌号  oldLicenseNo **/
    private String oldLicenseNo;

    /** 备注  remark **/
    private String remark;

    /** 是否已经离场 0:没有 1:已经离场  leaveFlag **/
    private String leaveFlag;

    /**   tableName: parking_production_info   **/
    private static final long serialVersionUID = 1L;

    
    
    public ParkingProductionInfo() {
		super();
	}
    
    //入场进行数据初始化
	public ParkingProductionInfo(String transactionNo, String licenseNo, String useName, String parkingProduction,
			String operater, Date enterTime, String entranceName, String isChange, String inImage,
			String oldLicenseNo,String leaveFlag) {
		super();
		this.transactionNo = transactionNo;
		this.licenseNo = licenseNo;
		this.useName = useName;
		this.parkingProduction = parkingProduction;
		this.operater = operater;
		this.enterTime = enterTime;
		this.entranceName = entranceName;
		this.isChange = isChange;
		this.inImage = inImage;
		this.oldLicenseNo = oldLicenseNo;
		this.leaveFlag = leaveFlag;
	}
    
	
	
	
	//自定义数据==start==
	String leaveTimeMin,leaveTimeMax;	//离开时间
	String changeTimeMin,changeTimeMax;//车牌改变时间
	String enterTimeMin,enterTimeMax;//入场时间
	String msg_stage;
	//自定义数据==end==
	
    public String getLeaveTimeMin() {
		return leaveTimeMin;
	}

	public String getMsg_stage() {
		return msg_stage;
	}

	public void setMsg_stage(String msg_stage) {
		this.msg_stage = msg_stage;
	}

	public void setLeaveTimeMin(String leaveTimeMin) {
		this.leaveTimeMin = leaveTimeMin;
	}

	public String getLeaveTimeMax() {
		return leaveTimeMax;
	}

	public void setLeaveTimeMax(String leaveTimeMax) {
		this.leaveTimeMax = leaveTimeMax;
	}
	public String getChangeTimeMin() {
		return changeTimeMin;
	}

	public void setChangeTimeMin(String changeTimeMin) {
		this.changeTimeMin = changeTimeMin;
	}

	public String getChangeTimeMax() {
		return changeTimeMax;
	}

	public void setChangeTimeMax(String changeTimeMax) {
		this.changeTimeMax = changeTimeMax;
	}

	public String getEnterTimeMin() {
		return enterTimeMin;
	}

	public void setEnterTimeMin(String enterTimeMin) {
		this.enterTimeMin = enterTimeMin;
	}

	public String getEnterTimeMax() {
		return enterTimeMax;
	}

	public void setEnterTimeMax(String enterTimeMax) {
		this.enterTimeMax = enterTimeMax;
	}
	
	/**   交易号  transactionNo   **/
    public String getTransactionNo() {
        return transactionNo;
    }

    /**   交易号  transactionNo   **/
    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo == null ? null : transactionNo.trim();
    }

    /**   车牌号  licenseNo   **/
    public String getLicenseNo() {
        return licenseNo;
    }

    /**   车牌号  licenseNo   **/
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    /**   姓名  useName   **/
    public String getUseName() {
        return useName;
    }

    /**   姓名  useName   **/
    public void setUseName(String useName) {
        this.useName = useName == null ? null : useName.trim();
    }

    /**   停车场  parkingProduction   **/
    public String getParkingProduction() {
        return parkingProduction;
    }

    /**   停车场  parkingProduction   **/
    public void setParkingProduction(String parkingProduction) {
        this.parkingProduction = parkingProduction == null ? null : parkingProduction.trim();
    }

    /**   操作员  operater   **/
    public String getOperater() {
        return operater;
    }

    /**   操作员  operater   **/
    public void setOperater(String operater) {
        this.operater = operater == null ? null : operater.trim();
    }

    /**   入场时间  enterTime   **/
    public Date getEnterTime() {
        return enterTime;
    }

    /**   入场时间  enterTime   **/
    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    /**   入口通道名称  entranceName   **/
    public String getEntranceName() {
        return entranceName;
    }

    /**   入口通道名称  entranceName   **/
    public void setEntranceName(String entranceName) {
        this.entranceName = entranceName == null ? null : entranceName.trim();
    }

    /**   离场时间  leaveTime   **/
    public Date getLeaveTime() {
        return leaveTime;
    }

    /**   离场时间  leaveTime   **/
    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**   离场通道名称  departureChannel   **/
    public String getDepartureChannel() {
        return departureChannel;
    }

    /**   离场通道名称  departureChannel   **/
    public void setDepartureChannel(String departureChannel) {
        this.departureChannel = departureChannel == null ? null : departureChannel.trim();
    }

    /**   "1"表示线下已结算，"2"表示申请线上结算,"3"表示两者都有  settlementFlag   **/
    public String getSettlementFlag() {
        return settlementFlag;
    }

    /**   "1"表示线下已结算，"2"表示申请线上结算,"3"表示两者都有  settlementFlag   **/
    public void setSettlementFlag(String settlementFlag) {
        this.settlementFlag = settlementFlag == null ? null : settlementFlag.trim();
    }

    /**   parkTime	停车时长,单位分钟  parkTime   **/
    public Integer getParkTime() {
        return parkTime;
    }

    /**   parkTime	停车时长,单位分钟  parkTime   **/
    public void setParkTime(Integer parkTime) {
        this.parkTime = parkTime;
    }

    /**   实收  totalFee   **/
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**   实收  totalFee   **/
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**   应收  paidTotal   **/
    public BigDecimal getPaidTotal() {
        return paidTotal;
    }

    /**   应收  paidTotal   **/
    public void setPaidTotal(BigDecimal paidTotal) {
        this.paidTotal = paidTotal;
    }

    /**   "0"表示没有修改,"1"表示有修改  isChange   **/
    public String getIsChange() {
        return isChange;
    }

    /**   "0"表示没有修改,"1"表示有修改  isChange   **/
    public void setIsChange(String isChange) {
        this.isChange = isChange == null ? null : isChange.trim();
    }

    /**   车牌更改时间  changeTime   **/
    public Date getChangeTime() {
        return changeTime;
    }

    /**   车牌更改时间  changeTime   **/
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    /**   图片名称  inImage   **/
    public String getInImage() {
        return inImage;
    }

    /**   图片名称  inImage   **/
    public void setInImage(String inImage) {
        this.inImage = inImage == null ? null : inImage.trim();
    }

    /**   原始车牌号  oldLicenseNo   **/
    public String getOldLicenseNo() {
        return oldLicenseNo;
    }

    /**   原始车牌号  oldLicenseNo   **/
    public void setOldLicenseNo(String oldLicenseNo) {
        this.oldLicenseNo = oldLicenseNo == null ? null : oldLicenseNo.trim();
    }

    /**   备注  remark   **/
    public String getRemark() {
        return remark;
    }

    /**   备注  remark   **/
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**   是否已经离场 0:没有 1:已经离场  leaveFlag   **/
    public String getLeaveFlag() {
        return leaveFlag;
    }

    /**   是否已经离场 0:没有 1:已经离场  leaveFlag   **/
    public void setLeaveFlag(String leaveFlag) {
        this.leaveFlag = leaveFlag == null ? null : leaveFlag.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transactionNo=").append(transactionNo);
        sb.append(", licenseNo=").append(licenseNo);
        sb.append(", useName=").append(useName);
        sb.append(", parkingProduction=").append(parkingProduction);
        sb.append(", operater=").append(operater);
        sb.append(", enterTime=").append(enterTime);
        sb.append(", entranceName=").append(entranceName);
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", departureChannel=").append(departureChannel);
        sb.append(", settlementFlag=").append(settlementFlag);
        sb.append(", parkTime=").append(parkTime);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", paidTotal=").append(paidTotal);
        sb.append(", isChange=").append(isChange);
        sb.append(", changeTime=").append(changeTime);
        sb.append(", inImage=").append(inImage);
        sb.append(", oldLicenseNo=").append(oldLicenseNo);
        sb.append(", remark=").append(remark);
        sb.append(", leaveFlag=").append(leaveFlag);
        sb.append("]");
        return sb.toString();
    }
}