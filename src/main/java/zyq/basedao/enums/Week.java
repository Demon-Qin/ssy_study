package zyq.basedao.enums;

/**
 * @authoradmin
 * @date 2021/11/30 14:39
 * @description Week
 */
public enum Week {
    /**
     * 枚举类变量中添加属性
     */
    SUNDAY(0, "星期日"),
    MONDAY(1, "星期一"),
    TUESDAY(2, "星期二"),
    WEDNESDAY(3, "星期三"),
    THURSDAY(4, "星期四"),
    FRIDAY(5, "星期五"),
    SATURDAY(6, "星期六");

    private final int id;
    private final String meaning;

    public int getId() {
        return id;
    }

    public String getMeaning() {
        return meaning;
    }

    Week(int id, String meaning) {
        this.id = id;
        this.meaning = meaning;
    }
}
