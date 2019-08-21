import com.wuhan.dao.TestDao;
import com.wuhan.domain.Iteams;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Test01 {

    @Test
    public void test02() throws IOException {

        InputStream   resourceAsStream = Resources.getResourceAsStream ("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory  sqlSessionFactory = new SqlSessionFactoryBuilder ().build (resourceAsStream);
        //获得session回话对象
        SqlSession  sqlSession = sqlSessionFactory.openSession (true);
        TestDao mapper = sqlSession.getMapper (TestDao.class);
        List<Iteams> all = mapper.findAll ();
        for (Iteams test : all) {
            System.out.println (test);
        }


    }


}
