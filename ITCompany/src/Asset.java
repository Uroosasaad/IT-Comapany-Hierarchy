import java.util.Date;

public class Asset {
    private int assetId;
    private String assetName;
    private Date inductionDate;

    public Asset(int assetId, String assetName, Date inductionDate) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.inductionDate = inductionDate;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public Date getInductionDate() {
        return inductionDate;
    }

    public void setInductionDate(Date inductionDate) {
        this.inductionDate = inductionDate;
    }
}
