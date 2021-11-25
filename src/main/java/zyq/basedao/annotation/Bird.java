package zyq.basedao.annotation;

/**
 * @authoradmin
 * @date 2021/11/25 23:20
 * @description Bird
 */
@Desc(c = Desc.Color.White)
abstract class Bird {
    public abstract Desc.Color getColor();
}