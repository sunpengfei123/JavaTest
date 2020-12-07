package staticTest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class TxtTest {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\孙鹏飞\\Documents\\study\\result_1203\\";

        String name = "-20201203.txt";

        String result = "re.xls";


        int qi = 2;
        int mo = 48;

        for(int j = qi; j<mo+1; j++){
            BufferedReader bfr = new BufferedReader(new FileReader(path+j+name));

            Stream<String> ss = bfr.lines();
            Iterator<String> is = ss.iterator();
            List<String> ls = new ArrayList<>();
            while (is.hasNext()) {
                String s = is.next();
                ls.add(s);
//                System.out.println(s);
            }
//            System.out.println();

            String target = ls.get(ls.size() -3);

            bfr.close();

            String[] st = target.split("\t");

            String m = st[1].split("m")[0];

            String zheng = st[1].split("m")[1].split("s")[0].split("\\.")[0];

            String xiao = st[1].split("m")[1].split("s")[0].split("\\.")[1];

            float t = zhengshu(m)+zhengshu(zheng)/60+xiaoshu(xiao)/60;

            //写入结果
            if (j == qi) {
                // 首次运行创建比较结果表
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("compare result");
                HSSFRow row = sheet.createRow(0);// 创建第一行
                /**
                 * 我们知道课程表第一行是代表周一到周五,下面我们用两种方式创建Cell 一种用变量，另一种未用变量,用变量的好处后面可以体会到??。
                 * 首行，给出每列变量的意义
                 *
                 */
                HSSFCell cell = row.createCell(0);
                cell.setCellValue("编号");
                sheet.setColumnWidth(0, 20 * 256);// 设置第一列的宽度是10个字符宽度
                row.createCell(1).setCellValue("Time");
                sheet.setColumnWidth(1, 10 * 256);// 设置第二列的宽度是10个字符宽度

                HSSFRow row_m = sheet.createRow(j-qi + 1);
                row_m.createCell(0).setCellValue(j);
                row_m.createCell(1).setCellValue(t);

                FileOutputStream out = new FileOutputStream(path + "\\"+result);
                workbook.write(out);
                out.close();
                workbook.close();
            } else {
                // 后续运行直接读入比较结果表，然后修改
                FileInputStream excelFileInputStream = new FileInputStream(path + "\\"+result);
                // 取出文件准备修改
                HSSFWorkbook workbook = new HSSFWorkbook(excelFileInputStream);
                excelFileInputStream.close();

                // XSSFSheet 代表 Excel 文件中的一张表格
                // 我们通过 getSheetAt(0) 指定表格索引来获取对应表格
                // 注意表格索引从 0 开始！
                HSSFSheet sheet = workbook.getSheetAt(0);

                HSSFRow row_m = sheet.createRow(j-qi + 1);
                row_m.createCell(0).setCellValue(j);
                row_m.createCell(1).setCellValue(t);

                FileOutputStream out = new FileOutputStream(path + "\\"+result);
                workbook.write(out);
                out.close();
                workbook.close();
            }
        }


    }

    public static int zhengshu(String s){
        int l = s.length();
        int re = 0;
        for(int i = l -1; i>=0; i--){
            re+=(s.charAt(i)-'0')*Math.pow(10,l-1-i);
        }

        return re;
    }

    public static float xiaoshu(String s){
        int l = s.length();
        float re = 0;
        for(int i = 0; i<l; i++){
            re+=(float)(s.charAt(i)-'0')*Math.pow(10,-(i+1));
        }
        return re;
    }
}
