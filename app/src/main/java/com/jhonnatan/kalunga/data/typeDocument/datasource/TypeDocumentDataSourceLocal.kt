package com.jhonnatan.kalunga.data.typeDocument.datasource

import com.jhonnatan.kalunga.data.typeDocument.entities.ResponseDocumentType
import com.jhonnatan.kalunga.data.typeDocument.source.TypeDocumentJSONInterface

/**
 * Project: kalunga
 * From: com.jhonnatan.kalunga.data.typeDocument.datasource
 * Created by Laura S. Sarmiento M. on 21/07/2021 at 7:06 p. m.
 * More info:  https://venecambios-kalunga.com/
 * All rights reserved 2021.
 **/
class TypeDocumentDataSourceLocal private constructor(private val typeDocumentJSONInterface: TypeDocumentJSONInterface)  {

    companion object {
        private var INSTANCE: TypeDocumentDataSourceLocal? = null
        fun getInstance(typeDocumentJSONInterface: TypeDocumentJSONInterface): TypeDocumentDataSourceLocal =
            INSTANCE ?: TypeDocumentDataSourceLocal(typeDocumentJSONInterface)
    }

    suspend fun getDataTypeDocument(): List<ResponseDocumentType> {
        return typeDocumentJSONInterface.getDataTypeDocument()
    }

}