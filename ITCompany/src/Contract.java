import java.util.Date;

public class Contract {
    private int contractId;
    private String contractTitle;
    private Date signingDate;

    public Contract(int contractId, String contractTitle, Date signingDate) {
        this.contractId = contractId;
        this.contractTitle = contractTitle;
        this.signingDate = signingDate;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getContractTitle() {
        return contractTitle;
    }

    public void setContractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }
}
