package cn.vans.com.db.importExcels;

import java.text.MessageFormat;

public class ImportDataStructure {


    public static  final  String USER_TABLES="select TABLE_NAME ,TABLE_COMMENT from information_schema.tables where table_schema={0} and table_type='base table'";



    public static  final  String COL_INFOS="select TABLE_NAME ,COLUMN_NAME ,IS_NULLABLE ,COLUMN_TYPE,COLUMN_COMMENT from information_schema.columns where table_schema={0} ";


    public static void  main(String[] args){


    }


    private static void  importExcel(String dbName){
        String dbTableSql = MessageFormat.format(USER_TABLES, dbName);

        String dbColSql=MessageFormat.format(COL_INFOS,dbName);



    }
}
