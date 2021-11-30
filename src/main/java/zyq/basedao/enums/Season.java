package zyq.basedao.enums;

/**
 * @authoradmin
 * @date 2021/11/30 16:10
 * @description Season
 */
public enum Season {
    /**
     * 枚举定义
     */
    SPRING("1") {
        @Override
        public Season getNextSeason() {
            return SUMMER;
        }
    },
    SUMMER("4") {
        @Override
        public Season getNextSeason() {
            return AUTUMN;
        }
    },
    AUTUMN("7") {
        @Override
        public Season getNextSeason() {
            return WINTER;
        }
    },
    WINTER("10") {
        @Override
        public Season getNextSeason() {
            return SPRING;
        }
    };

    private final String monthStart;

    Season(String monthStart) {
        this.monthStart = monthStart;
    }

    public abstract Season getNextSeason();

    public String getMonthStart() {
        return monthStart;
    }
}
