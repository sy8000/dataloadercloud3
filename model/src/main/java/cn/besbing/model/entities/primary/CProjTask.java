package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.Date;

public class CProjTask {
    private Long seqNum;

    private String project;

    private BigDecimal orderNumber;

    private String analysis;

    private Date changedOn;

    private String changedBy;

    private String description;

    private String sampleGroup;

    private String taskId;

    private Date startedDate;

    private Date createdDate;

    private Date completedDate;

    private Long testNumber;

    private String isEntered;

    private String testVariation;

    private Long planTestTime;

    private Long actualTestTime;

    private Long maxNumBatch;

    private BigDecimal baseFee;

    private BigDecimal testFee;

    private BigDecimal quotes;

    private BigDecimal actualTestFee;

    private BigDecimal actualTotalCost;

    private Long analysisVersion;

    private String isRecheck;

    private String recheckTo;

    private String extLink;

    private String ifPass;

    private String commentTech;

    private Long testQuantity;

    private String taskReportedName;

    private Date expiryDate;

    private String assginTo;

    private String lab;

    private BigDecimal redate;

    private String readyForReview;

    private String rptAssginTo;

    private String readyForDraft;

    private Date draftApplyOn;

    private String draftApplyBy;

    private Long reportNumber;

    private String assignedSample;

    private String assignedSampleDisplay;

    private Long assignedSampleQuantity;

    private Long additionalWorkHours;

    private BigDecimal surcharge;

    private BigDecimal actualBaseFee;

    private BigDecimal actualSurcharge;

    private Long actualTestQty;

    private String status;

    private String conclusion;

    private Date reviewedOn;

    private String rptAuthorizedBy;

    private Date rptAuthorizedOn;

    private String rptAuthorized;

    private String rptRejectCommentC;

    private String rptRejectCommentS;

    private String rptConclusion;

    private String cSubmitBy;

    private Date cSubmitDate;

    private String cCustomermanagerBy;

    private Date cCustomermanagerDate;

    private String cTechsupervisorBy;

    private Date cTechsupervisorDate;

    private String cQuotecreateBy;

    private Date cQuotecreateDate;

    private String cQuotesignatureBy;

    private Date cQuotesignatureDate;

    private String cQuotesendBy;

    private Date cQuotesendDate;

    private String cSamplereceiveBy;

    private Date cSamplereceiveDate;

    private String cArrangementBy;

    private Date cArrangementDate;

    private String cMonitorprocessBy;

    private Date cMonitorprocessDate;

    private String cAnalystStartBy;

    private Date cAnalystStartDate;

    private String cAnalystEndBy;

    private Date cAnalystEndDate;

    private String cAnalystSubmitBy;

    private Date cAnalystSubmitDate;

    private String cTechengineerCreateBy;

    private Date cTechengineerCreateDate;

    private String cTechengineerSubmitBy;

    private Date cTechengineerSubmitDate;

    private String cReportcreateBy;

    private Date cReportcreateDate;

    private String cReportsignatureBy;

    private Date cReportsignatureDate;

    private String cChargesendBy;

    private Date cChargesendDate;

    private String cChargecreateBy;

    private Date cChargecreateDate;

    private String cChargesignatureBy;

    private Date cChargesignatureDate;

    private String cNextPerson;

    private String cCurrentProcess;

    private String cSampleOutBy;

    private Date cSampleOutDate;

    private String cSampleInBy;

    private Date cSampleInDate;

    private String cSampleBorrowBy;

    private Date cSampleBorrowDate;

    private String cSampleReturnBy;

    private Date cSampleReturnDate;

    private Long reportNumberBak;

    private String ts;

    private String cIsDownparam;

    private String cAddress;

