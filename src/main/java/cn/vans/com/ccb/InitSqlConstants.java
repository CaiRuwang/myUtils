package cn.vans.com.ccb;

import cn.vans.com.ccb.excel.CcbModel;
import cn.vans.com.ccb.excel.ExcelImportUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.MessageFormat;
import java.util.List;

public class InitSqlConstants {


    public static final  String   SQL_INSTANTS="INSERT INTO" +
            " cfg_dyn_field_info " +
            "(table_name, field_code, is_quote_field, input_owner, field_name, is_custom, " +
            "is_required, is_can_edit, input_type, input_max_length, input_id," +
            " input_class, modaldialog_code, dict_code, is_deleted, create_user_id,  create_time,  computal_formulas)" +
            "VALUES({0},{1},{2},{3},{4},{5}," +
            "{6},{7},{8},{9},{10}," +
            "{11},{12},{13},'0',0,sysdate(),{14});";

    public static void main(String args[]) throws Exception {
        String filePath="/Users/cairuwang/work/ebs_project/建行/dynFiledInit.xlsx";
        ExcelImportUtils utils = new ExcelImportUtils();
        List<CcbModel> excelData = utils.getExcelData(filePath, CcbModel.class, 0);
        for( CcbModel model  :excelData){
            String messageFormat=MessageFormat.format(SQL_INSTANTS,new Object[]{
                    parse(model.getTableName()) ,parse(model.getFieldCode()),parse(model.getIsQuoteField()),parse(model.getInputOwner()),parse(model.getFieldName()),parse(model.getIsCustom()),
                    parse(model.getIsRequired()),parse(model.getIsCanEdit()),parse(model.getInputStyle()),parse(model.getInputMaxLength()),parse(model.getInputId()),
                    parse(model.getInputClass()),parse(model.getModaldialogCode()),parse(model.getDictCode()),parse(model.getComputalFormulas())
            });
            System.out.println(messageFormat);
        }

    }


    public  static String parse(String  orgStr){
        String a=orgStr;
      if(StringUtils.isEmpty(orgStr)) {
          return  "NULL";
      }else{

          if(orgStr.indexOf(".")>0){
              a=orgStr.replace(".0","");
//              System.out.println(orgStr);
//              String[] split = orgStr.split(".");
//              System.out.println("length:"+split.length);
//              for(String s :split){
//                  System.out.println(s);
//
//              }
          }
      }
        return "'"+a+"'";
    }
}
