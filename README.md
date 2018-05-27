![image](https://github.com/153437803/Wheel_Litttle/blob/master/Screenrecorder-2018-05-27.gif ) 
```
<declare-styleable name="WheelView">
    <attr name="wv_text_size" format="dimension|reference" />
    <attr name="wv_text_scale" format="float|reference" />
    <attr name="wv_text_alpha" format="float|reference" />
    <attr name="wv_text_loop" format="boolean" />
    <attr name="wv_text_count" format="integer|reference" />
    <attr name="wv_text_color_normal" format="color|reference" />
    <attr name="wv_stock_size" format="dimension|reference" />
    <attr name="wv_stock_color" format="color|reference" />
    <attr name="wv_text_color_select" format="color|reference" />
</declare-styleable>
```
```
final WheelView wheel2 = findViewById(R.id.wheel2);
wheel2.setList(list);
wheel2.setOnWheelChangeListener(new WheelView.OnWheelChangeListener() {
    @Override
    public void onWheelChnage(int index, String str) {
        // to do something
    }
});
```
