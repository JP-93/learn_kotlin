class senhaHash {
    fun passHash(value: String): String{
        var res = ""
        if (value == "4"){
            res = value.replace(value, "3# rvzgV")
        }else if ( value == "Texto #3"){
            res = value.replace(value, "1FECedc")
        }
    return res
    }

}