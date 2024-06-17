package com.megvii.megfacesdk.db;

import com.megvii.megfacesdk.bean.FeatureAddResult;
import com.megvii.megfacesdk.bean.FeatureExportResult;
import com.megvii.megfacesdk.bean.FeatureMatchResult;
import com.megvii.megfacesdk.bean.FeatureRemoveResult;

public interface IFeatureDB {

    /**
     * 增/改
     * @param groupName
     * @param feature
     * @param tag
     * @param needOverWrite
     * @return
     */
    FeatureAddResult addFeature(String groupName, String feature,String tag,boolean needOverWrite);


    /**
     * 删除组内的feature
     * @param groupName
     * @param featureId
     * @return
     */
    FeatureRemoveResult removeFeature(String groupName, long featureId);

    /**
     * 删除数据库内匹配的feature
     * @param featureId
     * @return
     */
    FeatureRemoveResult removeFeature(long featureId);


    /**
     * 组内匹配
     * @param groupName
     * @param feature
     * @param matchNumLimit
     */
    FeatureMatchResult matchFeaturesInGroup(String groupName, String feature, int matchNumLimit);

    /**
     * 数据库内匹配
     * @param groupName
     * @param feature
     * @param matchNumLimit
     * @return
     */
    FeatureMatchResult matchFeatures(String groupName, String feature, int matchNumLimit);


    FeatureExportResult exportFeatures();



}
