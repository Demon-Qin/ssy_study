package zyq.basedao.annotation;

/**
 * @authoradmin
 * @date 2021/11/25 23:20
 * @description Sparrow
 */
public class Sparrow extends Bird {
    private Desc.Color color;

    /**
     * 默认是浅灰色
     */
    public Sparrow() {
        color = Desc.Color.Grayish;
    }

    /**
     * 构造函数定义鸟的颜色
     *
     * @param color1 入参
     */
    public Sparrow(Desc.Color color1) {
        color = color1;
    }

    @Override
    public Desc.Color getColor() {
        return color;
    }
}