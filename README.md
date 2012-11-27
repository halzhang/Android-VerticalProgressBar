Android-VerticalProgressBar
===
垂直的ProgressBar和Seekbar

Author
===
[Halzhang][1]<br/>
Email:[ghanguo@gmail.com](mailto:ghanguo@gmail.com)

Overview
===
垂直方向的ProgressBar和SeekBar<br/>
![image](https://github.com/halzhang/Android-VerticalProgressBar/blob/master/device-2012-11-27-193805.png?raw=true)

Usage
===
#### Layout

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal" >
    
    <com.halzhang.android.verticalprogressbar.VerticalSeekBar
        android:id="@+id/verticalSeekBar"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:max="1000"
        android:progress="2"
        android:maxWidth="50dip"
        android:minWidth="50dip" />
    
    <com.halzhang.android.verticalprogressbar.VerticalProgressBar
        style="@android:style/Widget.ProgressBar.Horizontal"
        android:id="@+id/verticalProgressBar"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:max="1000"
        android:progress="500"
        android:maxWidth="10dip"
        android:minWidth="10dip" />
</LinearLayout>

License
===
[WTFPL][2], although attribution would be nice.

[1]: http://weibo.com/halzhang
[2]: http://sam.zoy.org/wtfpl/
