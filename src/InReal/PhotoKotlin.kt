package InReal


import java.text.DateFormat
import java.text.SimpleDateFormat

class PhotoKotlin : Entitys() {
    var id: String? = null
    var width: Int? = null
    var height: Int = 0
    val url: String? = null

    val dateTime: String
        get() = SimpleDateFormat("yyyy-MM-dd HH:mm")
                .format(DateFormat.DATE_FIELD)
}
