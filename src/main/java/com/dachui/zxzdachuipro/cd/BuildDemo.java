package com.dachui.zxzdachuipro.cd;

/**
 * @Author: zxz
 * @Date: 2024-07-01-18:07
 * @Description:
 */
public class BuildDemo {

    private String code;
    private String name1;
    private String name2;
    private String name3;
    private String name4;


    public static final class BuildDemoBuilder {
        private String code;
        private String name1;
        private String name2;
        private String name3;
        private String name4;

        public BuildDemoBuilder() {
        }

        public static BuildDemoBuilder aBuildDemo() {
            return new BuildDemoBuilder();
        }

        public BuildDemoBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public BuildDemoBuilder withName1(String name1) {
            this.name1 = name1;
            return this;
        }

        public BuildDemoBuilder withName2(String name2) {
            this.name2 = name2;
            return this;
        }

        public BuildDemoBuilder withName3(String name3) {
            this.name3 = name3;
            return this;
        }

        public BuildDemoBuilder withName4(String name4) {
            this.name4 = name4;
            return this;
        }

        public BuildDemo build() {
            BuildDemo buildDemo = new BuildDemo();
            buildDemo.code = this.code;
            buildDemo.name1 = this.name1;
            buildDemo.name2 = this.name2;
            buildDemo.name3 = this.name3;
            buildDemo.name4 = this.name4;
            return buildDemo;
        }
    }
}
