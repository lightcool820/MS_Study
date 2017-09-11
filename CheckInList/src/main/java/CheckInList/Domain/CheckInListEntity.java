package CheckInList.Domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CheckInListEntity
{

    @Id
    @GeneratedValue
    private long id;

    private Long CIId;

    private String checkInContent;

    private int stat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCIId() {
        return CIId;
    }

    public void setCIId(Long CIId) {
        this.CIId = CIId;
    }

    public String getCheckInContent() {
        return checkInContent;
    }

    public void setCheckInContent(String checkInContent) {
        this.checkInContent = checkInContent;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }
}
