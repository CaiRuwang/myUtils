package cn.vans.com.excel;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static  void main(String [] args) throws IOException, InvalidFormatException {
        List<Staff> staffs = new ArrayList<Staff>();

        Staff s1 = new Staff("张三", "10", "男");
        staffs.add(s1);

        Staff s2 = new Staff("李四", "10", "男");
        staffs.add(s2);

        Staff s3 = new Staff("王五", "10", "男");
        staffs.add(s3);

        String srcFilePath = "/Users/cairuwang/java/githubCode/myUtils/src/main/resources/templates/aa.xlsx";
        String templateFiles = "/Users/cairuwang/java/githubCode/myUtils/src/main/resources/templates/excelTemplates.xlsx";
        Map<String, List<Staff>> beanParams = new HashMap<String, List<Staff>>();
        beanParams.put("staffs", staffs);

        XLSTransformer former = new XLSTransformer();
        former.transformXLS(templateFiles, beanParams, srcFilePath);

        System.out.println("the end !!!");
    }
}
