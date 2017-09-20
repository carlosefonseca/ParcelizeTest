
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Content to be displayed inside an [AppView].
 */
@Parcelize
class ViewContent(val field: Int = 0) : Parcelable {

/*
    constructor(source: Parcel) : this(
            source.readInt()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeInt(field)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<ViewContent> = object : Parcelable.Creator<ViewContent> {
            override fun createFromParcel(source: Parcel): ViewContent = ViewContent(source)
            override fun newArray(size: Int): Array<ViewContent?> = arrayOfNulls(size)
        }
    }
*/
}
