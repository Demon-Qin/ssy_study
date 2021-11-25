package zyq.basedao.annotation;

/**
 * @authoradmin
 * @date 2021/11/25 23:21
 * @description TestBird
 */
public class TestBird {
    public static void main(String[] args) {
        Bird bird = BirdNest.Sparrow.reproduce();
        Desc.Color color = bird.getColor();
        System.out.println("Bird's color is :" + color);
    }
}