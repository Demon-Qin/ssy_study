package zyq.basedao.annotation;

/**
 * @authoradmin
 * @date 2021/11/25 23:21
 * @description BirdNest
 */
public enum BirdNest {
    /**
     * 麻雀
     */
    Sparrow;

    /**
     * 鸟类繁殖
     *
     * @return Bird
     */
    public Bird reproduce() {
        Desc bd = Sparrow.class.getAnnotation(Desc.class);
        return bd == null ? new Sparrow() : new Sparrow(bd.c());
    }
}