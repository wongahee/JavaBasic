package gahee.basic.day08.hr;

public class Regions {

    private int region_id;
    private String region_name;

    // 생성자
    public Regions(int region_id, String region_name) {
        this.region_id = region_id;
        this.region_name = region_name;
    }

    // setter/getter
    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
