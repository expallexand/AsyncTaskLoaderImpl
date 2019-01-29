package com.example.alekseynd.asynctaskloaderimpl;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class CardDecoration extends RecyclerView.ItemDecoration {

    private Paint mYellowPoint;
    private Paint mRedPoint;

    public CardDecoration() {
        mYellowPoint = new Paint();
        mYellowPoint.setStyle(Paint.Style.FILL);
        mYellowPoint.setAntiAlias(true);
        mYellowPoint.setColor(Color.YELLOW);

        mRedPoint = new Paint();
        mRedPoint.setStyle(Paint.Style.FILL);
        mRedPoint.setAntiAlias(true);
        mRedPoint.setColor(Color.RED);
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);

//        int left = parent.getPaddingLeft();
//        int right = parent.getWidth() - parent.getPaddingRight();
//
//        int pixelOfSet = parent.getContext().getResources().getDimensionPixelOffset(R.dimen.li_margin);
//
//        int viewCount = parent.getChildCount();
//
//        for (int i = 0; i < viewCount; i++) {
//            View child = parent.getChildAt(i);
//
//            int top = child.getTop() - pixelOfSet / 2;
//            int bottom = child.getBottom() + pixelOfSet / 2;
//
//            int childAdapterPosition = parent.getChildAdapterPosition(child);
//            c.drawRect(left, top, right, bottom, childAdapterPosition % 2 == 0 ? mYellowPoint : mRedPoint);
//        }
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
//        int pixelOffSet = parent.getContext().getResources().getDimensionPixelOffset(R.dimen.li_margin);
//        int viewCount = parent.getChildCount();
//        int right = parent.getWidth() / 2;
//        int left = right - pixelOffSet * 2;
//
//        for (int i = 0; i < viewCount; i++) {
//            View child = parent.getChildAt(i);
//            int top = child.getTop() + pixelOffSet;
//            int bottom = child.getBottom() - pixelOffSet;
//            int childAdapterPosition = parent.getChildAdapterPosition(child);
//
//            c.drawRect(left, top, right, bottom, childAdapterPosition % 2 != 0 ? mYellowPoint : mRedPoint);
//        }
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        int pixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.li_margin);

        outRect.left = pixelOffset;
        outRect.right = pixelOffset;
        outRect.top = pixelOffset / 2;
        outRect.bottom = pixelOffset / 2;
    }
}
