package com.megvii.megfacesdk.manager;

public class MegConfig {

    private boolean openEyeOOC;
    private boolean openMouthOOC;
    private int eyeOOCThreshold;
    private int mouthOOCThreshold;

    public MegConfig(boolean openEyeOOC,  int eyeOOCThreshold, boolean openMouthOOC,int mouthOOCThreshold) {
        this.openEyeOOC = openEyeOOC;
        this.openMouthOOC = openMouthOOC;
        this.eyeOOCThreshold = eyeOOCThreshold;
        this.mouthOOCThreshold = mouthOOCThreshold;
    }

    public static class Builder{
        private boolean openEyeOOC = false;
        private boolean openMouthOOC = false;
        private int eyeOOCThreshold = 0;
        private int mouthOOCThreshold = 0;

        /**
         *
         * @param openEyeOOC 是否开启眼部分割
         * @param eyeOOCThreshold 设置阈值[0-1]
         */
        void eyeOOC(boolean openEyeOOC,int eyeOOCThreshold){

        }

        void faceOOC(boolean openMouthOOC,int mouthOOCThreshold){

        }


        MegConfig build(){
            MegConfig config = new MegConfig(this.openEyeOOC,this.eyeOOCThreshold,this.openMouthOOC,this.mouthOOCThreshold);
            return config;
        }
    }
}
