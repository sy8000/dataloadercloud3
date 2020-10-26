package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private String name;

    private Long templateVersion;

    private String template;

    private String title;

    private String description;

    private String note;

    private String status;

    private String oldStatus;

    private Date dateCreated;

    private Date dateReceived;

    private Date dateStarted;

    private Date dateCompleted;

    private Date dateReviewed;

    private Date dateUpdated;

    private BigDecimal costFactor;

    private String customer;

    private String customerContact;

    private String owner;

    private String createdBy;

    private Long numSamples;

    private Long numU;

    private Long numI;

    private Long numP;

    private Long numC;

    private Long numA;

    private Long numR;

    private Long numX;

    private String extLink;

    private String groupName;

    private String closed;

    private String sampleTemplate;

    private String conclusion;

    private String product;

    private String stability;

    private String chargeCode;

    private String useGroupLogin;

    private String batchTemplate;

    private String useGridLogin;

    private String customerTemplate;

    private String ownerLocation;

    private String aliquot;

    private String signed;

    private String tCertification;

    private String tClosedBy;

    private Date tClosedOn;

    private Long tCoaComment;

    private String tCoaTemplate;

    private String tContractNumber;

    private String tCopyTemplate;

    private String tCustManifest;

    private String tCustomerGroup;

    private Long tInvoiceNumber;

    private String tLoginVerifReqd;

    private String tLoginVerified;

    private String tLoginVerifiedBy;

    private Date tLoginVerifiedOn;

    private Long tNote;

    private String tPoNumber;

    private String tSourceCustomer;

    private Long tPreInvoiceNumber;

    private String cPhoneNumber;

    private String cEmailAddress;

    private String cProductType;

    private String cApplyType;

    private String cRetainHandle;

    private String cCoaLanguage;

    private String cCoaFormat;

    private String cNeedMessage;

    private String cTestPurpose;

    private String cProductProperty;

    private String cTerminalClient;

    private String cClientType;

    private String cProductRequirement;

    private String cIdentificationType;

    private String cCheckingProperty;

    private String cProductLine;

    private Date cProductDate;

    private String cBatchSerial;

    private Long cBatchNumber;

    private String cCertificationType;

    private String cItemNumber;

    private String approved;

    private String approvalGroup;

    private String readyForApproval;

    private Long approvalId;

    private String approvalRouting;

    private String cQuotes;

    private String cProdTypeC1;

    private String cProdTypeC2;

    private String cQuotesCreated;

    private Date cQuotesCreatedOn;

    private String cQuotesCreatedBy;

    private String cQuotesVerifyed;

    private Date cQuotesVerifyedOn;

    private String cQuotesVerifyedBy;

    private String cRptAuthorizedBy;

    private Date cRptAuthorizedOn;

    private Long cPriorityLevel;

    private String cUserDepartment;

    private String cMailLabApproval;

    private String cMailTaskStart;

    private String cMailTaskEnd;

    private String cMailCoaSign;

    private String cIsTemplate;

    private BigDecimal cTotalCharge;

    private String hasAnswerSet;

    private String cRptAuthorized;

    private String cInvoiceCreated;

    private Date cInvoiceCreatedOn;

    private String cInvoiceCreatedBy;

    private String cInvoiceVerifyed;

    private String cInvoiceVerifyedBy;

    private Date cInvoiceVerifyedOn;

    private Long cRptReportNumber;

    private String cConclusion;

    private String cFocusProjuser;

    private String cRptRejectCommentC;

    private String cRptRejectCommentS;

    private String cAlltaskCoaAuthorized;

    private String cRptCnasLogo;

    private String cMailQuotes;

    private String cMailCharge;

    private Long rptNumberBak;

    private String ncRef;

    private String ts;

    private String cNcToLims;

    private String cAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTemplateVersion() {
        return templateVersion;
    }

    public void setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Date getDateReviewed() {
        return dateReviewed;
    }

    public void setDateReviewed(Date dateReviewed) {
        this.dateReviewed = dateReviewed;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public BigDecimal getCostFactor() {
        return costFactor;
    }

    public void setCostFactor(BigDecimal costFactor) {
        this.costFactor = costFactor;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getNumSamples() {
        return numSamples;
    }

    public void setNumSamples(Long numSamples) {
        this.numSamples = numSamples;
    }

    public Long getNumU() {
        return numU;
    }

    public void setNumU(Long numU) {
        this.numU = numU;
    }

    public Long getNumI() {
        return numI;
    }

    public void setNumI(Long numI) {
        this.numI = numI;
    }

    public Long getNumP() {
        return numP;
    }

    public void setNumP(Long numP) {
        this.numP = numP;
    }

    public Long getNumC() {
        return numC;
    }

    public void setNumC(Long numC) {
        this.numC = numC;
    }

    public Long getNumA() {
        return numA;
    }

    public void setNumA(Long numA) {
        this.numA = numA;
    }

    public Long getNumR() {
        return numR;
    }

    public void setNumR(Long numR) {
        this.numR = numR;
    }

    public Long getNumX() {
        return numX;
    }

    public void setNumX(Long numX) {
        this.numX = numX;
    }

    public String getExtLink() {
        return extLink;
    }

    public void setExtLink(String extLink) {
        this.extLink = extLink;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getSampleTemplate() {
        return sampleTemplate;
    }

    public void setSampleTemplate(String sampleTemplate) {
        this.sampleTemplate = sampleTemplate;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getUseGroupLogin() {
        return useGroupLogin;
    }

    public void setUseGroupLogin(String useGroupLogin) {
        this.useGroupLogin = useGroupLogin;
    }

    public String getBatchTemplate() {
        return batchTemplate;
    }

    public void setBatchTemplate(String batchTemplate) {
        this.batchTemplate = batchTemplate;
    }

    public String getUseGridLogin() {
        return useGridLogin;
    }

    public void setUseGridLogin(String useGridLogin) {
        this.useGridLogin = useGridLogin;
    }

    public String getCustomerTemplate() {
        return customerTemplate;
    }

    public void setCustomerTemplate(String customerTemplate) {
        this.customerTemplate = customerTemplate;
    }

    public String getOwnerLocation() {
        return ownerLocation;
    }

    public void setOwnerLocation(String ownerLocation) {
        this.ownerLocation = ownerLocation;
    }

    public String getAliquot() {
        return aliquot;
    }

    public void setAliquot(String aliquot) {
        this.aliquot = aliquot;
    }

    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed;
    }

    public String gettCertification() {
        return tCertification;
    }

    public void settCertification(String tCertification) {
        this.tCertification = tCertification;
    }

    public String gettClosedBy() {
        return tClosedBy;
    }

    public void settClosedBy(String tClosedBy) {
        this.tClosedBy = tClosedBy;
    }

    public Date gettClosedOn() {
        return tClosedOn;
    }

    public void settClosedOn(Date tClosedOn) {
        this.tClosedOn = tClosedOn;
    }

    public Long gettCoaComment() {
        return tCoaComment;
    }

    public void settCoaComment(Long tCoaComment) {
        this.tCoaComment = tCoaComment;
    }

    public String gettCoaTemplate() {
        return tCoaTemplate;
    }

    public void settCoaTemplate(String tCoaTemplate) {
        this.tCoaTemplate = tCoaTemplate;
    }

    public String gettContractNumber() {
        return tContractNumber;
    }

    public void settContractNumber(String tContractNumber) {
        this.tContractNumber = tContractNumber;
    }

    public String gettCopyTemplate() {
        return tCopyTemplate;
    }

    public void settCopyTemplate(String tCopyTemplate) {
        this.tCopyTemplate = tCopyTemplate;
    }

    public String gettCustManifest() {
        return tCustManifest;
    }

    public void settCustManifest(String tCustManifest) {
        this.tCustManifest = tCustManifest;
    }

    public String gettCustomerGroup() {
        return tCustomerGroup;
    }

    public void settCustomerGroup(String tCustomerGroup) {
        this.tCustomerGroup = tCustomerGroup;
    }

    public Long gettInvoiceNumber() {
        return tInvoiceNumber;
    }

    public void settInvoiceNumber(Long tInvoiceNumber) {
        this.tInvoiceNumber = tInvoiceNumber;
    }

    public String gettLoginVerifReqd() {
        return tLoginVerifReqd;
    }

    public void settLoginVerifReqd(String tLoginVerifReqd) {
        this.tLoginVerifReqd = tLoginVerifReqd;
    }

    public String gettLoginVerified() {
        return tLoginVerified;
    }

    public void settLoginVerified(String tLoginVerified) {
        this.tLoginVerified = tLoginVerified;
    }

    public String gettLoginVerifiedBy() {
        return tLoginVerifiedBy;
    }

    public void settLoginVerifiedBy(String tLoginVerifiedBy) {
        this.tLoginVerifiedBy = tLoginVerifiedBy;
    }

    public Date gettLoginVerifiedOn() {
        return tLoginVerifiedOn;
    }

    public void settLoginVerifiedOn(Date tLoginVerifiedOn) {
        this.tLoginVerifiedOn = tLoginVerifiedOn;
    }

    public Long gettNote() {
        return tNote;
    }

    public void settNote(Long tNote) {
        this.tNote = tNote;
    }

    public String gettPoNumber() {
        return tPoNumber;
    }

    public void settPoNumber(String tPoNumber) {
        this.tPoNumber = tPoNumber;
    }

    public String gettSourceCustomer() {
        return tSourceCustomer;
    }

    public void settSourceCustomer(String tSourceCustomer) {
        this.tSourceCustomer = tSourceCustomer;
    }

    public Long gettPreInvoiceNumber() {
        return tPreInvoiceNumber;
    }

    public void settPreInvoiceNumber(Long tPreInvoiceNumber) {
        this.tPreInvoiceNumber = tPreInvoiceNumber;
    }

    public String getcPhoneNumber() {
        return cPhoneNumber;
    }

    public void setcPhoneNumber(String cPhoneNumber) {
        this.cPhoneNumber = cPhoneNumber;
    }

    public String getcEmailAddress() {
        return cEmailAddress;
    }

    public void setcEmailAddress(String cEmailAddress) {
        this.cEmailAddress = cEmailAddress;
    }

    public String getcProductType() {
        return cProductType;
    }

    public void setcProductType(String cProductType) {
        this.cProductType = cProductType;
    }

    public String getcApplyType() {
        return cApplyType;
    }

    public void setcApplyType(String cApplyType) {
        this.cApplyType = cApplyType;
    }

    public String getcRetainHandle() {
        return cRetainHandle;
    }

    public void setcRetainHandle(String cRetainHandle) {
        this.cRetainHandle = cRetainHandle;
    }

    public String getcCoaLanguage() {
        return cCoaLanguage;
    }

    public void setcCoaLanguage(String cCoaLanguage) {
        this.cCoaLanguage = cCoaLanguage;
    }

    public String getcCoaFormat() {
        return cCoaFormat;
    }

    public void setcCoaFormat(String cCoaFormat) {
        this.cCoaFormat = cCoaFormat;
    }

    public String getcNeedMessage() {
        return cNeedMessage;
    }

    public void setcNeedMessage(String cNeedMessage) {
        this.cNeedMessage = cNeedMessage;
    }

    public String getcTestPurpose() {
        return cTestPurpose;
    }

    public void setcTestPurpose(String cTestPurpose) {
        this.cTestPurpose = cTestPurpose;
    }

    public String getcProductProperty() {
        return cProductProperty;
    }

    public void setcProductProperty(String cProductProperty) {
        this.cProductProperty = cProductProperty;
    }

    public String getcTerminalClient() {
        return cTerminalClient;
    }

    public void setcTerminalClient(String cTerminalClient) {
        this.cTerminalClient = cTerminalClient;
    }

    public String getcClientType() {
        return cClientType;
    }

    public void setcClientType(String cClientType) {
        this.cClientType = cClientType;
    }

    public String getcProductRequirement() {
        return cProductRequirement;
    }

    public void setcProductRequirement(String cProductRequirement) {
        this.cProductRequirement = cProductRequirement;
    }

    public String getcIdentificationType() {
        return cIdentificationType;
    }

    public void setcIdentificationType(String cIdentificationType) {
        this.cIdentificationType = cIdentificationType;
    }

    public String getcCheckingProperty() {
        return cCheckingProperty;
    }

    public void setcCheckingProperty(String cCheckingProperty) {
        this.cCheckingProperty = cCheckingProperty;
    }

    public String getcProductLine() {
        return cProductLine;
    }

    public void setcProductLine(String cProductLine) {
        this.cProductLine = cProductLine;
    }

    public Date getcProductDate() {
        return cProductDate;
    }

    public void setcProductDate(Date cProductDate) {
        this.cProductDate = cProductDate;
    }

    public String getcBatchSerial() {
        return cBatchSerial;
    }

    public void setcBatchSerial(String cBatchSerial) {
        this.cBatchSerial = cBatchSerial;
    }

    public Long getcBatchNumber() {
        return cBatchNumber;
    }

    public void setcBatchNumber(Long cBatchNumber) {
        this.cBatchNumber = cBatchNumber;
    }

    public String getcCertificationType() {
        return cCertificationType;
    }

    public void setcCertificationType(String cCertificationType) {
        this.cCertificationType = cCertificationType;
    }

    public String getcItemNumber() {
        return cItemNumber;
    }

    public void setcItemNumber(String cItemNumber) {
        this.cItemNumber = cItemNumber;
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

    public String getApprovalRouting() {
        return approvalRouting;
    }

    public void setApprovalRouting(String approvalRouting) {
        this.approvalRouting = approvalRouting;
    }

    public String getcQuotes() {
        return cQuotes;
    }

    public void setcQuotes(String cQuotes) {
        this.cQuotes = cQuotes;
    }

    public String getcProdTypeC1() {
        return cProdTypeC1;
    }

    public void setcProdTypeC1(String cProdTypeC1) {
        this.cProdTypeC1 = cProdTypeC1;
    }

    public String getcProdTypeC2() {
        return cProdTypeC2;
    }

    public void setcProdTypeC2(String cProdTypeC2) {
        this.cProdTypeC2 = cProdTypeC2;
    }

    public String getcQuotesCreated() {
        return cQuotesCreated;
    }

    public void setcQuotesCreated(String cQuotesCreated) {
        this.cQuotesCreated = cQuotesCreated;
    }

    public Date getcQuotesCreatedOn() {
        return cQuotesCreatedOn;
    }

    public void setcQuotesCreatedOn(Date cQuotesCreatedOn) {
        this.cQuotesCreatedOn = cQuotesCreatedOn;
    }

    public String getcQuotesCreatedBy() {
        return cQuotesCreatedBy;
    }

    public void setcQuotesCreatedBy(String cQuotesCreatedBy) {
        this.cQuotesCreatedBy = cQuotesCreatedBy;
    }

    public String getcQuotesVerifyed() {
        return cQuotesVerifyed;
    }

    public void setcQuotesVerifyed(String cQuotesVerifyed) {
        this.cQuotesVerifyed = cQuotesVerifyed;
    }

    public Date getcQuotesVerifyedOn() {
        return cQuotesVerifyedOn;
    }

    public void setcQuotesVerifyedOn(Date cQuotesVerifyedOn) {
        this.cQuotesVerifyedOn = cQuotesVerifyedOn;
    }

    public String getcQuotesVerifyedBy() {
        return cQuotesVerifyedBy;
    }

    public void setcQuotesVerifyedBy(String cQuotesVerifyedBy) {
        this.cQuotesVerifyedBy = cQuotesVerifyedBy;
    }

    public String getcRptAuthorizedBy() {
        return cRptAuthorizedBy;
    }

    public void setcRptAuthorizedBy(String cRptAuthorizedBy) {
        this.cRptAuthorizedBy = cRptAuthorizedBy;
    }

    public Date getcRptAuthorizedOn() {
        return cRptAuthorizedOn;
    }

    public void setcRptAuthorizedOn(Date cRptAuthorizedOn) {
        this.cRptAuthorizedOn = cRptAuthorizedOn;
    }

    public Long getcPriorityLevel() {
        return cPriorityLevel;
    }

    public void setcPriorityLevel(Long cPriorityLevel) {
        this.cPriorityLevel = cPriorityLevel;
    }

    public String getcUserDepartment() {
        return cUserDepartment;
    }

    public void setcUserDepartment(String cUserDepartment) {
        this.cUserDepartment = cUserDepartment;
    }

    public String getcMailLabApproval() {
        return cMailLabApproval;
    }

    public void setcMailLabApproval(String cMailLabApproval) {
        this.cMailLabApproval = cMailLabApproval;
    }

    public String getcMailTaskStart() {
        return cMailTaskStart;
    }

    public void setcMailTaskStart(String cMailTaskStart) {
        this.cMailTaskStart = cMailTaskStart;
    }

    public String getcMailTaskEnd() {
        return cMailTaskEnd;
    }

    public void setcMailTaskEnd(String cMailTaskEnd) {
        this.cMailTaskEnd = cMailTaskEnd;
    }

    public String getcMailCoaSign() {
        return cMailCoaSign;
    }

    public void setcMailCoaSign(String cMailCoaSign) {
        this.cMailCoaSign = cMailCoaSign;
    }

    public String getcIsTemplate() {
        return cIsTemplate;
    }

    public void setcIsTemplate(String cIsTemplate) {
        this.cIsTemplate = cIsTemplate;
    }

    public BigDecimal getcTotalCharge() {
        return cTotalCharge;
    }

    public void setcTotalCharge(BigDecimal cTotalCharge) {
        this.cTotalCharge = cTotalCharge;
    }

    public String getHasAnswerSet() {
        return hasAnswerSet;
    }

    public void setHasAnswerSet(String hasAnswerSet) {
        this.hasAnswerSet = hasAnswerSet;
    }

    public String getcRptAuthorized() {
        return cRptAuthorized;
    }

    public void setcRptAuthorized(String cRptAuthorized) {
        this.cRptAuthorized = cRptAuthorized;
    }

    public String getcInvoiceCreated() {
        return cInvoiceCreated;
    }

    public void setcInvoiceCreated(String cInvoiceCreated) {
        this.cInvoiceCreated = cInvoiceCreated;
    }

    public Date getcInvoiceCreatedOn() {
        return cInvoiceCreatedOn;
    }

    public void setcInvoiceCreatedOn(Date cInvoiceCreatedOn) {
        this.cInvoiceCreatedOn = cInvoiceCreatedOn;
    }

    public String getcInvoiceCreatedBy() {
        return cInvoiceCreatedBy;
    }

    public void setcInvoiceCreatedBy(String cInvoiceCreatedBy) {
        this.cInvoiceCreatedBy = cInvoiceCreatedBy;
    }

    public String getcInvoiceVerifyed() {
        return cInvoiceVerifyed;
    }

    public void setcInvoiceVerifyed(String cInvoiceVerifyed) {
        this.cInvoiceVerifyed = cInvoiceVerifyed;
    }

    public String getcInvoiceVerifyedBy() {
        return cInvoiceVerifyedBy;
    }

    public void setcInvoiceVerifyedBy(String cInvoiceVerifyedBy) {
        this.cInvoiceVerifyedBy = cInvoiceVerifyedBy;
    }

    public Date getcInvoiceVerifyedOn() {
        return cInvoiceVerifyedOn;
    }

    public void setcInvoiceVerifyedOn(Date cInvoiceVerifyedOn) {
        this.cInvoiceVerifyedOn = cInvoiceVerifyedOn;
    }

    public Long getcRptReportNumber() {
        return cRptReportNumber;
    }

    public void setcRptReportNumber(Long cRptReportNumber) {
        this.cRptReportNumber = cRptReportNumber;
    }

    public String getcConclusion() {
        return cConclusion;
    }

    public void setcConclusion(String cConclusion) {
        this.cConclusion = cConclusion;
    }

    public String getcFocusProjuser() {
        return cFocusProjuser;
    }

    public void setcFocusProjuser(String cFocusProjuser) {
        this.cFocusProjuser = cFocusProjuser;
    }

    public String getcRptRejectCommentC() {
        return cRptRejectCommentC;
    }

    public void setcRptRejectCommentC(String cRptRejectCommentC) {
        this.cRptRejectCommentC = cRptRejectCommentC;
    }

    public String getcRptRejectCommentS() {
        return cRptRejectCommentS;
    }

    public void setcRptRejectCommentS(String cRptRejectCommentS) {
        this.cRptRejectCommentS = cRptRejectCommentS;
    }

    public String getcAlltaskCoaAuthorized() {
        return cAlltaskCoaAuthorized;
    }

    public void setcAlltaskCoaAuthorized(String cAlltaskCoaAuthorized) {
        this.cAlltaskCoaAuthorized = cAlltaskCoaAuthorized;
    }

    public String getcRptCnasLogo() {
        return cRptCnasLogo;
    }

    public void setcRptCnasLogo(String cRptCnasLogo) {
        this.cRptCnasLogo = cRptCnasLogo;
    }

    public String getcMailQuotes() {
        return cMailQuotes;
    }

    public void setcMailQuotes(String cMailQuotes) {
        this.cMailQuotes = cMailQuotes;
    }

    public String getcMailCharge() {
        return cMailCharge;
    }

    public void setcMailCharge(String cMailCharge) {
        this.cMailCharge = cMailCharge;
    }

    public Long getRptNumberBak() {
        return rptNumberBak;
    }

    public void setRptNumberBak(Long rptNumberBak) {
        this.rptNumberBak = rptNumberBak;
    }

    public String getNcRef() {
        return ncRef;
    }

    public void setNcRef(String ncRef) {
        this.ncRef = ncRef;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getcNcToLims() {
        return cNcToLims;
    }

    public void setcNcToLims(String cNcToLims) {
        this.cNcToLims = cNcToLims;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }
}