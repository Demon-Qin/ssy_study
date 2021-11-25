package zyq.basedao.annotation;

/**
 * @authoradmin
 * @date 2021/11/25 23:10
 * @description SafeVarargsAnnotation
 */
    public record SafeVarargsAnnotation<S>(S... args) {
        /**
         * 构造方法可以使用@SafeVarargs标记
         *
         * @param args 入参数组
         */
        @SafeVarargs
        public SafeVarargsAnnotation {
        }

        /**
         * 此处不能使用@SafeVarargs，因为此方法未声明为static或final方法，
         * 如果要抑制unchecked警告，可以使用@SuppressWarnings注解
         *
         * @param args 入参数组
         */
        @SuppressWarnings("unchecked")
        public void loopPrintArgs(S... args) {
            for (S arg : args) {
                System.out.println(arg);
            }
        }

        /**
         * final方法可以使用@SafeVarargs标记
         *
         * @param args 入参数组
         */
        @SafeVarargs
        public final void printSelfArgs(S... args) {
            for (S arg : this.args) {
                System.out.println(arg);
            }
        }

        /**
         * static方法可以使用@SafeVarargs标记
         *
         * @param infos 入参泛型数组
         * @param <T>   泛型方法
         */
        @SafeVarargs
        public static <T> void loopPrintInfo(T... infos) {
            for (T info : infos) {
                System.out.println(info);
            }
        }

        public static void main(String[] args) {
            SafeVarargsAnnotation.loopPrintInfo("A", "B", "C");
        }
    }
