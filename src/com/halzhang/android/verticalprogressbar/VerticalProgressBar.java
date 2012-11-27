package com.halzhang.android.verticalprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * 垂直{@link ProgressBar}<br/>
 * Android-VerticalProgressBar<br/>
 * 
 * @author <a href="http://weibo.com/halzhang">Hal</a>
 * @version Nov 27, 2012 7:30:27 PM
 */
public class VerticalProgressBar extends ProgressBar {

	public VerticalProgressBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public VerticalProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public VerticalProgressBar(Context context) {
		super(context);
	}
	
	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(h, w, oldh, oldw);
	}
	
	@Override
	protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//		setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
	}
	
	@Override
	protected synchronized void onDraw(Canvas canvas) {
		canvas.rotate(-90);
		canvas.translate(-getHeight(), 0);
		super.onDraw(canvas);
	}

}
