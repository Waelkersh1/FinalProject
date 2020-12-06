package kersh.wael.FinalProject;

import android.location.Location;

import java.util.Date;

public class Route
{
    private Location startLocation , endLocation ;
    private Date startDate , endDate ;
    private String Type;//RUN WALK BICYCLE
    private double  lenngth;

    public Route() {
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
