package cn.besbing.model.entities.primary;

public class ResultView {
    private Long sampleNumber;

    private String formatvalue;

    private String name;

    private Long cTaskSeqNum;

    private String cTaskId;

    public Long getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(Long sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public String getFormatvalue() {
        return formatvalue;
    }

    public void setFormatvalue(String formatvalue) {
        this.formatvalue = formatvalue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getcTaskSeqNum() {
        return cTaskSeqNum;
    }

    public void setcTaskSeqNum(Long cTaskSeqNum) {
        this.cTaskSeqNum = cTaskSeqNum;
    }

    public String getcTaskId() {
        return cTaskId;
    }

    public void setcTaskId(String cTaskId) {
        this.cTaskId = cTaskId;
    }
}