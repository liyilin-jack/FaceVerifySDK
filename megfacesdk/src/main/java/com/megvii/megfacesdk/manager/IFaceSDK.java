package com.megvii.megfacesdk.manager;

import com.megvii.megfacesdk.bean.FeatureCompareInfo;
import com.megvii.megfacesdk.bean.FeatureMatchResult;
import com.megvii.megfacesdk.bean.InitResult;

public interface IFaceSDK {
    /**
     * sdk初始化
     * @return
     */
    InitResult init();

    FeatureCompareInfo compareFeature(String feature, String refFeature);

}
