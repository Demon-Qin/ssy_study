package zyq.basedao.enums;

/**
 * @authoradmin
 * @date 2021/11/30 13:38
 * @description Weekday
 */
public enum Weekday {
    /**
     * 枚举值
     */
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    private final int value;

    Weekday(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
