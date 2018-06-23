package life.dream.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * county表
 * 对应的实体类
 * County
 * <p>
 * LitePal中的每一个实体类都必须是继承自DataSupport
 */
public class County extends DataSupport {
    //id是每个实体类中都应该有的字段
    private int id;
    //记录县的名字
    private String countyName;
    //记录县所对应的天气id
    private String weatherId;
    //记录当前县所属市的id值
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
