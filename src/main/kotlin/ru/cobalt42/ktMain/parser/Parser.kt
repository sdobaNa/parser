package ru.cobalt42.ktMain.parser

import com.beust.klaxon.Klaxon
import com.mongodb.ConnectionString
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.json.JSONObject
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory
import ru.cobalt42.ktMain.model.tube.tubeLine.TubeLine
import java.io.FileInputStream
import java.io.InputStream
import java.util.*
import kotlin.concurrent.thread


class Parser() {
    fun convert() {
        val inp: InputStream = FileInputStream("C:\\Users\\User\\Desktop\\-500_-_-4_18.07.2021.xlsx")
        val wb: Workbook = WorkbookFactory.create(inp)
        var sheet = 0
        var row = 0
        var cell = 0
        println(wb.numberOfSheets)
        while (sheet < wb.numberOfSheets) {
            thread {
                while (row < wb.getSheetAt(sheet).lastRowNum) {
                    row += 1
                    val map = mutableMapOf<String, String>()
                    while (cell < wb.getSheetAt(sheet).getRow(row).lastCellNum) {
                        when (wb.getSheetAt(sheet).getRow(0).getCell(cell).toString()) {
                            "uid" -> map[wb.getSheetAt(sheet).getRow(0).getCell(cell).toString()] =
                                UUID.randomUUID().toString()
                            else -> map[wb.getSheetAt(sheet).getRow(0).getCell(cell).toString()] =
                                wb.getSheetAt(sheet).getRow(row).getCell(cell).toString()
                        }
                        cell++
                    }
                    val json = JSONObject(map).toString()
                    val mapper = Klaxon().parse<TubeLine>(json)
                    cell = 0
                    when (wb.getSheetAt(sheet).toString()){
                        "tubeLine" -> MongoTemplate(SimpleMongoClientDatabaseFactory(ConnectionString("mongodb://localhost:27017/tube"))).save(mapper!!, "tubeLine")
                    }
                }
            }.join()
            row = 0
            sheet += 1
        }
    }
}