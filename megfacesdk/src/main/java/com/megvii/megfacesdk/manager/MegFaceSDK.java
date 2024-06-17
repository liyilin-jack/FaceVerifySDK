package com.megvii.megfacesdk.manager;

import com.megvii.megfacesdk.bean.FeatureCompareInfo;
import com.megvii.megfacesdk.bean.InitResult;

public class MegFaceSDK implements IFaceSDK{

    /**
     * 初始化授权
     */
    public InitResult init(){
        checkIfInvalid();
        v2Init();
        fmpInit();
        return null;
    }

    @Override
    public FeatureCompareInfo compareFeature(String feature, String refFeature) {
        return null;
    }

    /**
     * 校验是否过期
     */
    private void checkIfInvalid() {

    }

    /**
     * 初始化fmp库
     */
    private void fmpInit() {

    }

    /**
     * 初始化v2库
     */
    private void v2Init() {

    }


}
