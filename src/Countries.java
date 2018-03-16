/**
 * Created by andriusbaltrunas on 3/16/2018.
 */
public enum Countries {
    LT("lt"), EE("ee"), LV("lv");

    private String locale;

    private Countries(String locale){
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }
}
