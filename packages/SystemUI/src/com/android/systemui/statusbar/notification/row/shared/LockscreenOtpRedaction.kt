package com.android.systemui.statusbar.notification.row.shared

/** Helper for reading or using the Lockscreen OTP Redaction flag state. */
@Suppress("NOTHING_TO_INLINE")
object LockscreenOtpRedaction {

    /** Is the lockscreen otp redaction enabled */
    @JvmStatic
    inline val isSingleLineViewEnabled: Boolean
        get() = false
}
