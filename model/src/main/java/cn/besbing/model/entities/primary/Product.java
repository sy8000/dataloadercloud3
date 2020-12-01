package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.Date;

public class Product extends ProductKey {
    private String code;

    private String description;

    private BigDecimal costFactor;

    private Date changedOn;

    private String changedBy;

    private String removed;

    private String groupName;

    private String extLink;

    private String testList;

    private Long fullTestFreq;

    private Long lotsToGo;

    private String reportFormat;

    private String active;

    private String samplePlan;

    private Date effectiveDate;

    private String approved;

    private String approvalGroup;

    private String readyForApproval;

    private Long approvalId;

    private String template;

    private String gradeTemplate;

    private String stageTemplate;

    private String numericSpecTemp;

    private String textSpecTemp;

    private String formulaSpecTemp;

    private String spcSpecTemp;

    private String reportedSpecTemp;

    private String signed;

    private String recordSet;

    private String tCustomer;

    private String cProdTypeC1;

    private String cAllowedContact;

    private String cParaCondition;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCostFactor() {
        return costFactor;
    }

    public void setCostFactor(BigDecimal costFactor) {
        this.costFactor = costFactor;
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

    public String getRemoved() {
        return removed;
    }

    public void setRemoved(String removed) {
        this.removed = removed;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getExtLink() {
        return extLink;
    }

    public void setExtLink(String extLink) {
        this.extLink = extLink;
    }

    public String getTestList() {
        return testList;
    }

    public void setTestList(String testList) {
        this.testList = testList;
    }

    public Long getFullTestFreq() {
        return fullTestFreq;
    }

    public void setFullTestFreq(Long fullTestFreq) {
        this.fullTestFreq = fullTestFreq;
    }

    public Long getLotsToGo() {
        return lotsToGo;
    }

    public void setLotsToGo(Long lotsToGo) {
        this.lotsToGo = lotsToGo;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSamplePlan() {
        return samplePlan;
    }

    public void setSamplePlan(String samplePlan) {
        this.samplePlan = samplePlan;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getApprovalGroup() {
        return approvalGroup;
    }

    public void setApprovalGroup(String approvalGroup) {
        this.approvalGroup = approvalGroup;
    }

    public String getReadyForApproval() {
        return readyForApproval;
    }

    public void setReadyForApproval(String readyForApproval) {
        this.readyForApproval = readyForApproval;
    }

    public Long getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getGradeTemplate() {
        return gradeTemplate;
    }

    public void setGradeTemplate(String gradeTemplate) {
        this.gradeTemplate = gradeTemplate;
    }

    public String getStageTemplate() {
        return stageTemplate;
    }

    public void setStageTemplate(String stageTemplate) {
        this.stageTemplate = stageTemplate;
    }

    public String getNumericSpecTemp() {
        return numericSpecTemp;
    }

    public void setNumericSpecTemp(String numericSpecTemp) {
        this.numericSpecTemp = numericSpecTemp;
    }

    public String getTextSpecTemp() {
        return textSpecTemp;
    }

    public void setTextSpecTemp(String textSpecTemp) {
        this.textSpecTemp = textSpecTemp;
    }

    public String getFormulaSpecTemp() {
        return formulaSpecTemp;
    }

    public void setFormulaSpecTemp(String formulaSpecTemp) {
        this.formulaSpecTemp = formulaSpecTemp;
    }

    public String getSpcSpecTemp() {
        return spcSpecTemp;
    }

    public void setSpcSpecTemp(String spcSpecTemp) {
        this.spcSpecTemp = spcSpecTemp;
    }

    public String getReportedSpecTemp() {
        return reportedSpecTemp;
    }

    public void setReportedSpecTemp(String reportedSpecTemp) {
        this.reportedSpecTemp = reportedSpecTemp;
    }

    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed;
    }

    public String getRecordSet() {
        return recordSet;
    }

    public void setRecordSet(String recordSet) {
        this.recordSet = recordSet;
    }

    public String gettCustomer() {
        return tCustomer;
    }

    public void settCustomer(String tCustomer) {
        this.tCustomer = tCustomer;
    }

    public String getcProdTypeC1() {
        return cProdTypeC1;
    }

    public void setcProdTypeC1(String cProdTypeC1) {
        this.cProdTypeC1 = cProdTypeC1;
    }

    public String getcAllowedContact() {
        return cAllowedContact;
    }

    public void setcAllowedContact(String cAllowedContact) {
        this.cAllowedContact = cAllowedContact;
    }

    public String getcParaCondition() {
        return cParaCondition;
    }

    public void setcParaCondition(String cParaCondition) {
        this.cParaCondition = cParaCondition;
    }
}