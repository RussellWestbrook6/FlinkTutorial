package chapter02;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

/**
 * @Author Wanghuixin
 * @Description
 * @Date：Created in 16:36 2022/6/9
 * @Modified By：
 */
public class BatchWordCount {
    public static void main(String[] args) throws Exception{
        //创建批处理执行环境
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        DataSource<String> lineDS = env.readTextFile("E:\\ideaProject\\FlinkTutorial\\src\\main\\resources\\words.txt");

        env.execute();
    }
}
