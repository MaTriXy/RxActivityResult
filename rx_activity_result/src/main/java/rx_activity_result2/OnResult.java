package rx_activity_result2;

import android.content.Intent;
import android.support.annotation.Nullable;

import java.io.Serializable;

interface OnResult extends Serializable {
    void response(int resultCode, @Nullable Intent data);
}
