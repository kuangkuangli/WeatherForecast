package bignerdranchcom.android.weatherforecast.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kuangli on 2018/11/24.
 */
public class Province extends DataSupport {
    private int id;
    private String procinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcinceName() {
        return procinceName;
    }

    public void setProcinceName(String procinceName) {
        this.procinceName = procinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
