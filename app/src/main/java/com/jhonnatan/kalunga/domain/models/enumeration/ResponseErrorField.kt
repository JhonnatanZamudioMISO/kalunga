package com.jhonnatan.kalunga.domain.models.enumeration

/**
 * Project: kalunga
 * From: com.jhonnatan.kalunga.domain.models.enumeration
 * Created by Laura S. Sarmiento M. on 16/07/2021 at 6:59 p. m.
 * More info:  https://venecambios-kalunga.com/
 * All rights reserved 2021.
 **/
enum class ResponseErrorField (val value: String){
    DEFAULT(""),
    ERROR_EMPTY("El campo está vacío"),
    ERROR_INVALID("La dirección de correo no es válida")
}