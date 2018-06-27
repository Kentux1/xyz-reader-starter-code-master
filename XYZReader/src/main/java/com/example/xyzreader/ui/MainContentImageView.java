package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

public class MainContentImageView extends android.support.v7.widget.AppCompatImageView {

    public MainContentImageView(Context context) {
        super(context);

    }

    public MainContentImageView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }


    public MainContentImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);

    }
}