    public Long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Long seqNum) {
        this.seqNum = seqNum;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public BigDecimal getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(BigDecimal orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public Date getChangedOn() {
        return changedOn;
    }

    public void setChangedOn(Date changedOn) {
        this.changedOn = changedOn;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSampleGroup() {
        return sampleGroup;
    }

    public void setSampleGroup(String sampleGroup) {
        this.sampleGroup = sampleGroup;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Long getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Long testNumber) {
        this.testNumber = testNumber;
    }

    public String getIsEntered() {
        return isEntered;
    }

    public void setIsEntered(String isEntered) {
        this.isEntered = isEntered;
    }

    public String getTestVariation() {
        return testVariation;
    }

    public void setTestVariation(String testVariation) {
        this.testVariation = testVariation;
    }

    public Long getPlanTestTime() {
        return planTestTime;
    }

    public void setPlanTestTime(Long planTestTime) {
        this.planTestTime = planTestTime;
    }

    public Long getActualTestTime() {
        return actualTestTime;
    }

    public void setActualTestTime(Long actualTestTime) {
        this.actualTestTime = actualTestTime;
    }

    public Long getMaxNumBatch() {
        return maxNumBatch;
    }

    public void setMaxNumBatch(Long maxNumBatch) {
        this.maxNumBatch = maxNumBatch;
    }

    public BigDecimal getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(BigDecimal baseFee) {
        this.baseFee = baseFee;
    }

    public BigDecimal getTestFee() {
        return testFee;
    }

    public void setTestFee(BigDecimal testFee) {
        this.testFee = testFee;
    }

    public BigDecimal getQuotes() {
        return quotes;
    }

    public void setQuotes(BigDecimal quotes) {
        this.quotes = quotes;
    }

    public BigDecimal getActualTestFee() {
        return actualTestFee;
    }

    public void setActualTestFee(BigDecimal actualTestFee) {
        this.actualTestFee = actualTestFee;
    }

    public BigDecimal getActualTotalCost() {
        return actualTotalCost;
    }

    public void setActualTotalCost(BigDecimal actualTotalCost) {
        this.actualTotalCost = actualTotalCost;
    }

    public Long getAnalysisVersion() {
        return analysisVersion;
    }

    public void setAnalysisVersion(Long analysisVersion) {
        this.analysisVersion = analysisVersion;
    }

    public String getIsRecheck() {
        return isRecheck;
    }

    public void setIsRecheck(String isRecheck) {
        this.isRecheck = isRecheck;
    }

    public String getRecheckTo() {
        return recheckTo;
    }

    public void setRecheckTo(String recheckTo) {
        this.recheckTo = recheckTo;
    }

    public String getExtLink() {
        return extLink;
    }

    public void setExtLink(String extLink) {
        this.extLink = extLink;
    }

    public String getIfPass() {
        return ifPass;
    }

    public void setIfPass(String ifPass) {
        this.ifPass = ifPass;
    }

    public String getCommentTech() {
        return commentTech;
    }

    public void setCommentTech(String commentTech) {
        this.commentTech = commentTech;
    }

    public Long getTestQuantity() {
        return testQuantity;
    }

    public void setTestQuantity(Long testQuantity) {
        this.testQuantity = testQuantity;
    }

    public String getTaskReportedName() {
        return taskReportedName;
    }

    public void setTaskReportedName(String taskReportedName) {
        this.taskReportedName = taskReportedName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getAssginTo() {
        return assginTo;
    }

    public void setAssginTo(String assginTo) {
        this.assginTo = assginTo;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public BigDecimal getRedate() {
        return redate;
    }

    public void setRedate(BigDecimal redate) {
        this.redate = redate;
    }

    public String getReadyForReview() {
        return readyForReview;
    }

    public void setReadyForReview(String readyForReview) {
        this.readyForReview = readyForReview;
    }

    public String getRptAssginTo() {
        return rptAssginTo;
    }

    public void setRptAssginTo(String rptAssginTo) {
        this.rptAssginTo = rptAssginTo;
    }

    public String getReadyForDraft() {
        return readyForDraft;
    }

    public void setReadyForDraft(String readyForDraft) {
        this.readyForDraft = readyForDraft;
    }

    public Date getDraftApplyOn() {
        return draftApplyOn;
    }

    public void setDraftApplyOn(Date draftApplyOn) {
        this.draftApplyOn = draftApplyOn;
    }

    public String getDraftApplyBy() {
        return draftApplyBy;
    }

    public void setDraftApplyBy(String draftApplyBy) {
        this.draftApplyBy = draftApplyBy;
    }

    public Long getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(Long reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getAssignedSample() {
        return assignedSample;
    }

    public void setAssignedSample(String assignedSample) {
        this.assignedSample = assignedSample;
    }

    public String getAssignedSampleDisplay() {
        return assignedSampleDisplay;
    }

    public void setAssignedSampleDisplay(String assignedSampleDisplay) {
        this.assignedSampleDisplay = assignedSampleDisplay;
    }

    public Long getAssignedSampleQuantity() {
        return assignedSampleQuantity;
    }

    public void setAssignedSampleQuantity(Long assignedSampleQuantity) {
        this.assignedSampleQuantity = assignedSampleQuantity;
    }

    public Long getAdditionalWorkHours() {
        return additionalWorkHours;
    }

    public void setAdditionalWorkHours(Long additionalWorkHours) {
        this.additionalWorkHours = additionalWorkHours;
    }

    public BigDecimal getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(BigDecimal surcharge) {
        this.surcharge = surcharge;
    }

    public BigDecimal getActualBaseFee() {
        return actualBaseFee;
    }

    public void setActualBaseFee(BigDecimal actualBaseFee) {
        this.actualBaseFee = actualBaseFee;
    }

    public BigDecimal getActualSurcharge() {
        return actualSurcharge;
    }

    public void setActualSurcharge(BigDecimal actualSurcharge) {
        this.actualSurcharge = actualSurcharge;
    }

    public Long getActualTestQty() {
        return actualTestQty;
    }

    public void setActualTestQty(Long actualTestQty) {
        this.actualTestQty = actualTestQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Date getReviewedOn() {
        return reviewedOn;
    }

    public void setReviewedOn(Date reviewedOn) {
        this.reviewedOn = reviewedOn;
    }

    public String getRptAuthorizedBy() {
        return rptAuthorizedBy;
    }

    public void setRptAuthorizedBy(String rptAuthorizedBy) {
        this.rptAuthorizedBy = rptAuthorizedBy;
    }

    public Date getRptAuthorizedOn() {
        return rptAuthorizedOn;
    }

    public void setRptAuthorizedOn(Date rptAuthorizedOn) {
        this.rptAuthorizedOn = rptAuthorizedOn;
    }

    public String getRptAuthorized() {
        return rptAuthorized;
    }

    public void setRptAuthorized(String rptAuthorized) {
        this.rptAuthorized = rptAuthorized;
    }

    public String getRptRejectCommentC() {
        return rptRejectCommentC;
    }

    public void setRptRejectCommentC(String rptRejectCommentC) {
        this.rptRejectCommentC = rptRejectCommentC;
    }

    public String getRptRejectCommentS() {
        return rptRejectCommentS;
    }

    public void setRptRejectCommentS(String rptRejectCommentS) {
        this.rptRejectCommentS = rptRejectCommentS;
    }

    public String getRptConclusion() {
        return rptConclusion;
    }

    public void setRptConclusion(String rptConclusion) {
        this.rptConclusion = rptConclusion;
    }

    public String getcSubmitBy() {
        return cSubmitBy;
    }

    public void setcSubmitBy(String cSubmitBy) {
        this.cSubmitBy = cSubmitBy;
    }

    public Date getcSubmitDate() {
        return cSubmitDate;
    }

    public void setcSubmitDate(Date cSubmitDate) {
        this.cSubmitDate = cSubmitDate;
    }

    public String getcCustomermanagerBy() {
        return cCustomermanagerBy;
    }

    public void setcCustomermanagerBy(String cCustomermanagerBy) {
        this.cCustomermanagerBy = cCustomermanagerBy;
    }

    public Date getcCustomermanagerDate() {
        return cCustomermanagerDate;
    }

    public void setcCustomermanagerDate(Date cCustomermanagerDate) {
        this.cCustomermanagerDate = cCustomermanagerDate;
    }

    public String getcTechsupervisorBy() {
        return cTechsupervisorBy;
    }

    public void setcTechsupervisorBy(String cTechsupervisorBy) {
        this.cTechsupervisorBy = cTechsupervisorBy;
    }

    public Date getcTechsupervisorDate() {
        return cTechsupervisorDate;
    }

    public void setcTechsupervisorDate(Date cTechsupervisorDate) {
        this.cTechsupervisorDate = cTechsupervisorDate;
    }

    public String getcQuotecreateBy() {
        return cQuotecreateBy;
    }

    public void setcQuotecreateBy(String cQuotecreateBy) {
        this.cQuotecreateBy = cQuotecreateBy;
    }

    public Date getcQuotecreateDate() {
        return cQuotecreateDate;
    }

    public void setcQuotecreateDate(Date cQuotecreateDate) {
        this.cQuotecreateDate = cQuotecreateDate;
    }

    public String getcQuotesignatureBy() {
        return cQuotesignatureBy;
    }

    public void setcQuotesignatureBy(String cQuotesignatureBy) {
        this.cQuotesignatureBy = cQuotesignatureBy;
    }

    public Date getcQuotesignatureDate() {
        return cQuotesignatureDate;
    }

    public void setcQuotesignatureDate(Date cQuotesignatureDate) {
        this.cQuotesignatureDate = cQuotesignatureDate;
    }

    public String getcQuotesendBy() {
        return cQuotesendBy;
    }

    public void setcQuotesendBy(String cQuotesendBy) {
        this.cQuotesendBy = cQuotesendBy;
    }

    public Date getcQuotesendDate() {
        return cQuotesendDate;
    }

    public void setcQuotesendDate(Date cQuotesendDate) {
        this.cQuotesendDate = cQuotesendDate;
    }

    public String getcSamplereceiveBy() {
        return cSamplereceiveBy;
    }

    public void setcSamplereceiveBy(String cSamplereceiveBy) {
        this.cSamplereceiveBy = cSamplereceiveBy;
    }

    public Date getcSamplereceiveDate() {
        return cSamplereceiveDate;
    }

    public void setcSamplereceiveDate(Date cSamplereceiveDate) {
        this.cSamplereceiveDate = cSamplereceiveDate;
    }

    public String getcArrangementBy() {
        return cArrangementBy;
    }

    public void setcArrangementBy(String cArrangementBy) {
        this.cArrangementBy = cArrangementBy;
    }

    public Date getcArrangementDate() {
        return cArrangementDate;
    }

    public void setcArrangementDate(Date cArrangementDate) {
        this.cArrangementDate = cArrangementDate;
    }

    public String getcMonitorprocessBy() {
        return cMonitorprocessBy;
    }

    public void setcMonitorprocessBy(String cMonitorprocessBy) {
        this.cMonitorprocessBy = cMonitorprocessBy;
    }

    public Date getcMonitorprocessDate() {
        return cMonitorprocessDate;
    }

    public void setcMonitorprocessDate(Date cMonitorprocessDate) {
        this.cMonitorprocessDate = cMonitorprocessDate;
    }

    public String getcAnalystStartBy() {
        return cAnalystStartBy;
    }

    public void setcAnalystStartBy(String cAnalystStartBy) {
        this.cAnalystStartBy = cAnalystStartBy;
    }

    public Date getcAnalystStartDate() {
        return cAnalystStartDate;
    }

    public void setcAnalystStartDate(Date cAnalystStartDate) {
        this.cAnalystStartDate = cAnalystStartDate;
    }

    public String getcAnalystEndBy() {
        return cAnalystEndBy;
    }

    public void setcAnalystEndBy(String cAnalystEndBy) {
        this.cAnalystEndBy = cAnalystEndBy;
    }

    public Date getcAnalystEndDate() {
        return cAnalystEndDate;
    }

    public void setcAnalystEndDate(Date cAnalystEndDate) {
        this.cAnalystEndDate = cAnalystEndDate;
    }

    public String getcAnalystSubmitBy() {
        return cAnalystSubmitBy;
    }

    public void setcAnalystSubmitBy(String cAnalystSubmitBy) {
        this.cAnalystSubmitBy = cAnalystSubmitBy;
    }

    public Date getcAnalystSubmitDate() {
        return cAnalystSubmitDate;
    }

    public void setcAnalystSubmitDate(Date cAnalystSubmitDate) {
        this.cAnalystSubmitDate = cAnalystSubmitDate;
    }

    public String getcTechengineerCreateBy() {
        return cTechengineerCreateBy;
    }

    public void setcTechengineerCreateBy(String cTechengineerCreateBy) {
        this.cTechengineerCreateBy = cTechengineerCreateBy;
    }

    public Date getcTechengineerCreateDate() {
        return cTechengineerCreateDate;
    }

    public void setcTechengineerCreateDate(Date cTechengineerCreateDate) {
        this.cTechengineerCreateDate = cTechengineerCreateDate;
    }

    public String getcTechengineerSubmitBy() {
        return cTechengineerSubmitBy;
    }

    public void setcTechengineerSubmitBy(String cTechengineerSubmitBy) {
        this.cTechengineerSubmitBy = cTechengineerSubmitBy;
    }

    public Date getcTechengineerSubmitDate() {
        return cTechengineerSubmitDate;
    }

    public void setcTechengineerSubmitDate(Date cTechengineerSubmitDate) {
        this.cTechengineerSubmitDate = cTechengineerSubmitDate;
    }

    public String getcReportcreateBy() {
        return cReportcreateBy;
    }

    public void setcReportcreateBy(String cReportcreateBy) {
        this.cReportcreateBy = cReportcreateBy;
    }

    public Date getcReportcreateDate() {
        return cReportcreateDate;
    }

    public void setcReportcreateDate(Date cReportcreateDate) {
        this.cReportcreateDate = cReportcreateDate;
    }

    public String getcReportsignatureBy() {
        return cReportsignatureBy;
    }

    public void setcReportsignatureBy(String cReportsignatureBy) {
        this.cReportsignatureBy = cReportsignatureBy;
    }

    public Date getcReportsignatureDate() {
        return cReportsignatureDate;
    }

    public void setcReportsignatureDate(Date cReportsignatureDate) {
        this.cReportsignatureDate = cReportsignatureDate;
    }

    public String getcChargesendBy() {
        return cChargesendBy;
    }

    public void setcChargesendBy(String cChargesendBy) {
        this.cChargesendBy = cChargesendBy;
    }

    public Date getcChargesendDate() {
        return cChargesendDate;
    }

    public void setcChargesendDate(Date cChargesendDate) {
        this.cChargesendDate = cChargesendDate;
    }

    public String getcChargecreateBy() {
        return cChargecreateBy;
    }

    public void setcChargecreateBy(String cChargecreateBy) {
        this.cChargecreateBy = cChargecreateBy;
    }

    public Date getcChargecreateDate() {
        return cChargecreateDate;
    }

    public void setcChargecreateDate(Date cChargecreateDate) {
        this.cChargecreateDate = cChargecreateDate;
    }

    public String getcChargesignatureBy() {
        return cChargesignatureBy;
    }

    public void setcChargesignatureBy(String cChargesignatureBy) {
        this.cChargesignatureBy = cChargesignatureBy;
    }

    public Date getcChargesignatureDate() {
        return cChargesignatureDate;
    }

    public void setcChargesignatureDate(Date cChargesignatureDate) {
        this.cChargesignatureDate = cChargesignatureDate;
    }

    public String getcNextPerson() {
        return cNextPerson;
    }

    public void setcNextPerson(String cNextPerson) {
        this.cNextPerson = cNextPerson;
    }

    public String getcCurrentProcess() {
        return cCurrentProcess;
    }

    public void setcCurrentProcess(String cCurrentProcess) {
        this.cCurrentProcess = cCurrentProcess;
    }

    public String getcSampleOutBy() {
        return cSampleOutBy;
    }

    public void setcSampleOutBy(String cSampleOutBy) {
        this.cSampleOutBy = cSampleOutBy;
    }

    public Date getcSampleOutDate() {
        return cSampleOutDate;
    }

    public void setcSampleOutDate(Date cSampleOutDate) {
        this.cSampleOutDate = cSampleOutDate;
    }

    public String getcSampleInBy() {
        return cSampleInBy;
    }

    public void setcSampleInBy(String cSampleInBy) {
        this.cSampleInBy = cSampleInBy;
    }

    public Date getcSampleInDate() {
        return cSampleInDate;
    }

    public void setcSampleInDate(Date cSampleInDate) {
        this.cSampleInDate = cSampleInDate;
    }

    public String getcSampleBorrowBy() {
        return cSampleBorrowBy;
    }

    public void setcSampleBorrowBy(String cSampleBorrowBy) {
        this.cSampleBorrowBy = cSampleBorrowBy;
    }

    public Date getcSampleBorrowDate() {
        return cSampleBorrowDate;
    }

    public void setcSampleBorrowDate(Date cSampleBorrowDate) {
        this.cSampleBorrowDate = cSampleBorrowDate;
    }

    public String getcSampleReturnBy() {
        return cSampleReturnBy;
    }

    public void setcSampleReturnBy(String cSampleReturnBy) {
        this.cSampleReturnBy = cSampleReturnBy;
    }

    public Date getcSampleReturnDate() {
        return cSampleReturnDate;
    }

    public void setcSampleReturnDate(Date cSampleReturnDate) {
        this.cSampleReturnDate = cSampleReturnDate;
    }

    public Long getReportNumberBak() {
        return reportNumberBak;
    }

    public void setReportNumberBak(Long reportNumberBak) {
        this.reportNumberBak = reportNumberBak;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getcIsDownparam() {
        return cIsDownparam;
    }

    public void setcIsDownparam(String cIsDownparam) {
        this.cIsDownparam = cIsDownparam;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }
}