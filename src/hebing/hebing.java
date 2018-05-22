package hebing;

import java.io.*;

public class hebing {
        public static void main(String[] args) {
            //FileReader fr = null;
            FileWriter fw = null;
            int n = 444 ;


            try {
                //循环将多个txt文件复制到目标文件中
                for(int i=0;i<=n;i++) {
                    //fr = new FileReader("D:\\Test1\\"+i+".txt");//要复制的文件
                    BufferedReader fr = new BufferedReader(new FileReader("D:\\Test1\\"+i+".txt"));
                    fw = new FileWriter("D:\\1.txt",true);//所保存的文件位置，true代表不是覆盖操作
                    int j=0;
                    String b= null;
                    while (j<10&&(b=fr.readLine())!=null) {
                        j++;
                        fw.write(i+" "+b+"\r\n") ;
                        fw.flush() ;
                    }
                }
            }catch(Exception e) {
                e.getMessage();
                e.printStackTrace();
            }finally {
                try {
                    //fr.close();
                    fw.close();
                } catch(IOException e) {
                    e.getMessage();
                    e.printStackTrace();
                }
            }

        }
    }