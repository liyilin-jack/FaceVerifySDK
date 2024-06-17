package com.megvii.megfacesdk.db;

import com.megvii.megfacesdk.bean.FeatureAddResult;
import com.megvii.megfacesdk.bean.FeatureExportResult;
import com.megvii.megfacesdk.bean.FeatureMatchResult;
import com.megvii.megfacesdk.bean.FeatureRemoveResult;

public class MegFeatureDataManager implements IFeatureDB{


    @Override
    public FeatureAddResult addFeature(String groupName, String feature, String tag, boolean needOverWrite) {
        return null;
    }

    @Override
    public FeatureRemoveResult removeFeature(String groupName, long featureId) {
        return null;
    }

    @Override
    public FeatureRemoveResult removeFeature(long featureId) {
        return null;
    }

    @Override
    public FeatureMatchResult matchFeaturesInGroup(String groupName, String feature, int matchNumLimit) {
        return null;
    }

    @Override
    public FeatureMatchResult matchFeatures(String groupName, String feature, int matchNumLimit) {
        return null;
    }

    @Override
    public FeatureExportResult exportFeatures() {
        return null;
    }
}
