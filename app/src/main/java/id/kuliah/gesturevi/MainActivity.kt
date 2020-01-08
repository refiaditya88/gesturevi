package id.kuliah.gesturevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener
{
    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.gDetector = GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(event: MotionEvent?): Boolean {
        gesture_status.text = "onDown"
        return true
    }

    override fun onFling(event1: MotionEvent, event2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        gesture_status.text = "onFling"
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        gesture_status.text = "LongPress"
    }

    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
        gesture_status.text = "Scroll"
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        gesture_status.text = "ShowPress"
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        gesture_status.text = "SingleTapUp"
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gesture_status.text = "OnDoubletap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gesture_status.text = "Doubbletapevent"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        gesture_status.text = "SingletapEvent"
        return true
    }
}